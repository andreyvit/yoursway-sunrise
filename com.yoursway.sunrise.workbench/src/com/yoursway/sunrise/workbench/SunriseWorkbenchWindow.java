package com.yoursway.sunrise.workbench;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.dynamichelpers.IExtensionTracker;
import org.eclipse.jface.action.CoolBarManager;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.internal.ActionPresentation;
import org.eclipse.ui.internal.FastViewBar;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.PerspectiveBarManager;
import org.eclipse.ui.internal.WWinActionBars;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.internal.dialogs.CustomizePerspectiveDialog;
import org.eclipse.ui.internal.layout.ITrimManager;
import org.eclipse.ui.internal.layout.IWindowTrim;
import org.eclipse.ui.internal.layout.TrimLayout;
import org.eclipse.ui.internal.progress.ProgressRegion;
import org.eclipse.ui.internal.provisional.application.IActionBarConfigurer2;
import org.eclipse.ui.internal.provisional.presentations.IActionBarPresentationFactory;

@SuppressWarnings("restriction")
public class SunriseWorkbenchWindow extends WorkbenchWindow {

    public SunriseWorkbenchWindow(int number) {
        super(number);
    }

    @Override
    public void addPageListener(IPageListener l) {
        super.addPageListener(l);
    }

    @Override
    protected void addPerspectiveBar(int style) {
        super.addPerspectiveBar(style);
    }

    @Override
    public void addPerspectiveListener(IPerspectiveListener l) {
        super.addPerspectiveListener(l);
    }
//
//    public void addPerspectiveReorderListener(IReorderListener listener) {
//        super.addPerspectiveReorderListener(listener);
//    }

    @Override
    public void addPropertyChangeListener(IPropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
    }

    @Override
    public void addSubmenu(int type) {
        super.addSubmenu(type);
    }

    @Override
    public void addToTrim(IWindowTrim trim, int side) {
        super.addToTrim(trim, side);
    }

    @Override
    protected IWorkbenchPage busyOpenPage(String perspID, IAdaptable input) throws WorkbenchException {
        return super.busyOpenPage(perspID, input);
    }

    @Override
    protected boolean canHandleShellCloseEvent() {
        return super.canHandleShellCloseEvent();
    }

    @Override
    public boolean close() {
        return super.close();
    }

    @Override
    public void closeAllPages(boolean save) {
        super.closeAllPages(save);
    }

    @Override
    protected boolean closePage(IWorkbenchPage in, boolean save) {
        return super.closePage(in, save);
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
    }

    @Override
    protected void constrainShellSize() {
        super.constrainShellSize();
    }

    @Override
    public boolean containsSubmenu(int type) {
        return super.containsSubmenu(type);
    }

    @Override
    protected Control createContents(Composite parent) {
        Control result = super.createContents(parent);
//        Text text = new Text(parent, SWT.SINGLE | SWT.BORDER);
//        ((TrimLayout) parent.getLayout()).addTrim(SWT.LEFT, new SrTrim(text));
//        text.setText("Foo");
//        text.moveAbove(null);
//        text.setSize(150, 50);
//        text.setLocation(200, 200);
        return result;
    }

    @Override
    protected ICoolBarManager createCoolBarManager2(int style) {
        return super.createCoolBarManager2(style);
    }

    @Override
    public CustomizePerspectiveDialog createCustomizePerspectiveDialog(Perspective persp) {
        return super.createCustomizePerspectiveDialog(persp);
    }

    @Override
    protected void createDefaultContents(Shell shell) {
        super.createDefaultContents(shell);
    }

    @Override
    protected MenuManager createMenuManager() {
        return super.createMenuManager();
    }

    @Override
    protected Composite createPageComposite(Composite parent) {
        return super.createPageComposite(parent);
    }

    @Override
    protected void createStatusLine(Shell shell) {
        super.createStatusLine(shell);
    }

    @Override
    protected StatusLineManager createStatusLineManager() {
        return super.createStatusLineManager();
    }

    @Override
    protected IToolBarManager createToolBarManager2(int style) {
        return super.createToolBarManager2(style);
    }

    @Override
    protected void createTrimWidgets(Shell shell) {
        super.createTrimWidgets(shell);
    }

