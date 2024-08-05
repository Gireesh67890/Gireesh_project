package com.Fitfeo.testscript;

import org.testng.annotations.Test;

import com.fitfeo.genric.Baseclass;
import com.fitfeo.pom.Homepage;
import com.fitfeo.pom.Revenuecalculatorpage;

public class fitfeo_end_to_end extends Baseclass {
	@Test
	public void Fit_feo_endtoend() {
		Homepage h = new Homepage(driver);
		h.getRevenuecalculator().click();
		Revenuecalculatorpage r = new Revenuecalculatorpage(driver);
		r.getMedicaleligible_patientsoption();
		
		
	}
	

}
