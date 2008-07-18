package com.yoursway.sunrise.workbench;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPlaceholderFolderLayout;
import org.eclipse.ui.IViewLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.internal.EditorAreaTrimToolBar;
import org.eclipse.ui.internal.FastViewBar;
import org.eclipse.ui.internal.FastViewManager;
import org.eclipse.ui.internal.ILayoutContainer;
import org.eclipse.ui.internal.IWorkbenchConstants;
import org.eclipse.ui.internal.LayoutPart;
import org.eclipse.ui.internal.PageLayout;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.PerspectiveHelper;
import org.eclipse.ui.internal.StartupThreading;
import org.eclipse.ui.internal.ViewFactory;
import org.eclipse.ui.internal.ViewLayoutRec;
import org.eclipse.ui.internal.ViewPane;
import org.eclipse.ui.internal.ViewSashContainer;
import org.eclipse.ui.internal.ViewSite;
import org.eclipse.ui.internal.ViewStack;
import org.eclipse.ui.internal.WorkbenchMessages;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.WorkbenchPartReference;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.internal.PartPane.Sashes;
import org.eclipse.ui.internal.StartupThreading.StartupRunnable;
import org.eclipse.ui.internal.contexts.ContextAuthority;
import org.eclipse.ui.internal.intro.IIntroConstants;
import org.eclipse.ui.internal.layout.ITrimManager;
import org.eclipse.ui.internal.layout.IWindowTrim;
import org.eclipse.ui.internal.registry.ActionSetRegistry;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;
import org.eclipse.ui.internal.registry.PerspectiveDescriptor;
import org.eclipse.ui.internal.registry.PerspectiveExtensionReader;
import org.eclipse.ui.internal.registry.StickyViewDescriptor;
import org.eclipse.ui.internal.util.PrefUtil;
import org.eclipse.ui.presentations.IStackPresentationSite;
import org.eclipse.ui.views.IStickyViewDescriptor;

@SuppressWarnings("restriction")
public class SunrisePerspective extends Perspective {
    
    private PerspectiveHelper sunrisePresentation;
    
    public SunrisePerspective(PerspectiveDescriptor desc, WorkbenchPage page) throws WorkbenchException {
        super(desc, page);
    }
    
    public SunrisePerspective(WorkbenchPage page) throws WorkbenchException {
        super(page);
    }
    
    @Override
    protected void addActionSet(IActionSetDescriptor newDesc) {
        super.addActionSet(newDesc);
    }
    
    @Override
    protected void addAlwaysOff(IActionSetDescriptor descriptor) {
        super.addAlwaysOff(descriptor);
    }
    
    @Override
    protected void addAlwaysOn(IActionSetDescriptor descriptor) {
        super.addAlwaysOn(descriptor);
    }
    
    @Override
    public void addFastView(IViewReference ref, boolean handleLayout) {
        super.addFastView(ref, handleLayout);
    }
    
    @Override
    public boolean bringToTop(IViewReference ref) {
        return super.bringToTop(ref);
    }
    
    @Override
    public int calcStackSide(Rectangle stackBounds) {
        return super.calcStackSide(stackBounds);
    }
    
    @Override
    public boolean containsView(IViewPart view) {
        return super.containsView(view);
    }
    
    @Override
    protected void createInitialActionSets(List outputList, List stringList) {
        super.createInitialActionSets(outputList, stringList);
    }
    
    @Override
    public void describeLayout(StringBuffer buf) {
        super.describeLayout(buf);
    }
    
    @Override
    public void dispose() {
        super.dispose();
    }
    
    @Override
    public IViewReference findView(String id, String secondaryId) {
        return super.findView(id, secondaryId);
    }
    
    @Override
    public IViewReference findView(String viewId) {
        return super.findView(viewId);
    }
    
    @Override
    public IViewReference getActiveFastView() {
        return super.getActiveFastView();
    }
    
    @Override
    public IActionSetDescriptor[] getAlwaysOffActionSets() {
        return super.getAlwaysOffActionSets();
    }
    
    @Override
    public IActionSetDescriptor[] getAlwaysOnActionSets() {
        return super.getAlwaysOnActionSets();
    }
    
    @Override
    public Composite getClientComposite() {
        return super.getClientComposite();
    }
    
    @Override
    public IPerspectiveDescriptor getDesc() {
        return super.getDesc();
    }
    
