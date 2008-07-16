package com.yoursway.sunrise.workbench;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.WorkbenchWindow;

@SuppressWarnings("restriction")
public class SunriseWorkbenchPage extends WorkbenchPage {

    public SunriseWorkbenchPage(WorkbenchWindow w, IAdaptable input) throws WorkbenchException {
        super(w, input);
    }

    public SunriseWorkbenchPage(WorkbenchWindow w, String layoutID, IAdaptable input)
            throws WorkbenchException {
        super(w, layoutID, input);
    }
    
}
