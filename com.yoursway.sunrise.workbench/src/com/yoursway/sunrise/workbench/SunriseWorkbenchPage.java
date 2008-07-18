package com.yoursway.sunrise.workbench;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.dynamichelpers.IExtensionTracker;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.INavigationHistory;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IReusableEditor;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.internal.EditorAreaHelper;
import org.eclipse.ui.internal.EditorManager;
import org.eclipse.ui.internal.PartService;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.PerspectiveHelper;
import org.eclipse.ui.internal.ViewFactory;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;

@SuppressWarnings("restriction")
public class SunriseWorkbenchPage extends WorkbenchPage {

    private SunriseEditorPresentation editorPresentation;
    
    private PerspectiveHelper perspectivePresentation;

    private SunriseViewManager sunriseViewManager;

    public SunriseWorkbenchPage(WorkbenchWindow w, IAdaptable input) throws WorkbenchException {
        super(w, input);
//        init(w, null, input);
    }

    public SunriseWorkbenchPage(WorkbenchWindow w, String layoutID, IAdaptable input)
            throws WorkbenchException {
        super(w, layoutID, input);
//        init(w, layoutID, input);
    }
    
//    private void init(WorkbenchWindow w, String layoutID, IAdaptable input) {
//        editorPresentation = new SunriseEditorPresentation(this);
//    }
    
//    public EditorAreaHelper getEditorPresentation() {
//        return editorPresentation;
//    }
//    
//    public PerspectiveHelper getPerspectivePresentation() {
//        return perspectivePresentation;
//    }

    @Override
    public void activate(IWorkbenchPart part) {
        super.activate(part);
    }

    @Override
    public void addFastView(IViewReference ref) {
        super.addFastView(ref);
    }

    @Override
    public void addPartListener(IPartListener l) {
        super.addPartListener(l);
    }

    @Override
    public void addPartListener(IPartListener2 l) {
        super.addPartListener(l);
    }

    @Override
    protected void addPerspective(Perspective persp) {
        super.addPerspective(persp);
    }

    @Override
    public void addPostSelectionListener(ISelectionListener listener) {
        super.addPostSelectionListener(listener);
    }

    @Override
    public void addPostSelectionListener(String partId, ISelectionListener listener) {
        super.addPostSelectionListener(partId, listener);
    }

    @Override
    public void addPropertyChangeListener(IPropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
    }

    @Override
    public void addSelectionListener(ISelectionListener listener) {
        super.addSelectionListener(listener);
    }

    @Override
    public void addSelectionListener(String partId, ISelectionListener listener) {
        super.addSelectionListener(partId, listener);
    }

    @Override
    public void attachView(IViewReference ref) {
        super.attachView(ref);
    }

    @Override
    public void bringToTop(IWorkbenchPart part) {
        super.bringToTop(part);
    }

    @Override
    protected IEditorPart busyOpenEditorBatched(IEditorInput input, String editorID, boolean activate,
            int matchFlags, IMemento editorState) throws PartInitException {
        return super.busyOpenEditorBatched(input, editorID, activate, matchFlags, editorState);
    }

    @Override
    protected IViewPart busyShowView(String viewID, String secondaryID, int mode) throws PartInitException {
        return super.busyShowView(viewID, secondaryID, mode);
    }

    @Override
    public boolean close() {
        return super.close();
    }

    @Override
    public boolean closeAllEditors(boolean save) {
        return super.closeAllEditors(save);
    }

    @Override
    public void closeAllPerspectives(boolean saveEditors, boolean closePage) {
        super.closeAllPerspectives(saveEditors, closePage);
    }

    @Override
    public boolean closeAllSavedEditors() {
        return super.closeAllSavedEditors();
    }

    @Override
    public boolean closeEditor(IEditorPart editor, boolean save) {
        return super.closeEditor(editor, save);
    }

    @Override
    public boolean closeEditor(IEditorReference editorRef, boolean save) {
        return super.closeEditor(editorRef, save);
    }

    @Override
    public boolean closeEditors(IEditorReference[] refArray, boolean save) {
        return super.closeEditors(refArray, save);
    }

    @Override
    public void closePerspective(IPerspectiveDescriptor desc, boolean saveParts, boolean closePage) {
        super.closePerspective(desc, saveParts, closePage);
    }

    @Override
    public void closePerspective(IPerspectiveDescriptor desc, IPerspectiveDescriptor descToActivate,
            boolean saveParts, boolean closePage) {
        super.closePerspective(desc, descToActivate, saveParts, closePage);
    }