    @Override
    public boolean getEditorAreaRestoreOnUnzoom() {
        return super.getEditorAreaRestoreOnUnzoom();
    }
    
    @Override
    public int getEditorAreaState() {
        return super.getEditorAreaState();
    }
    
    @Override
    public FastViewManager getFastViewManager() {
        return super.getFastViewManager();
    }
    
    @Override
    public IViewReference[] getFastViews() {
        return super.getFastViews();
    }
    
    @Override
    public int getFastViewState() {
        return super.getFastViewState();
    }
    
    @Override
    public float getFastViewWidthRatio(IViewReference ref) {
        return super.getFastViewWidthRatio(ref);
    }
    
    @Override
    public String[] getNewWizardShortcuts() {
        return super.getNewWizardShortcuts();
    }
    
    @Override
    public IWorkbenchPartReference getOldPartRef() {
        return super.getOldPartRef();
    }
    
    @Override
    protected ViewPane getPane(IViewReference ref) {
        return super.getPane(ref);
    }
    
    @Override
    protected ArrayList getPerspectiveExtensionActionSets() {
        return super.getPerspectiveExtensionActionSets();
    }
    
    @Override
    public String[] getPerspectiveShortcuts() {
        return super.getPerspectiveShortcuts();
    }
    
    @Override
    public PerspectiveHelper getPresentation() {
        return super.getPresentation();
    }
    
    @Override
    protected ArrayList getShowInIdsFromRegistry() {
        return super.getShowInIdsFromRegistry();
    }
    
    @Override
    public ArrayList getShowInPartIds() {
        return super.getShowInPartIds();
    }
    
    @Override
    public long getShowInTime(String partId) {
        return super.getShowInTime(partId);
    }
    
    @Override
    public boolean getShowTitleView(IViewReference ref) {
        return super.getShowTitleView(ref);
    }
    
    @Override
    public String[] getShowViewShortcuts() {
        return super.getShowViewShortcuts();
    }
    
    @Override
    public ViewFactory getViewFactory() {
        return super.getViewFactory();
    }
    
    @Override
    public ViewLayoutRec getViewLayoutRec(IViewReference ref, boolean create) {
        return super.getViewLayoutRec(ref, create);
    }
    
    @Override
    public IViewReference getViewReference(String viewId, String secondaryId) {
        return super.getViewReference(viewId, secondaryId);
    }
    
    @Override
    public IViewReference[] getViewReferences() {
        return super.getViewReferences();
    }
    
    @Override
    protected void hideEditorArea() {
        super.hideEditorArea();
    }
    
    @Override
    protected void hideEditorAreaLocal() {
        super.hideEditorAreaLocal();
    }
    
    @Override
    public boolean hideView(IViewReference ref) {
        return super.hideView(ref);
    }
    
    @Override
    public boolean isCloseable(IViewReference reference) {
        return super.isCloseable(reference);
    }
    
