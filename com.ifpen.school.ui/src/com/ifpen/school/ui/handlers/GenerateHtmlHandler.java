 
package com.ifpen.school.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.ifpen.school.SchoolYear;
import com.ifpen.school.gen.main.Generate;

public class GenerateHtmlHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection isel) {
		
		Object selected = isel.getFirstElement();
		if (selected instanceof SchoolYear)
			executeForSchool((SchoolYear) selected);
	}
		
	@Execute
	public void executeForSchool(@Named(IServiceConstants.ACTIVE_SELECTION) SchoolYear school) {

		File targetFile = new File("c:/tmp");
		
		Generate gen;
		try {
			gen = new Generate(school, targetFile, Collections.emptyList());
			gen.doGenerate(new BasicMonitor());
			System.out.println("File generated in : /tmp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}