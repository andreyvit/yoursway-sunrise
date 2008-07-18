package com.yoursway.sunrise.workbench;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.internal.layout.IWindowTrim;

@SuppressWarnings("restriction")
public class SrTrim implements IWindowTrim {
    
    private final Control control;
    
    public SrTrim(Control control) {
        if (control == null)
            throw new NullPointerException("control is null");
        this.control = control;
    }
    
    public void dock(int dropSide) {
    }
    
    public Control getControl() {
        return control;
    }
    
    public String getDisplayName() {
        return "SrTrim for " + control;
    }
    
    public int getHeightHint() {
        return SWT.DEFAULT;
    }
    
    public String getId() {
        return "srtrim";
    }
    
    public int getValidSides() {
        return SWT.LEFT | SWT.RIGHT | SWT.TOP | SWT.BOTTOM;
    }
    
    public int getWidthHint() {
        return 100;
    }
    
    public void handleClose() {
    }
    
    public boolean isCloseable() {
        return true;
    }
    
    public boolean isResizeable() {
        return true;
    }
    
}
