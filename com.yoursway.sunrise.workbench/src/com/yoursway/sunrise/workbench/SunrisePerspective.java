package com.yoursway.sunrise.workbench;

import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.registry.PerspectiveDescriptor;

@SuppressWarnings("restriction")
public class SunrisePerspective extends Perspective {

    public SunrisePerspective(PerspectiveDescriptor desc, WorkbenchPage page) throws WorkbenchException {
        super(desc, page);
    }

    public SunrisePerspective(WorkbenchPage page) throws WorkbenchException {
        super(page);
    }
    
}
