package com.yoursway.sunrise.workbench;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.internal.DetachedWindow;
import org.eclipse.ui.internal.ILayoutContainer;
import org.eclipse.ui.internal.LayoutPart;
import org.eclipse.ui.internal.PartStack;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.PerspectiveHelper;
import org.eclipse.ui.internal.ViewPane;
import org.eclipse.ui.internal.ViewSashContainer;
import org.eclipse.ui.internal.ViewStack;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.presentations.IStackPresentationSite;

@SuppressWarnings("restriction")
public class SunrisePerspectiveHelper extends PerspectiveHelper {

    public SunrisePerspectiveHelper(WorkbenchPage workbenchPage, ViewSashContainer mainLayout,
            Perspective perspective) {
        super(workbenchPage, mainLayout, perspective);
    }
    
    private static void collectViewPanes(List result, LayoutPart[] parts) {
        for (int i = 0, length = parts.length; i < length; i++) {
            LayoutPart part = parts[i];
            if (part instanceof ViewPane) {
                result.add(part);
            } else if (part instanceof ILayoutContainer) {
                collectViewPanes(result, ((ILayoutContainer) part)
                        .getChildren());
            }
        }
    }

    @Override
    public void activate(Composite parent) {

        if (active) {
            return;
        }

        parentWidget = parent;
        
        final ViewSashContainer mainLayout = getLayout();

        // Activate main layout
        // make sure all the views have been properly parented
        Vector children = new Vector();
        collectViewPanes(children, mainLayout.getChildren());
        Enumeration itr = children.elements();
        while (itr.hasMoreElements()) {
            LayoutPart part = (LayoutPart) itr.nextElement();
            part.reparent(parent);
        }
        mainLayout.createControl(parent);
        mainLayout.setActive(true);

//        // Open the detached windows.
//        for (int i = 0, length = detachedWindowList.size(); i < length; i++) {
//            DetachedWindow dwindow = (DetachedWindow) detachedWindowList.get(i);
//            dwindow.open();
//        }

//        enableAllDrag();

//        // Ensure that the maximized stack's presentation state is correct
//        if (maximizedStackId != null) {
//            LayoutPart part = findPart(maximizedStackId);
//            if (part instanceof PartStack) {
//                maximizedStack = (PartStack) part;
//                maximizedStackId = null;
//            }
//        }
        
        // NOTE: we only handle ViewStacks here; Editor Stacks are handled by the
        // perspective
//        if (maximizedStack instanceof ViewStack) {
//            maximizedStack.setPresentationState(IStackPresentationSite.STATE_MAXIMIZED);                
//        }
        
        active = true;
     }

    @Override
    public void addDetachedPart(LayoutPart part, Rectangle bounds) {
        super.addDetachedPart(part, bounds);
    }

    @Override
    public void addDetachedPart(LayoutPart part) {
        super.addDetachedPart(part);
    }

    @Override
    public void addPart(LayoutPart part) {
        super.addPart(part);
    }

    @Override
    public void attachPart(IViewReference ref) {
        super.attachPart(ref);
    }

    @Override
    public boolean bringPartToTop(LayoutPart part) {
        return super.bringPartToTop(part);
    }

    @Override
    public boolean canDetach() {
        return super.canDetach();
    }

    @Override
    public void collectViewPanes(List result) {
        super.collectViewPanes(result);
    }

    @Override
    public void deactivate() {
        super.deactivate();
    }

    @Override
    public void describeLayout(StringBuffer buf) {
        super.describeLayout(buf);
    }

    @Override
    public void detachPart(IViewReference ref) {
        super.detachPart(ref);
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public LayoutPart findPart(String primaryId, String secondaryId) {
        return super.findPart(primaryId, secondaryId);
    }

    @Override
    public void forceNoZoom() {
        super.forceNoZoom();
    }

    @Override
    public Rectangle getCachedBoundsFor(String id) {
        return super.getCachedBoundsFor(id);
    }

    @Override
    public ViewSashContainer getLayout() {
        return super.getLayout();
    }

    @Override
    public PartStack getMaximizedStack() {
        return super.getMaximizedStack();
    }

    @Override
    public boolean hasPlaceholder(String primaryId, String secondaryId) {
        return super.hasPlaceholder(primaryId, secondaryId);
    }

    @Override
    public boolean hasPlaceholder(String id) {
        return super.hasPlaceholder(id);
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }

    @Override
    public boolean isPartVisible(IWorkbenchPartReference partRef) {
        return super.isPartVisible(partRef);
    }

    @Override
    public boolean isZoomed() {
        return super.isZoomed();
    }

    @Override
    public boolean partChangeAffectsZoom(LayoutPart pane) {
        return super.partChangeAffectsZoom(pane);
    }

    @Override
    public void removePart(LayoutPart part) {
        super.removePart(part);
    }

    @Override
    public void replacePlaceholderWithPart(LayoutPart part) {
        super.replacePlaceholderWithPart(part);
    }

    @Override
    public void resetBoundsMap() {
        super.resetBoundsMap();
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
    public void setMaximizedStack(PartStack stack) {
        super.setMaximizedStack(stack);
    }

    @Override
    public void updateBoundsMap() {
        super.updateBoundsMap();
    }

    @Override
    public boolean willPartBeVisible(String partId, String secondaryId) {
        return super.willPartBeVisible(partId, secondaryId);
    }

    @Override
    public boolean willPartBeVisible(String partId) {
        return super.willPartBeVisible(partId);
    }

    @Override
    public void zoomIn(IWorkbenchPartReference ref) {
        super.zoomIn(ref);
    }

    @Override
    public void zoomOut() {
        super.zoomOut();
    }
    
}
