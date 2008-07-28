package com.yoursway.sunrise.completion;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.jdt.internal.ui.javaeditor.CompilationUnitEditor;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.AbstractTextEditor;

@SuppressWarnings("restriction")
public class SunriseCompletionLoader implements IStartup {

    private IWorkbench workbench;
    private IWorkbenchWindow window;
    private IWorkbenchPage page;
    private IEditorPart editor;

    public void earlyStartup() {
        workbench = PlatformUI.getWorkbench();
        workbench.addWindowListener(new IWindowListener() {

            public void windowActivated(IWorkbenchWindow window) {
                updateActiveWindow();
            }

            public void windowClosed(IWorkbenchWindow window) {
            }

            public void windowDeactivated(IWorkbenchWindow window) {
            }

            public void windowOpened(IWorkbenchWindow window) {
                updateActiveWindow();
            }
            
        });
        updateActiveWindow();
    }

    protected void updateActiveWindow() {
        window = workbench.getActiveWorkbenchWindow();
        window.addPageListener(new IPageListener() {

            public void pageActivated(IWorkbenchPage page) {
                updateActivePage();
            }

            public void pageClosed(IWorkbenchPage page) {
            }

            public void pageOpened(IWorkbenchPage page) {
            }
            
        });
        updateActivePage();
    }

    protected void updateActivePage() {
        page = window.getActivePage();
        page.addPartListener(new IPartListener2() {

            public void partActivated(IWorkbenchPartReference partRef) {
                updateActiveEditor();
            }

            public void partBroughtToTop(IWorkbenchPartReference partRef) {
            }

            public void partClosed(IWorkbenchPartReference partRef) {
            }

            public void partDeactivated(IWorkbenchPartReference partRef) {
            }

            public void partHidden(IWorkbenchPartReference partRef) {
            }

            public void partInputChanged(IWorkbenchPartReference partRef) {
            }

            public void partOpened(IWorkbenchPartReference partRef) {
                updateActiveEditor();
            }

            public void partVisible(IWorkbenchPartReference partRef) {
            }
            
        });
    }

    protected void updateActiveEditor() {
        editor = page.getActiveEditor();
        if (editor instanceof CompilationUnitEditor)
            hookEditor((CompilationUnitEditor) editor);
    }

    private void hookEditor(CompilationUnitEditor editor) {
        SourceViewer viewer = getSourceViewer(editor);
        IContentAssistant assistant = getContentAssistant(viewer);
        if (assistant instanceof SunriseContentAssistant)
            return;
        if (assistant == null) {
            System.out.println("Old assistant is null, very very bad");
            return;
        }
        if (assistant instanceof ContentAssistant) {
            System.out.println("Installing completion on " + editor.getEditorInput());
            ContentAssistant jfaceAssistant = (ContentAssistant) assistant;
            Map<String, IContentAssistProcessor> processors = getProcessors(jfaceAssistant);
            SunriseContentAssistant newAssistant = new SunriseContentAssistant(processors, jfaceAssistant
                    .getDocumentPartitioning());
            assistant.uninstall();
            setContentAssistant(viewer, newAssistant);
            newAssistant.install(viewer);
        } else {
            System.out.println("Wrong type of assistant - NOT installed");
        }
    }

    private IContentAssistant getContentAssistant(SourceViewer viewer) throws AssertionError {
        try {
            Field field = SourceViewer.class.getDeclaredField("fContentAssistant");
            field.setAccessible(true);
            return (IContentAssistant) field.get(viewer);
        } catch (SecurityException e) {
            throw new AssertionError(e);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
    
    private void setContentAssistant(SourceViewer viewer, IContentAssistant assistant) throws AssertionError {
        try {
            Field field = SourceViewer.class.getDeclaredField("fContentAssistant");
            field.setAccessible(true);
            field.set(viewer, assistant);
        } catch (SecurityException e) {
            throw new AssertionError(e);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    private SourceViewer getSourceViewer(AbstractTextEditor editor) {
        try {
            Method method = AbstractTextEditor.class.getDeclaredMethod("getSourceViewer");
            method.setAccessible(true);
            return (SourceViewer) method.invoke(editor);
        } catch (SecurityException e) {
            throw new AssertionError(e);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    private Map<String, IContentAssistProcessor> getProcessors(ContentAssistant assistant) {
        try {
            Field field = ContentAssistant.class.getDeclaredField("fProcessors");
            field.setAccessible(true);
            return (Map<String, IContentAssistProcessor>) field.get(assistant);
        } catch (SecurityException e) {
            throw new AssertionError(e);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
    
}