    @Override
    public void fillActionBars(IActionBarConfigurer2 proxyBars, int flags) {
        super.fillActionBars(proxyBars, flags);
    }

    @Override
    public void fillActionBars(int flags) {
        super.fillActionBars(flags);
    }

    @Override
    public void firePerspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective,
            IWorkbenchPartReference partRef, String changeId) {
        super.firePerspectiveChanged(page, perspective, partRef, changeId);
    }

    @Override
    public void firePerspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective,
            String changeId) {
        super.firePerspectiveChanged(page, perspective, changeId);
    }

    @Override
    public IActionBarPresentationFactory getActionBarPresentationFactory() {
        return super.getActionBarPresentationFactory();
    }

    @Override
    public WWinActionBars getActionBars() {
        return super.getActionBars();
    }

    @Override
    public ActionPresentation getActionPresentation() {
        return super.getActionPresentation();
    }

    @Override
    public IWorkbenchPage getActivePage() {
        return super.getActivePage();
    }

    @Override
    public boolean getCoolBarVisible() {
        return super.getCoolBarVisible();
    }

    @Override
    public IExtensionTracker getExtensionTracker() {
        return super.getExtensionTracker();
    }

    @Override
    public FastViewBar getFastViewBar() {
        return super.getFastViewBar();
    }

    @Override
    public boolean getFastViewBarVisible() {
        return super.getFastViewBarVisible();
    }

    @Override
    protected Point getInitialLocation(Point size) {
        return super.getInitialLocation(size);
    }

    @Override
    protected Point getInitialSize() {
        return super.getInitialSize();
    }

    @Override
    protected Layout getLayout() {
        return super.getLayout();
    }

    @Override
    public MenuManager getMenuManager() {
        return super.getMenuManager();
    }

    @Override
    public int getNumber() {
        return super.getNumber();
    }

    @Override
    protected Composite getPageComposite() {
        return super.getPageComposite();
    }

    @Override
    public IWorkbenchPage[] getPages() {
        return super.getPages();
    }

    @Override
    public IPartService getPartService() {
        return super.getPartService();
    }

    @Override
    public PerspectiveBarManager getPerspectiveBar() {
        return super.getPerspectiveBar();
    }

    @Override
    public boolean getPerspectiveBarVisible() {
        return super.getPerspectiveBarVisible();
    }

    @Override
    public ProgressRegion getProgressRegion() {
        return super.getProgressRegion();
    }

    @Override
    public ISelectionService getSelectionService() {
        return super.getSelectionService();
    }

    @Override
    public boolean getShellActivated() {
        return super.getShellActivated();
    }

    @Override
    public boolean getShowFastViewBars() {
        return super.getShowFastViewBars();
    }

    @Override
    public StatusLineManager getStatusLineManager() {
        return super.getStatusLineManager();
    }

    @Override
    public boolean getStatusLineVisible() {
        return super.getStatusLineVisible();
    }

    @Override
    public String getToolbarLabel(String actionSetId) {
        return super.getToolbarLabel(actionSetId);
    }

    @Override
    public ITrimManager getTrimManager() {
        return super.getTrimManager();
    }

    @Override
    public IWorkbench getWorkbench() {
        return super.getWorkbench();
    }

    @Override
    protected void initializeBounds() {
        super.initializeBounds();
    }

    @Override
    public boolean isApplicationMenu(String menuID) {
        return super.isApplicationMenu(menuID);
    }

    @Override
    protected boolean isClosing() {
        return super.isClosing();
    }

    @Override
    protected boolean isCoolBarLocked() {
        return super.isCoolBarLocked();
    }

    @Override
    public boolean okToClose() {
        return super.okToClose();
    }

    @Override
    public int open() {
        return super.open();
    }

    @Override
    public IWorkbenchPage openPage(IAdaptable input) throws WorkbenchException {
        return super.openPage(input);
    }

    @Override
    public IWorkbenchPage openPage(String perspId, IAdaptable input) throws WorkbenchException {
        return super.openPage(perspId, input);
    }

    @Override
    protected int perspectiveBarStyle() {
        return super.perspectiveBarStyle();
    }

    @Override
    public void removePageListener(IPageListener l) {
        super.removePageListener(l);
    }

    @Override
    public void removePerspectiveListener(IPerspectiveListener l) {
        super.removePerspectiveListener(l);
    }

    @Override
    public void removePropertyChangeListener(IPropertyChangeListener listener) {
        super.removePropertyChangeListener(listener);
    }

    @Override
    public IStatus restoreState(IMemento memento, IPerspectiveDescriptor activeDescriptor) {
        return super.restoreState(memento, activeDescriptor);
    }

    @Override
    public void run(boolean fork, boolean cancelable, IRunnableWithProgress runnable)
            throws InvocationTargetException, InterruptedException {
        super.run(fork, cancelable, runnable);
    }

    @Override
    public IStatus saveState(IMemento memento) {
        return super.saveState(memento);
    }

    @Override
    public void setActivePage(IWorkbenchPage in) {
        super.setActivePage(in);
    }

    @Override
    public void setBannerCurve(boolean square) {
        super.setBannerCurve(square);
    }

    @Override
    public void setCoolBarVisible(boolean visible) {
        super.setCoolBarVisible(visible);
    }

    @Override
    public void setFastViewBarVisible(boolean visible) {
        super.setFastViewBarVisible(visible);
    }

    @Override
    public void setPerspectiveBarLocation(String location) {
        super.setPerspectiveBarLocation(location);
    }

    @Override
    public void setPerspectiveBarVisible(boolean visible) {
        super.setPerspectiveBarVisible(visible);
    }

    @Override
    public void setStatusLineVisible(boolean visible) {
        super.setStatusLineVisible(visible);
    }

    @Override
    public void showHeapStatus(boolean selection) {
        super.showHeapStatus(selection);
    }

    @Override
    protected boolean showTopSeperator() {
        return super.showTopSeperator();
    }

    @Override
    public void toggleToolbarVisibility() {
        super.toggleToolbarVisibility();
    }

    @Override
    protected boolean toolBarChildrenExist() {
        return super.toolBarChildrenExist();
    }

    @Override
    public void updateActionBars() {
        super.updateActionBars();
    }

    @Override
    public void updateActionSets() {
        super.updateActionSets();
    }

    @Override
    public void updateFastViewBar() {
        super.updateFastViewBar();
    }
    
    // ApplicationWindow methods ------------------------------------------------------------------------

    @Override
    protected void addCoolBar(int style) {
        super.addCoolBar(style);
    }

    @Override
    protected void addMenuBar() {
        super.addMenuBar();
    }

    @Override
    protected void addStatusLine() {
        super.addStatusLine();
    }

    @Override
    protected void addToolBar(int style) {
        super.addToolBar(style);
    }

    @Override
    protected boolean coolBarChildrenExist() {
        return super.coolBarChildrenExist();
    }

    @Override
    protected Control createCoolBarControl(Composite composite) {
        return super.createCoolBarControl(composite);
    }

    @Override
    protected CoolBarManager createCoolBarManager(int style) {
        return super.createCoolBarManager(style);
    }

    @Override
    protected Control createToolBarControl(Composite parent) {
        return super.createToolBarControl(parent);
    }

    @Override
    protected ToolBarManager createToolBarManager(int style) {
        return super.createToolBarManager(style);
    }

    @Override
    protected Control getCoolBarControl() {
        return super.getCoolBarControl();
    }

    @Override
    public CoolBarManager getCoolBarManager() {
        return super.getCoolBarManager();
    }

    @Override
    public ICoolBarManager getCoolBarManager2() {
        return super.getCoolBarManager2();
    }

    @Override
    protected Font getFont() {
        return super.getFont();
    }

    @Override
    public MenuManager getMenuBarManager() {
        return super.getMenuBarManager();
    }

    @Override
    protected Label getSeperator1() {
        return super.getSeperator1();
    }

    @Override
    public String getSymbolicFontName() {
        return super.getSymbolicFontName();
    }

    @Override
    protected Control getToolBarControl() {
        return super.getToolBarControl();
    }

    @Override
    public ToolBarManager getToolBarManager() {
        return super.getToolBarManager();
    }

    @Override
    public IToolBarManager getToolBarManager2() {
        return super.getToolBarManager2();
    }

    @Override
    public void setStatus(String message) {
        super.setStatus(message);
    }
    
}
