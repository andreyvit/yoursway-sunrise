package com.yoursway.sunrise.workbench;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.internal.registry.PerspectiveDescriptor;
import org.eclipse.ui.internal.tweaklets.WorkbenchImplementation;

@SuppressWarnings("restriction")
public class SunriseWorkbenchTweaklet extends WorkbenchImplementation {

	@Override
	public Perspective createPerspective(PerspectiveDescriptor desc,
			WorkbenchPage workbenchPage) throws WorkbenchException {
		return new SunrisePerspective(desc,workbenchPage);
	}

	@Override
	public WorkbenchPage createWorkbenchPage(WorkbenchWindow workbenchWindow,
			IAdaptable finalInput) throws WorkbenchException {
		return new SunriseWorkbenchPage(workbenchWindow,finalInput);
	}

	@Override
	public WorkbenchPage createWorkbenchPage(WorkbenchWindow workbenchWindow,
			String perspID, IAdaptable input) throws WorkbenchException {
		return new SunriseWorkbenchPage(workbenchWindow,perspID,input);
	}

	@Override
	public WorkbenchWindow createWorkbenchWindow(int newWindowNumber) {
		System.err.println("IT's ME");
		return new SunriseWorkbenchWindow(newWindowNumber);
	}

}