    @Override
    public void detachView(IViewReference ref) {
        super.detachView(ref);
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public boolean editActionSets() {
        return super.editActionSets();
    }

    @Override
    public IEditorPart findEditor(IEditorInput input) {
        return super.findEditor(input);
    }

    @Override
    public IEditorReference[] findEditors(IEditorInput input, String editorId, int matchFlags) {
        return super.findEditors(input, editorId, matchFlags);
    }

    @Override
    public Perspective findPerspective(IPerspectiveDescriptor desc) {
        return super.findPerspective(desc);
    }

    @Override
    public IViewPart findView(String id) {
        return super.findView(id);
    }

    @Override
    public IViewReference findViewReference(String viewId, String secondaryId) {
        return super.findViewReference(viewId, secondaryId);
    }

    @Override
    public IViewReference findViewReference(String viewId) {
        return super.findViewReference(viewId);
    }

    @Override
    public IActionBars getActionBars() {
        return super.getActionBars();
    }

    @Override
    public IActionSetDescriptor[] getActionSets() {
        return super.getActionSets();
    }

    @Override
    public IEditorPart getActiveEditor() {
        return super.getActiveEditor();
    }

    @Override
    public IEditorReference getActiveEditorReference() {
        return super.getActiveEditorReference();
    }

    @Override
    public IViewReference getActiveFastView() {
        return super.getActiveFastView();
    }

    @Override
    public IWorkbenchPart getActivePart() {
        return super.getActivePart();
    }

    @Override
    public IWorkbenchPartReference getActivePartReference() {
        return super.getActivePartReference();
    }

    @Override
    public Perspective getActivePerspective() {
        return super.getActivePerspective();
    }

    @Override
    public IWorkingSet getAggregateWorkingSet() {
        return super.getAggregateWorkingSet();
    }

    @Override
    public Composite getClientComposite() {
        return super.getClientComposite();
    }

    @Override
    public IEditorPart[] getDirtyEditors() {
        return super.getDirtyEditors();
    }

    @Override
    public ISaveablePart[] getDirtyParts() {
        return super.getDirtyParts();
    }

    @Override
    public EditorManager getEditorManager() {
        return super.getEditorManager();
    }

    @Override
    public IEditorReference[] getEditorReferences() {
        return super.getEditorReferences();
    }

    @Override
    public int getEditorReuseThreshold() {
        return super.getEditorReuseThreshold();
    }

    @Override
    public IEditorPart[] getEditors() {
        return super.getEditors();
    }

    @Override
    public IExtensionTracker getExtensionTracker() {
        return super.getExtensionTracker();
    }

    @Override
    public IViewReference[] getFastViews() {
        return super.getFastViews();
    }

    @Override
    public IAdaptable getInput() {
        return super.getInput();
    }

    @Override
    public String getLabel() {
        return super.getLabel();
    }

    @Override
    public INavigationHistory getNavigationHistory() {
        return super.getNavigationHistory();
    }

    @Override
    public String[] getNewWizardShortcuts() {
        return super.getNewWizardShortcuts();
    }

    @Override
    public IPerspectiveDescriptor[] getOpenPerspectives() {
        return super.getOpenPerspectives();
    }

    @Override
    public PartService getPartService() {
        return super.getPartService();
    }

    @Override
    public int getPartState(IWorkbenchPartReference ref) {
        return super.getPartState(ref);
    }

    @Override
    public IPerspectiveDescriptor getPerspective() {
        return super.getPerspective();
    }

    @Override
    public String[] getPerspectiveShortcuts() {
        return super.getPerspectiveShortcuts();
    }

    @Override
    public IWorkbenchPartReference getReference(IWorkbenchPart part) {
        return super.getReference(part);
    }

    @Override
    public ISelection getSelection() {
        return super.getSelection();
    }

    @Override
    public ISelection getSelection(String partId) {
        return super.getSelection(partId);
    }

    @Override
    public ArrayList getShowInPartIds() {
        return super.getShowInPartIds();
    }

    @Override
    public String[] getShowViewShortcuts() {
        return super.getShowViewShortcuts();
    }

    @Override
    public IEditorReference[] getSortedEditors() {
        return super.getSortedEditors();
    }

    @Override
    public IWorkbenchPartReference[] getSortedParts() {
        return super.getSortedParts();
    }

    @Override
    public IPerspectiveDescriptor[] getSortedPerspectives() {
        return super.getSortedPerspectives();
    }

    @Override
    public ViewFactory getViewFactory() {
        return super.getViewFactory();
    }

    @Override
    public IViewReference[] getViewReferences() {
        return super.getViewReferences();
    }

    @Override
    public IViewPart[] getViews() {
        return super.getViews();
    }

    @Override
    public IViewPart[] getViewStack(IViewPart part) {
        return super.getViewStack(part);
    }

    @Override
    public IWorkbenchWindow getWorkbenchWindow() {
        return super.getWorkbenchWindow();
    }

    @Override
    public IWorkingSet getWorkingSet() {
        return super.getWorkingSet();
    }

    @Override
    public IWorkingSet[] getWorkingSets() {
        return super.getWorkingSets();
    }

    @Override
    public void hideActionSet(String actionSetID) {
        super.hideActionSet(actionSetID);
    }

    @Override
    public void hideFastView() {
        super.hideFastView();
    }

    @Override
    public void hideView(IViewPart view) {
        super.hideView(view);
    }

    @Override
    public void hideView(IViewReference ref) {
        super.hideView(ref);
    }

    @Override
    public boolean isCloseable(IViewReference ref) {
        return super.isCloseable(ref);
    }

    @Override
    public boolean isEditorAreaVisible() {
        return super.isEditorAreaVisible();
    }

    @Override
    public boolean isEditorPinned(IEditorPart editor) {
        return super.isEditorPinned(editor);
    }

    @Override
    public boolean isFastView(IViewReference ref) {
        return super.isFastView(ref);
    }

    @Override
    public boolean isFixedLayout() {
        return super.isFixedLayout();
    }

    @Override
    public boolean isMoveable(IViewReference ref) {
        return super.isMoveable(ref);
    }

    @Override
    public boolean isPageZoomed() {
        return super.isPageZoomed();
    }

    @Override
    public boolean isPartVisible(IWorkbenchPart part) {
        return super.isPartVisible(part);
    }

    @Override
    public boolean isPartVisible(IWorkbenchPartReference reference) {
        return super.isPartVisible(reference);
    }

    @Override
    protected boolean isSaveNeeded() {
        return super.isSaveNeeded();
    }

    @Override
    public boolean isZoomed() {
        return super.isZoomed();
    }

    @Override
    public void makeFastView(IViewReference ref) {
        super.makeFastView(ref);
    }

    @Override
    protected void onActivate() {
        super.onActivate();
        Composite clientComposite = getClientComposite();
        
        Composite windowComposite = clientComposite.getParent();
        
        Composite falseWitness = new Composite(windowComposite, SWT.NONE);
        falseWitness.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        falseWitness.setLayout(new GridLayout(2, false));
        ((StackLayout) windowComposite.getLayout()).topControl = falseWitness;
        
        clientComposite.setParent(falseWitness);
        clientComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        clientComposite.setBackground(new Color(null, 255, 0, 0));
        clientComposite.setData(this);
        
        sunriseViewManager = new SunriseViewManager(falseWitness);
        
    }
    
    public SunriseViewManager getSunriseViewManager() {
        return sunriseViewManager;
    }

    @Override
    protected void onDeactivate() {
        super.onDeactivate();
    }

    @Override
    public IEditorPart openEditor(IEditorInput input, String editorID, boolean activate, int matchFlags,
            IMemento editorState) throws PartInitException {
        return super.openEditor(input, editorID, activate, matchFlags, editorState);
    }

    @Override
    public IEditorPart openEditor(IEditorInput input, String editorID, boolean activate, int matchFlags)
            throws PartInitException {
        return super.openEditor(input, editorID, activate, matchFlags);
    }

    @Override
    public IEditorPart openEditor(IEditorInput input, String editorID, boolean activate)
            throws PartInitException {
        return super.openEditor(input, editorID, activate);
    }

    @Override
    public IEditorPart openEditor(IEditorInput input, String editorID) throws PartInitException {
        return super.openEditor(input, editorID);
    }

    @Override
    public IEditorPart openEditorFromDescriptor(IEditorInput input, IEditorDescriptor editorDescriptor,
            boolean activate, IMemento editorState) throws PartInitException {
        return super.openEditorFromDescriptor(input, editorDescriptor, activate, editorState);
    }

    @Override
    public void openEmptyTab() {
        super.openEmptyTab();
    }

    @Override
    public void openPerspectiveExtras() {
        super.openPerspectiveExtras();
    }

    @Override
    public void performedShowIn(String partId) {
        super.performedShowIn(partId);
    }

    @Override
    public void removeFastView(IViewReference ref) {
        super.removeFastView(ref);
    }

    @Override
    public void removePartListener(IPartListener l) {
        super.removePartListener(l);
    }

    @Override
    public void removePartListener(IPartListener2 l) {
        super.removePartListener(l);
    }

    @Override
    public void removePostSelectionListener(ISelectionListener listener) {
        super.removePostSelectionListener(listener);
    }

    @Override
    public void removePostSelectionListener(String partId, ISelectionListener listener) {
        super.removePostSelectionListener(partId, listener);
    }

    @Override
    public void removePropertyChangeListener(IPropertyChangeListener listener) {
        super.removePropertyChangeListener(listener);
    }

    @Override
    public void removeSelectionListener(ISelectionListener listener) {
        super.removeSelectionListener(listener);
    }

    @Override
    public void removeSelectionListener(String partId, ISelectionListener listener) {
        super.removeSelectionListener(partId, listener);
    }

    @Override
    public void requestActivation(IWorkbenchPart part) {
        super.requestActivation(part);
    }

    @Override
    public void resetPerspective() {
        super.resetPerspective();
    }

    @Override
    protected void resetToolBarLayout() {
        super.resetToolBarLayout();
    }

    @Override
    public void resizeView(IViewPart part, int width, int height) {
        super.resizeView(part, width, height);
    }

    @Override
    public IStatus restoreState(IMemento memento, IPerspectiveDescriptor activeDescriptor) {
        return super.restoreState(memento, activeDescriptor);
    }

    @Override
    public void reuseEditor(IReusableEditor editor, IEditorInput input) {
        super.reuseEditor(editor, input);
    }

    @Override
    public boolean saveAllEditors(boolean confirm, boolean addNonPartSources) {
        return super.saveAllEditors(confirm, addNonPartSources);
    }

    @Override
    public boolean saveAllEditors(boolean confirm) {
        return super.saveAllEditors(confirm);
    }

    @Override
    public boolean saveEditor(IEditorPart editor, boolean confirm) {
        return super.saveEditor(editor, confirm);
    }

    @Override
    protected boolean savePart(ISaveablePart saveable, IWorkbenchPart part, boolean confirm) {
        return super.savePart(saveable, part, confirm);
    }

    @Override
    public void savePerspective() {
        super.savePerspective();
    }

    @Override
    public void savePerspectiveAs(IPerspectiveDescriptor newDesc) {
        super.savePerspectiveAs(newDesc);
    }

    @Override
    public IStatus saveState(IMemento memento) {
        return super.saveState(memento);
    }

    @Override
    public void setEditorAreaVisible(boolean showEditorArea) {
        super.setEditorAreaVisible(showEditorArea);
    }

    @Override
    public void setEditorReuseThreshold(int openEditors) {
        super.setEditorReuseThreshold(openEditors);
    }

    @Override
    public void setPartState(IWorkbenchPartReference ref, int state) {
        super.setPartState(ref, state);
    }

    @Override
    public void setPerspective(IPerspectiveDescriptor desc) {
        super.setPerspective(desc);
    }

    @Override
    public void setState(IWorkbenchPartReference ref, int newState) {
        super.setState(ref, newState);
    }

    @Override
    public void setWorkingSet(IWorkingSet newWorkingSet) {
        super.setWorkingSet(newWorkingSet);
    }

    @Override
    public void setWorkingSets(IWorkingSet[] newWorkingSets) {
        super.setWorkingSets(newWorkingSets);
    }

    @Override
    public void showActionSet(String actionSetID) {
        super.showActionSet(actionSetID);
    }

    @Override
    protected void showEditor(boolean activate, IEditorPart editor) {
        super.showEditor(activate, editor);
    }

    @Override
    public IViewPart showView(String viewID, String secondaryID, int mode) throws PartInitException {
        return super.showView(viewID, secondaryID, mode);
    }

    @Override
    public IViewPart showView(String viewID) throws PartInitException {
        return super.showView(viewID);
    }

    @Override
    public void sortShowInPartIds(ArrayList partIds) {
        super.sortShowInPartIds(partIds);
    }

    @Override
    public void testInvariants() {
        super.testInvariants();
    }

    @Override
    public void toggleFastView(IViewReference ref) {
        super.toggleFastView(ref);
    }

    @Override
    public void toggleZoom(IWorkbenchPartReference ref) {
        super.toggleZoom(ref);
    }

    @Override
    public void unzoomAllPerspectives() {
        super.unzoomAllPerspectives();
    }

    @Override
    public void updateActionBars() {
        super.updateActionBars();
    }

    @Override
    public void zoomOut() {
        super.zoomOut();
    }
    
    
    
}
