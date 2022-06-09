package PojoClassesPractice;

import java.util.ArrayList;
import java.util.List;

public class Level3_2class 
{
	public static void main(String [] args)
	{
		Level3PracticeBody l3 = new Level3PracticeBody();
		l3.setServices("coaching");
		l3.setInstructor("bipin");
		l3.setExpertise("high");
		
		WebAutomation ma = new WebAutomation();
		ma.setCourseTitle("java");
		ma.setPrice("50");
		
		WebAutomation ma1 = new WebAutomation();
		ma1.setCourseTitle("selenium");
		ma1.setPrice("70");
		
		WebAutomation ma2 = new WebAutomation();
		ma2.setCourseTitle("appium");
		ma2.setPrice("80");
		
		Api a1 = new Api();
		a1.setCourseTitle("Rest Assured");
		a1.setPrice("80");
		
		Api a2 = new Api();
		a2.setCourseTitle("Soap UI");
		a2.setPrice("70");
		
		MobileAutomation mm = new MobileAutomation();
		mm.setCourseTitle("Telerik");
		mm.setPrice("90");
		

		MobileAutomation mm1 = new MobileAutomation();
		mm1.setCourseTitle("Appium");
		mm1.setPrice("70");
		
		List<WebAutomation> lw = new ArrayList();
		lw.add(ma);
		lw.add(ma1);
		lw.add(ma2);
		
		List<Api> ap =new ArrayList();
		ap.add(a1);
		ap.add(a2);
		
		List<MobileAutomation> lm = new ArrayList();
		lm.add(mm);
		lm.add(mm1);
		

				
	}

}
