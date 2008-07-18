package com.yoursway.sunrise.workbench;

import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.internal.EditorAreaHelper;
import org.eclipse.ui.internal.EditorReference;
import org.eclipse.ui.internal.EditorStack;
import org.eclipse.ui.internal.LayoutPart;

@SuppressWarnings("restriction")
public class SunriseEditorPresentation extends EditorAreaHelper {

    private final SunriseWorkbenchPage page;

    public SunriseEditorPresentation(SunriseWorkbenchPage page) {
        super(page);
        this.page = page;
//        getLayoutPart().dispose();
    }

    @Override
    public void addEditor(EditorReference ref, String workbookId) {
        super.addEditor(ref, workbookId);
    }

    @Override
    public void closeEditor(IEditorPart part) {
        super.closeEditor(part);
    }

    @Override
    public void closeEditor(IEditorReference ref) {
        super.closeEditor(ref);
    }

    @Override
    public void displayEditorList() {
        super.displayEditorList();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public String getActiveEditorWorkbookID() {
        return super.getActiveEditorWorkbookID();
    }

    @Override
    public EditorStack getActiveWorkbook() {
        return super.getActiveWorkbook();
    }

    @Override
    public IEditorReference[] getEditors() {
        return super.getEditors();
    }

    @Override
    public LayoutPart getLayoutPart() {
        return super.getLayoutPart();
    }

    @Override
    public IEditorReference getVisibleEditor() {
        return super.getVisibleEditor();
    }

    @Override
    public EditorStack getWorkbookFromID(String workbookId) {
        return super.getWorkbookFromID(workbookId);
    }

    @Override
    public ArrayList getWorkbooks() {
        return super.getWorkbooks();
    }

    @Override
    public void moveEditor(IEditorPart part, int position) {
        super.moveEditor(part, position);
    }

    @Override
    public IStatus restorePresentationState(IMemento areaMem) {
        return super.restorePresentationState(areaMem);
    }

    @Override
    public IStatus restoreState(IMemento memento) {
        return super.restoreState(memento);
    }

    @Override
    public IStatus saveState(IMemento memento) {
        return super.saveState(memento);
    }

    @Override
    public void setActiveEditorWorkbookFromID(String id) {
        super.setActiveEditorWorkbookFromID(id);
    }

    @Override
    public boolean setVisibleEditor(IEditorReference ref, boolean setFocus) {
        return super.setVisibleEditor(ref, setFocus);
    }

    @Override
    public void updateStackButtons() {
        super.updateStackButtons();
    }
    
}
