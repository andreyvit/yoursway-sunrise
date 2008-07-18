package com.yoursway.sunrise.workbench;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.ui.internal.ILayoutContainer;
import org.eclipse.ui.internal.LayoutPart;
import org.eclipse.ui.internal.ViewPane;
import org.eclipse.ui.internal.ViewSite;
import org.eclipse.ui.internal.PartPane.Sashes;

public class SunriseViewManager {
    
    private Composite viewsParent;
    private ScrolledComposite scrolledComposite;

    public SunriseViewManager(Composite parent) {
        scrolledComposite = new ScrolledComposite(parent, SWT.V_SCROLL);
        GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        gd.minimumWidth = 250;
        scrolledComposite.setLayoutData(gd);
        scrolledComposite.setExpandVertical(true);
        scrolledComposite.setExpandHorizontal(false);
        scrolledComposite.setData(this);
        scrolledComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
        
        viewsParent = new Composite(scrolledComposite, SWT.NONE);
        viewsParent.setLayoutData(gd);
//        viewsParent.setBackground(new Color(null, 0, 0, 255));
        viewsParent.setLayout(new GridLayout(1, false));
        viewsParent.setData(this);
        viewsParent.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));

        scrolledComposite.setContent(viewsParent);
        recomputeSize();
        
//        Button button = new Button(viewsParent, SWT.PUSH);
////        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
//        button.setText("Foo");
//        button.setSize(100, 50);
//        button.setLocation(200, 200);
    }

    private void recomputeSize() {
//        viewsParent.layout();
        Point point = viewsParent.computeSize(scrolledComposite.getClientArea().width, SWT.DEFAULT);
        viewsParent.setSize(point);
        scrolledComposite.setMinSize(point);
//        scrolledComposite.layout();
    }

    public void showView(ViewPane pane, ViewSite site) {
        Group group = new Group(viewsParent, SWT.SHADOW_OUT);
        group.setText(site.getPart().getTitle());
        group.setBackground(group.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
        
        group.setLayout(new GridLayout(1, false));
        group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        
        pane.reparent(group);
        //        LayoutPart relative = mainLayout.findBottomRight();
        //        if (relative != null && relative instanceof ILayoutContainer) {
        //            ILayoutContainer stack = (ILayoutContainer)relative;
        //            if (stack.allowsAdd(part)) {
        //                mainLayout.stack(part, stack);
        //            } else {
        //                mainLayout.add(part);
        //            }
        //        } else {
//        mainLayout.add(part);
        //        }
        
        if (true /* active */) {
            pane.createControl(group);
            GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
            gd.minimumHeight = 200;
            gd.minimumWidth = 200;
            pane.getControl().setLayoutData(gd);
            pane.setVisible(true);
            pane.setContainer(new ILayoutContainer() {
                
                public void add(LayoutPart newPart) {
                }
                
                public boolean allowsAdd(LayoutPart toAdd) {
                    return false;
                }
                
                public boolean allowsAutoFocus() {
                    return false;
                }
                
                public boolean childIsZoomed(LayoutPart toTest) {
                    return false;
                }
                
                public boolean childObscuredByZoom(LayoutPart toTest) {
                    return false;
                }
                
                public void childRequestZoomIn(LayoutPart toZoom) {
                }
                
                public void childRequestZoomOut() {
                }
                
                public void findSashes(LayoutPart toFind, Sashes result) {
                }
                
                public LayoutPart[] getChildren() {
                    return new LayoutPart[0];
                }
                
                public void remove(LayoutPart part) {
                }
                
                public void replace(LayoutPart oldPart, LayoutPart newPart) {
                }
                
                public void resizeChild(LayoutPart childThatChanged) {
                }
                
            });
            
        }
        
        recomputeSize();
        ScrollBar bar = scrolledComposite.getVerticalBar();
        scrolledComposite.setShowFocusedControl(true);
        pane.setFocus();
     }
    
}