    @Override
    protected boolean isEditorAreaVisible() {
        return super.isEditorAreaVisible();
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
    public boolean isMoveable(IViewReference reference) {
        return super.isMoveable(reference);
    }
    
    @Override
    public boolean isStandaloneView(IViewReference ref) {
        return super.isStandaloneView(ref);
    }
    
    @Override
    protected void loadPredefinedPersp(PerspectiveDescriptor persp) throws WorkbenchException {
        // Create layout engine.
        IPerspectiveFactory factory = null;
        try {
            factory = persp.createFactory();
        } catch (CoreException e) {
            throw new WorkbenchException(NLS.bind(WorkbenchMessages.Perspective_unableToLoad, persp.getId() ));
        }
        
        /*
         * IPerspectiveFactory#createFactory() can return null
         */
        if (factory == null) {
            throw new WorkbenchException(NLS.bind(WorkbenchMessages.Perspective_unableToLoad, persp.getId() ));
        }       
        
        
        // Create layout factory.
        ViewSashContainer container = new ViewSashContainer(page, getClientComposite());
        layout = new PageLayout(container, getViewFactory(),
                editorArea, descriptor);
        layout.setFixed(descriptor.getFixed());

        // add the placeholders for the sticky folders and their contents   
        IPlaceholderFolderLayout stickyFolderRight = null, stickyFolderLeft = null, stickyFolderTop = null, stickyFolderBottom = null;

        IStickyViewDescriptor[] descs = WorkbenchPlugin.getDefault()
                .getViewRegistry().getStickyViews();
        for (int i = 0; i < descs.length; i++) {
            IStickyViewDescriptor stickyViewDescriptor = descs[i];
            String id = stickyViewDescriptor.getId();
            switch (stickyViewDescriptor.getLocation()) {
            case IPageLayout.RIGHT:
                if (stickyFolderRight == null) {
                    stickyFolderRight = layout
                            .createPlaceholderFolder(
                                    StickyViewDescriptor.STICKY_FOLDER_RIGHT,
                                    IPageLayout.RIGHT, .75f,
                                    IPageLayout.ID_EDITOR_AREA);
                }
                stickyFolderRight.addPlaceholder(id);
                break;
            case IPageLayout.LEFT:
                if (stickyFolderLeft == null) {
                    stickyFolderLeft = layout.createPlaceholderFolder(
                            StickyViewDescriptor.STICKY_FOLDER_LEFT,
                            IPageLayout.LEFT, .25f, IPageLayout.ID_EDITOR_AREA);
                }
                stickyFolderLeft.addPlaceholder(id);
                break;
            case IPageLayout.TOP:
                if (stickyFolderTop == null) {
                    stickyFolderTop = layout.createPlaceholderFolder(
                            StickyViewDescriptor.STICKY_FOLDER_TOP,
                            IPageLayout.TOP, .25f, IPageLayout.ID_EDITOR_AREA);
                }
                stickyFolderTop.addPlaceholder(id);
                break;
            case IPageLayout.BOTTOM:
                if (stickyFolderBottom == null) {
                    stickyFolderBottom = layout.createPlaceholderFolder(
                            StickyViewDescriptor.STICKY_FOLDER_BOTTOM,
                            IPageLayout.BOTTOM, .75f,
                            IPageLayout.ID_EDITOR_AREA);
                }
                stickyFolderBottom.addPlaceholder(id);
                break;
            }

            //should never be null as we've just added the view above
            IViewLayout viewLayout = layout.getViewLayout(id);
            viewLayout.setCloseable(stickyViewDescriptor.isCloseable());
            viewLayout.setMoveable(stickyViewDescriptor.isMoveable());
        }

        // Run layout engine.
        factory.createInitialLayout(layout);
        PerspectiveExtensionReader extender = new PerspectiveExtensionReader();
        extender.extendLayout(page.getExtensionTracker(), descriptor.getId(), layout);

        // Retrieve view layout info stored in the page layout.
        // XXX AT commented
//        mapIDtoViewLayoutRec.putAll(layout.getIDtoViewLayoutRecMap());

        // Create action sets.
        List temp = new ArrayList();
        createInitialActionSets(temp, layout.getActionSets());

        IContextService service = null;
        if (page != null) {
            service = (IContextService) page.getWorkbenchWindow().getService(
                    IContextService.class);
        }
        try {
            if (service!=null) {
                service.activateContext(ContextAuthority.DEFER_EVENTS);
            }
            for (Iterator iter = temp.iterator(); iter.hasNext();) {
                IActionSetDescriptor descriptor = (IActionSetDescriptor) iter
                        .next();
                addAlwaysOn(descriptor);
            }
        } finally {
            if (service!=null) {
                service.activateContext(ContextAuthority.SEND_EVENTS);
            }
        }
        newWizardShortcuts = layout.getNewWizardShortcuts();
        showViewShortcuts = layout.getShowViewShortcuts();
        perspectiveShortcuts = layout.getPerspectiveShortcuts();
        showInPartIds = layout.getShowInPartIds();

        // Retrieve fast views
        if (fastViewManager != null) {
            ArrayList fastViews = layout.getFastViews();
            for (Iterator fvIter = fastViews.iterator(); fvIter.hasNext();) {
                IViewReference ref = (IViewReference) fvIter.next();
                fastViewManager.addViewReference(FastViewBar.FASTVIEWBAR_ID, -1, ref, 
                        !fvIter.hasNext());
            }
        }

        // Is the layout fixed
        fixed = layout.isFixed();

        // Create presentation. 
        presentation = new SunrisePerspectiveHelper(page, container, this);

        // Hide editor area if requested by factory
        if (!layout.isEditorAreaVisible()) {
            hideEditorArea();
        }
    }
    
    @Override
    public void makeFastView(IViewReference ref) {
        super.makeFastView(ref);
    }
    
    @Override
    protected void onActivate() {
        // Update editor area state.
        if (editorArea.getControl() != null) {
            boolean visible = isEditorAreaVisible();
            boolean inTrim = editorAreaState == IStackPresentationSite.STATE_MINIMIZED;
            
            // Funky check: Intro uses the old zoom behaviour when maximized. Make sure we don't show the
            // editor if it's supposed to be hidden because the intro is maximized. Note that
            // 'childObscuredByZoom' will only respond 'true' when using the old behaviour.
            boolean introMaxed = getPresentation().getLayout().childObscuredByZoom(editorArea);
            
            editorArea.setVisible(visible && !inTrim && !introMaxed);
        }

        // Update fast views.
        // Make sure the control for the fastviews are created so they can
        // be activated.
        if (fastViewManager != null) {
            List fastViews = fastViewManager.getFastViews(null);        
            for (int i = 0; i < fastViews.size(); i++) {
                ViewPane pane = getPane((IViewReference) fastViews.get(i));
                if (pane != null) {
                    Control ctrl = pane.getControl();
                    if (ctrl == null) {
                        pane.createControl(getClientComposite());
                        ctrl = pane.getControl();
                    }
                    ctrl.setEnabled(false); // Remove focus support.
                }
            }
        }

        // Set the visibility of all fast view pins
        setAllPinsVisible(true);

        // Trim Stack Support
        boolean useNewMinMax = Perspective.useNewMinMax(this);
        boolean hideEditorArea = shouldHideEditorsOnActivate || (editorHidden && editorHolder == null);
        
        // We have to set the editor area's stack state -before-
        // activating the presentation since it's used there to determine
        // size of the resulting stack
        if (useNewMinMax && !hideEditorArea) {
            refreshEditorAreaVisibility();
        }

        // Show the layout
        presentation.activate(getClientComposite());

        if (useNewMinMax) {
            fastViewManager.activate();

            // Move any minimized extension stacks to the trim          
            if (layout != null) {
                // Turn aimations off
                IPreferenceStore preferenceStore = PrefUtil.getAPIPreferenceStore();
                boolean useAnimations = preferenceStore
                        .getBoolean(IWorkbenchPreferenceConstants.ENABLE_ANIMATIONS);
                preferenceStore.setValue(IWorkbenchPreferenceConstants.ENABLE_ANIMATIONS, false);
                
                List minStacks = layout.getMinimizedStacks();
                for (Iterator msIter = minStacks.iterator(); msIter.hasNext();) {
                    ViewStack vs = (ViewStack) msIter.next();
                    vs.setMinimized(true);
                }

                // Restore the animation pref
                preferenceStore.setValue(IWorkbenchPreferenceConstants.ENABLE_ANIMATIONS, useAnimations);

                // this is a one-off deal...set during the extension reading
                minStacks.clear();
                layout = null;
            }
        }
        else {
            // Update the FVB only if not using the new min/max
            WorkbenchWindow wbw = (WorkbenchWindow) page.getWorkbenchWindow();
            if (wbw != null) {
                ITrimManager tbm = wbw.getTrimManager();
                if (tbm != null) {
                    IWindowTrim fvb = tbm.getTrim(FastViewBar.FASTVIEWBAR_ID);
                    if (fvb instanceof FastViewBar) {
                        ((FastViewBar)fvb).update(true);
                    }
                }
            }
        }
        
        // If we are -not- using the new min/max then ensure that there
        // are no stacks in the trim. This can happen when a user switches
        // back to the 3.0 presentation... 
        if (!Perspective.useNewMinMax(this) && fastViewManager != null) {
            boolean stacksWereRestored = fastViewManager.restoreAllTrimStacks();
            setEditorAreaTrimVisibility(false);
            
            // Restore any 'maximized' view stack since we've restored
            // the minimized stacks
            if (stacksWereRestored && presentation.getMaximizedStack() instanceof ViewStack) {
                ViewStack vs = (ViewStack) presentation.getMaximizedStack();
                vs.setPresentationState(IStackPresentationSite.STATE_RESTORED);
                presentation.setMaximizedStack(null);
            }
        }

        // We hide the editor area -after- the presentation activates
        if (hideEditorArea) {
            // We do this here to ensure that createPartControl is called on the
            // top editor
            // before it is hidden. See bug 20166.
            hideEditorArea();
            shouldHideEditorsOnActivate = false;
            
            // this is an override so it should handle both states
            if (useNewMinMax)
                setEditorAreaTrimVisibility(editorAreaState == IStackPresentationSite.STATE_MINIMIZED);
        }
    }
    
    @Override
    protected void onDeactivate() {
        super.onDeactivate();
    }
    
    @Override
    public void partActivated(IWorkbenchPart activePart) {
        super.partActivated(activePart);
    }
    
    @Override
    public void performedShowIn(String partId) {
        super.performedShowIn(partId);
    }
    
    @Override
    public void refreshEditorAreaVisibility() {
        super.refreshEditorAreaVisibility();
    }
    
    @Override
    public void removeFastView(IViewReference ref, boolean handleLayout) {
        super.removeFastView(ref, handleLayout);
    }
    
    @Override
    public void removeFastView(IViewReference ref) {
        super.removeFastView(ref);
    }
    
    @Override
    public IViewReference restoreFastView(IMemento fvMemento, MultiStatus result) {
        return super.restoreFastView(fvMemento, result);
    }
    
    static String extractPrimaryId(String compoundId) {
        int i = compoundId.lastIndexOf(":");
        if (i == -1) {
            return compoundId;
        }
        return compoundId.substring(0, i);
    }
    
    static String extractSecondaryId(String compoundId) {
        int i = compoundId.lastIndexOf(":");
        if (i == -1) {
            return null;
        }
        return compoundId.substring(i + 1);
    }
    
    static String getKey(String id, String secondaryId) {
        return secondaryId == null ? id : id + ":" + secondaryId;
    }

    @Override
    public IStatus restoreState() {
        if (this.memento == null) {
            return new Status(IStatus.OK, PlatformUI.PLUGIN_ID, 0, "", null); //$NON-NLS-1$
        }

        MultiStatus result = new MultiStatus(
                PlatformUI.PLUGIN_ID,
                IStatus.OK,
                WorkbenchMessages.Perspective_problemsRestoringPerspective, null);

        IMemento memento = this.memento;
        this.memento = null;

        final IMemento boundsMem = memento.getChild(IWorkbenchConstants.TAG_WINDOW);
        if (boundsMem != null) {
            final Rectangle r = new Rectangle(0, 0, 0, 0);
            r.x = boundsMem.getInteger(IWorkbenchConstants.TAG_X).intValue();
            r.y = boundsMem.getInteger(IWorkbenchConstants.TAG_Y).intValue();
            r.height = boundsMem.getInteger(IWorkbenchConstants.TAG_HEIGHT)
                    .intValue();
            r.width = boundsMem.getInteger(IWorkbenchConstants.TAG_WIDTH)
                    .intValue();
            StartupThreading.runWithoutExceptions(new StartupRunnable() {

                public void runWithException() throws Throwable {
                    if (page.getWorkbenchWindow().getPages().length == 0) {
                        page.getWorkbenchWindow().getShell().setBounds(r);
                    }
                }
            });

        }

        // Create an empty presentation..
        final PerspectiveHelper [] presArray = new PerspectiveHelper[1];
        StartupThreading.runWithoutExceptions(new StartupRunnable() {

            public void runWithException() throws Throwable {
                ViewSashContainer mainLayout = new ViewSashContainer(page, getClientComposite());
                presArray[0] = new SunrisePerspectiveHelper(page, mainLayout, SunrisePerspective.this);
            }});
        final PerspectiveHelper pres = presArray[0];

        // Read the layout.
        result.merge(pres.restoreState(memento
                .getChild(IWorkbenchConstants.TAG_LAYOUT)));

        StartupThreading.runWithoutExceptions(new StartupRunnable() {

            public void runWithException() throws Throwable {
                // Add the editor workbook. Do not hide it now.
                pres.replacePlaceholderWithPart(editorArea);
            }});

        // Add the visible views.
        IMemento[] views = memento.getChildren(IWorkbenchConstants.TAG_VIEW);

        for (int x = 0; x < views.length; x++) {
            // Get the view details.
            IMemento childMem = views[x];
            String id = childMem.getString(IWorkbenchConstants.TAG_ID);
            String secondaryId = extractSecondaryId(id);
            if (secondaryId != null) {
                id = extractPrimaryId(id);
            }

            // skip the intro as it is restored higher up in workbench.
            if (id.equals(IIntroConstants.INTRO_VIEW_ID)) {
                continue;
            }
            
            // Create and open the view.
            IViewReference viewRef = getViewFactory().getView(id, secondaryId);
            WorkbenchPartReference ref = (WorkbenchPartReference) viewRef;

            // report error
            if (ref == null) {
                String key = getKey(id, secondaryId);
                result.add(new Status(IStatus.ERROR, PlatformUI.PLUGIN_ID, 0,
                        NLS.bind(WorkbenchMessages.Perspective_couldNotFind,  key ), null));
                continue;
            }
            boolean willPartBeVisible = pres.willPartBeVisible(ref.getId(),
                    secondaryId);
            if (willPartBeVisible) {
                IViewPart view = (IViewPart) ref.getPart(true);
                if (view != null) {
                    ViewSite site = (ViewSite) view.getSite();
                    ViewPane pane = (ViewPane) site.getPane();
                    pres.replacePlaceholderWithPart(pane);
                }
            } else {
                pres.replacePlaceholderWithPart(ref.getPane());
            }
        }

        // Load the fast views
        if (fastViewManager != null)
            fastViewManager.restoreState(memento, result);

        // Load the view layout recs
        IMemento[] recMementos = memento
                .getChildren(IWorkbenchConstants.TAG_VIEW_LAYOUT_REC);
//        for (int i = 0; i < recMementos.length; i++) {
//            IMemento recMemento = recMementos[i];
//            String compoundId = recMemento
//                    .getString(IWorkbenchConstants.TAG_ID);
//            if (compoundId != null) {
//                ViewLayoutRec rec = getViewLayoutRec(compoundId, true);
//                if (IWorkbenchConstants.FALSE.equals(recMemento
//                        .getString(IWorkbenchConstants.TAG_CLOSEABLE))) {
//                    rec.isCloseable = false;
//                }
//                if (IWorkbenchConstants.FALSE.equals(recMemento
//                        .getString(IWorkbenchConstants.TAG_MOVEABLE))) {
//                    rec.isMoveable = false;
//                }
//                if (IWorkbenchConstants.TRUE.equals(recMemento
//                        .getString(IWorkbenchConstants.TAG_STANDALONE))) {
//                    rec.isStandalone = true;
//                    rec.showTitle = !IWorkbenchConstants.FALSE
//                            .equals(recMemento
//                                    .getString(IWorkbenchConstants.TAG_SHOW_TITLE));
//                }
//            }
//        }
//
        final IContextService service = (IContextService)page.getWorkbenchWindow().getService(IContextService.class);
        try { // one big try block, don't kill me here
            // defer context events
            if (service != null) {
                service.activateContext(ContextAuthority.DEFER_EVENTS);
            }

            HashSet knownActionSetIds = new HashSet();

            // Load the always on action sets.
            IMemento[] actions = memento
                    .getChildren(IWorkbenchConstants.TAG_ALWAYS_ON_ACTION_SET);
            for (int x = 0; x < actions.length; x++) {
                String actionSetID = actions[x]
                        .getString(IWorkbenchConstants.TAG_ID);
                final IActionSetDescriptor d = WorkbenchPlugin.getDefault()
                        .getActionSetRegistry().findActionSet(actionSetID);
                if (d != null) {
                    StartupThreading
                            .runWithoutExceptions(new StartupRunnable() {
                                public void runWithException() throws Throwable {
                                    addAlwaysOn(d);
                                }
                            });

                    knownActionSetIds.add(actionSetID);
                }
            }

            // Load the always off action sets.
            actions = memento
                    .getChildren(IWorkbenchConstants.TAG_ALWAYS_OFF_ACTION_SET);
            for (int x = 0; x < actions.length; x++) {
                String actionSetID = actions[x]
                        .getString(IWorkbenchConstants.TAG_ID);
                final IActionSetDescriptor d = WorkbenchPlugin.getDefault()
                        .getActionSetRegistry().findActionSet(actionSetID);
                if (d != null) {
                    StartupThreading
                            .runWithoutExceptions(new StartupRunnable() {
                                public void runWithException() throws Throwable {
                                    addAlwaysOff(d);
                                }
                            });
                    knownActionSetIds.add(actionSetID);
                }
            }

            // Load "show view actions".
            actions = memento
                    .getChildren(IWorkbenchConstants.TAG_SHOW_VIEW_ACTION);
            showViewShortcuts = new ArrayList(actions.length);
            for (int x = 0; x < actions.length; x++) {
                String id = actions[x].getString(IWorkbenchConstants.TAG_ID);
                showViewShortcuts.add(id);
            }

            // Load "show in times".
            actions = memento.getChildren(IWorkbenchConstants.TAG_SHOW_IN_TIME);
            for (int x = 0; x < actions.length; x++) {
                String id = actions[x].getString(IWorkbenchConstants.TAG_ID);
                String timeStr = actions[x]
                        .getString(IWorkbenchConstants.TAG_TIME);
                if (id != null && timeStr != null) {
                    try {
                        long time = Long.parseLong(timeStr);
                        showInTimes.put(id, new Long(time));
                    } catch (NumberFormatException e) {
                        // skip this one
                    }
                }
            }

            // Load "show in parts" from registry, not memento
            showInPartIds = getShowInIdsFromRegistry();

            // Load "new wizard actions".
            actions = memento
                    .getChildren(IWorkbenchConstants.TAG_NEW_WIZARD_ACTION);
            newWizardShortcuts = new ArrayList(actions.length);
            for (int x = 0; x < actions.length; x++) {
                String id = actions[x].getString(IWorkbenchConstants.TAG_ID);
                newWizardShortcuts.add(id);
            }

            // Load "perspective actions".
            actions = memento
                    .getChildren(IWorkbenchConstants.TAG_PERSPECTIVE_ACTION);
            perspectiveShortcuts = new ArrayList(actions.length);
            for (int x = 0; x < actions.length; x++) {
                String id = actions[x].getString(IWorkbenchConstants.TAG_ID);
                perspectiveShortcuts.add(id);
            }

            ArrayList extActionSets = getPerspectiveExtensionActionSets();
            for (int i = 0; i < extActionSets.size(); i++) {
                String actionSetID = (String) extActionSets.get(i);
                if (knownActionSetIds.contains(actionSetID)) {
                    continue;
                }
                final IActionSetDescriptor d = WorkbenchPlugin.getDefault()
                        .getActionSetRegistry().findActionSet(actionSetID);
                if (d != null) {
                    StartupThreading
                            .runWithoutExceptions(new StartupRunnable() {
                                public void runWithException() throws Throwable {
                                    addAlwaysOn(d);
                                }
                            });
                    knownActionSetIds.add(d.getId());
                }
            }

            // Add the visible set of action sets to our knownActionSetIds
            // Now go through the registry to ensure we pick up any new action
            // sets
            // that have been added but not yet considered by this perspective.
            ActionSetRegistry reg = WorkbenchPlugin.getDefault()
                    .getActionSetRegistry();
            IActionSetDescriptor[] array = reg.getActionSets();
            int count = array.length;
            for (int i = 0; i < count; i++) {
                IActionSetDescriptor desc = array[i];
                if ((!knownActionSetIds.contains(desc.getId()))
                        && (desc.isInitiallyVisible())) {
                    addActionSet(desc);
                }
            }
        } finally {
            // restart context changes
            if (service != null) {
                StartupThreading.runWithoutExceptions(new StartupRunnable() {
                    public void runWithException() throws Throwable {
                        service.activateContext(ContextAuthority.SEND_EVENTS);
                    }
                });
            }
        }

        // Save presentation.
        presentation = pres;

        // Hide the editor area if needed. Need to wait for the
        // presentation to be fully setup first.
        Integer areaVisible = memento
                .getInteger(IWorkbenchConstants.TAG_AREA_VISIBLE);
        // Rather than hiding the editors now we must wait until after their
        // controls
        // are created. This ensures that if an editor is instantiated,
        // createPartControl
        // is also called. See bug 20166.
        shouldHideEditorsOnActivate = (areaVisible != null && areaVisible
                .intValue() == 0);

        // Restore the trim state of the editor area
        IPreferenceStore preferenceStore = PrefUtil.getAPIPreferenceStore();
        boolean useNewMinMax = preferenceStore.getBoolean(IWorkbenchPreferenceConstants.ENABLE_NEW_MIN_MAX);
        if (useNewMinMax) {
            Integer trimStateInt = memento.getInteger(IWorkbenchConstants.TAG_AREA_TRIM_STATE);
            if (trimStateInt != null) {
                editorAreaState = trimStateInt.intValue() & 0x3; // low order two bits contain the state
                editorAreaRestoreOnUnzoom = (trimStateInt.intValue() & 4) != 0;
            }
        }
        
        // restore the fixed state
        Integer isFixed = memento.getInteger(IWorkbenchConstants.TAG_FIXED);
        fixed = (isFixed != null && isFixed.intValue() == 1);

        return result;
    }
    
    @Override
    public IStatus restoreState(IMemento memento) {
        return super.restoreState(memento);
    }
    
    @Override
    public void restoreTrimPart(LayoutPart part) {
        super.restoreTrimPart(part);
    }
    
    @Override
    public void restoreZoomedParts() {
        super.restoreZoomedParts();
    }
    
    @Override
    public void saveDesc() {
        super.saveDesc();
    }
    
    @Override
    public void saveDescAs(IPerspectiveDescriptor desc) {
        super.saveDescAs(desc);
    }
    
    @Override
    public IStatus saveState(IMemento memento) {
        return super.saveState(memento);
    }
    
    @Override
    protected void setAllPinsVisible(boolean visible) {
        super.setAllPinsVisible(visible);
    }
    
    @Override
    public void setEditorAreaRestoreOnUnzoom(boolean restore) {
        super.setEditorAreaRestoreOnUnzoom(restore);
    }
    
    @Override
    public void setEditorAreaState(int newState) {
        super.setEditorAreaState(newState);
    }
    
    @Override
    protected EditorAreaTrimToolBar setEditorAreaTrimVisibility(boolean visible) {
        return super.setEditorAreaTrimVisibility(visible);
    }
    
    @Override
    public void setFastViewState(int newState) {
        super.setFastViewState(newState);
    }
    
    @Override
    public void setNewWizardActionIds(ArrayList newList) {
        super.setNewWizardActionIds(newList);
    }
    
    @Override
    public void setOldPartRef(IWorkbenchPartReference oldPartRef) {
        super.setOldPartRef(oldPartRef);
    }
    
    @Override
    public void setPerspectiveActionIds(ArrayList list) {
        super.setPerspectiveActionIds(list);
    }
    
    @Override
    public void setShowInPartIds(ArrayList list) {
        super.setShowInPartIds(list);
    }
    
    @Override
    public void setShowViewActionIds(ArrayList list) {
        super.setShowViewActionIds(list);
    }
    
    @Override
    protected void showEditorArea() {
        super.showEditorArea();
    }
    
    @Override
    protected void showEditorAreaLocal() {
        super.showEditorAreaLocal();
    }
    
    @Override
    public IViewPart showView(String viewId, String secondaryId) throws PartInitException {
        ViewFactory factory = getViewFactory();
        IViewReference ref = factory.createView(viewId, secondaryId);
        IViewPart part = (IViewPart) ref.getPart(true);
        if (part == null) {
            throw new PartInitException(NLS.bind(WorkbenchMessages.ViewFactory_couldNotCreate, ref.getId()));
        }
        ViewSite site = (ViewSite) part.getSite();
        ViewPane pane = (ViewPane) site.getPane();
        if (pane != null && pane.getControl() != null)
            pane.getControl().setEnabled(true);
        
        SunriseViewManager sunriseViewManager = ((SunriseWorkbenchPage) page).getSunriseViewManager();
        
        sunriseViewManager.showView(pane, site);
       
        return part;
        //        return super.showView(viewId, secondaryId);
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
    public void turnOffActionSet(IActionSetDescriptor toDisable) {
        super.turnOffActionSet(toDisable);
    }
    
    @Override
    public void turnOffActionSets(IActionSetDescriptor[] toDisable) {
        super.turnOffActionSets(toDisable);
    }
    
    @Override
    public void turnOnActionSets(IActionSetDescriptor[] newArray) {
        super.turnOnActionSets(newArray);
    }
    
    //    @Override
    //    public PerspectiveHelper getPresentation() {
    //        return sunrisePresentation;
    //    }
    
}
