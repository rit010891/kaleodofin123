package core.pages;

import java.util.Map;

import agent.IAgent;
import central.Configuration;

public class LakshyaRecommendation extends FullPage {

	public LakshyaRecommendation(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);
		// TODO Auto-generated constructor stub
	}

	public void verifyLakshyaRecommendation() throws Exception {
		
			getControl("Save for education").click();
			getControl("goalAmmount").enterText(testData.get("ammount"));
			getControl("years").enterText(testData.get("year"));
			getControl("goalAmmount").click();
			getControl("next").click();
		
			Thread.sleep(1000);
			getControl("familyMember").click();
			
			Thread.sleep(1000);
			getControl("Workinyourfamily").click();
			Thread.sleep(1000);
			
			getControl("Education Loan").click();
			//getControl("home Loan").click();
			getControl("next").click();
			Thread.sleep(1000);
			
			getControl("leassthan100").click();
			Thread.sleep(1000);
			
			getControl("borrowfrombank").click();
			getControl("next").click();
			getControl("comfortable,saveCheckBox").click();
			Thread.sleep(1000);
			getControl("next1").click();
			Thread.sleep(1000);
			
	
			getControl("next").click();
			getControl("next1").click();
			Thread.sleep(1000);
			//getControl("Highest education").click();
			//getControl("Less than 12").click();
			
			getControl("next1").click();
			Thread.sleep(1000);
			getControl("next1").click();
			Thread.sleep(1000);
			
			//getControl("next").click();
			Thread.sleep(1000);
			verifyTitle();
			getControl("city").click();
			Thread.sleep(1000);
			getControl("next").click();
			Thread.sleep(1000);
			getControl("next").click();
			/*getControl("Annual Salary").click();
			getControl("6-9 Lakhs").click();
			getControl("next").click();
			Thread.sleep(1000);
			verifyTitle();*/
			getControl("YesRadioButton").click();
			getControl("YearRadioButton").click();
			getControl("next").click();
			Thread.sleep(2000);
		
		  if (getControl("overDraftAmmount").isVisible()) {
		  System.out.println("overDraftAmmount"); } else
		  
		  { System.out.println("not verified"); } verifyTitle();
		  getControl("overdraftAmmount").enterText("1000");
		  getControl("next").click();
			Thread.sleep(2000);
			getControl("knowMoreBtn").click();
			Thread.sleep(5000);
			getControl("knowMoreContent").assertVisible();
			Thread.sleep(5000);
			getControl("closeBtn").click();
			Thread.sleep(5000);
			getControl("next").click();
			Thread.sleep(5000);
			String text=getControl("1stMon").getText();
			String text2=getControl("2ndMon").getText();
			
			getControl("1stMon").waitUntilVisible();
			System.out.println(getControl("1stMon").getText());
			Thread.sleep(1000);
			getControl("2ndMon").waitUntilVisible();
			System.out.println(getControl("2ndMon").getText());
			if(text.equals(getControl("1stMon").getText()))
			{
				System.out.println("Monthly Contribution is verified");
			}
			else
				System.out.println("noo");
			Thread.sleep(1000);
			 getControl("t&CBtn").click();
			    Thread.sleep(5000);
			    // Verify Terms and Conditions are shown
			    getControl("t&CContent").assertVisible();
			    Thread.sleep(5000);
			    // Click on close button
			    getControl("closeBtn").click();
			    Thread.sleep(5000);
			    if(getControl("Enrollment fee").isVisible())
			    {
			    	System.out.println(getControl("Enrollment fee").getText()+" Verified");
			    }
			    if(getControl("admin fee").isVisible())
			    {
			    	System.out.println(getControl("admin fee").getText()+" Verified");
			    }
			    getControl("acceptBtn").click();
			    Thread.sleep(5000);
			    
			   
			    /*// Bank details screen and clear IFSC code
			    getControl("ifscTxt").clear();
			    /// Enter valid IFSC code
				getControl("ifscTxt").enterText(testData.get("validIFSC"));
				//Thread.sleep(5000);
				// Search button click
			    getControl("searchBtn").click();
			    //Thread.sleep(5000);*/
			    // Click on Setup Payment in Bank details 
			    getControl("setupPaymentBtn").click();
			    Thread.sleep(4000);
			    // Click on Next in Bank details 
			    getControl("next").click();
			    Thread.sleep(4000);
			  /*  // Verify Promotion screen is shown
			    getControl("congratulationsTxt").assertVisible();
			    Thread.sleep(4000);*/
			    // Click on Google Play button
			    getControl("googlePlayBtn").click();
			    Thread.sleep(4000);
		    	try {
		    		switchToNewWindow();
			    	takeSnapShot();
		    		getControl("googlePlayScreen").click();
		    	}catch (Exception e) {}
		    	Thread.sleep(10000);
		    	takeSnapShot();	
			
		}
	public void verifyLakshyaRecommendationSamsta() throws Exception {
		
		getControl("Save for education").click();
		getControl("goalAmmount").enterText(testData.get("ammount"));
		getControl("years").enterText(testData.get("year"));
		getControl("goalAmmount").click();
		getControl("next").click();
	
		Thread.sleep(1000);
		getControl("Doesanyoneelseworkinyourfamily?").click();
		
		Thread.sleep(1000);
		getControl("dependents do you have in your family?").click();
		Thread.sleep(1000);
		getControl("educational qualification?").click();
		Thread.sleep(3000);
		
	//	getControl("monthlsalary").click();
		//if(getControl("monthlsalary"))
		getControl("monthlsalary").click();
		Thread.sleep(1000);
		getControl("EMI / loan amount?").click();
		Thread.sleep(1000);
		//getControl("educational qualification?").click();
		getControl("save every month?").click();
		Thread.sleep(1000);
		
		getControl("Do you have any of these?").click();
		getControl("next").click();
		getControl("how much are you willing to invest?").click();
		getControl("income and expenses?").click();
		Thread.sleep(1000);
		

		getControl("next").click();
		getControl("next").click();
		getControl("next").click();
		Thread.sleep(1000);
		
		verifyTitle();
		getControl("city").click();
		Thread.sleep(1000);
		getControl("next").click();
		Thread.sleep(1000);
		getControl("next").click();
		/*getControl("Annual Salary").click();
		getControl("6-9 Lakhs").click();
		getControl("next").click();
		Thread.sleep(1000);
		verifyTitle();*/
		getControl("YesRadioButton").click();
		getControl("YearRadioButton").click();
		getControl("next").click();
		Thread.sleep(2000);
	
	  if (getControl("overDraftAmmount").isVisible()) {
	  System.out.println("overDraftAmmount"); } else
	  
	  { System.out.println("not verified"); } verifyTitle();
	  getControl("overdraftAmmount").enterText("1000");
	  getControl("next").click();
		Thread.sleep(2000);
		getControl("knowMoreBtn").click();
		Thread.sleep(5000);
		getControl("knowMoreContent").assertVisible();
		Thread.sleep(5000);
		getControl("closeBtn").click();
		Thread.sleep(5000);
		getControl("next").click();
		Thread.sleep(5000);
		String text=getControl("1stMon").getText();
		String text2=getControl("2ndMon").getText();
		
		getControl("1stMon").waitUntilVisible();
		System.out.println(getControl("1stMon").getText());
		Thread.sleep(1000);
		getControl("2ndMon").waitUntilVisible();
		System.out.println(getControl("2ndMon").getText());
		if(text.equals(getControl("1stMon").getText()))
		{
			System.out.println("Monthly Contribution is verified");
		}
		else
			System.out.println("noo");
		Thread.sleep(1000);
		 getControl("t&CBtn").click();
		    Thread.sleep(5000);
		    // Verify Terms and Conditions are shown
		    getControl("t&CContent").assertVisible();
		    Thread.sleep(5000);
		    // Click on close button
		    getControl("closeBtn").click();
		    Thread.sleep(5000);
		    if(getControl("Enrollment fee").isVisible())
		    {
		    	System.out.println(getControl("Enrollment fee").getText()+" Verified");
		    }
		    if(getControl("admin fee").isVisible())
		    {
		    	System.out.println(getControl("admin fee").getText()+" Verified");
		    }
		    getControl("acceptBtn").click();
		    Thread.sleep(5000);
		    
		   
		    /*// Bank details screen and clear IFSC code
		    getControl("ifscTxt").clear();
		    /// Enter valid IFSC code
			getControl("ifscTxt").enterText(testData.get("validIFSC"));
			//Thread.sleep(5000);
			// Search button click
		    getControl("searchBtn").click();
		    //Thread.sleep(5000);*/
		    // Click on Setup Payment in Bank details 
		    getControl("setupPaymentBtn").click();
		    Thread.sleep(4000);
		    // Click on Next in Bank details 
		    getControl("next").click();
		    Thread.sleep(4000);
		  /*  // Verify Promotion screen is shown
		    getControl("congratulationsTxt").assertVisible();
		    Thread.sleep(4000);*/
		    // Click on Google Play button
		    getControl("googlePlayBtn").click();
		    Thread.sleep(4000);
	    	try {
	    		switchToNewWindow();
		    	takeSnapShot();
	    		getControl("googlePlayScreen").click();
	    	}catch (Exception e) {}
	    	Thread.sleep(10000);
	    	takeSnapShot();	
		
	}

		/**
		 * Verifying title content of every page
		 **/
		
	
	public void verifyTitle() throws Exception {
		String text = getControl("title").getText();
		if (getControl("title").isVisible()) {
			Thread.sleep(2000);
			String text2 = getControl("title").getText();
			System.out.println(text);
			if (text.equals(text2)) {
				System.out.println(text + "is verified");
			} else
				System.out.println("nott");

		} else {
			System.out.println("nooo");
		}
	}
}
