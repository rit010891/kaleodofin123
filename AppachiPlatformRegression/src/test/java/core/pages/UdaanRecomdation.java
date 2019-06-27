package core.pages;

import java.util.Map;

import org.openqa.selenium.Keys;

import agent.IAgent;
import central.Configuration;

public class UdaanRecomdation extends FullPage {

	public UdaanRecomdation(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);
		// TODO Auto-generated constructor stub
	}

	public void verifyDurationError() throws Exception {
		getControl("Save for education").click();
		getControl("goalAmmount").enterText(testData.get("ammount"));
		getControl("years").enterText(testData.get("year"));
		getControl("goalAmmount").click();
		getControl("next").click();
		Thread.sleep(2000);
		verifyTitle();
		Thread.sleep(1000);
		getControl("familyMember").click();
		verifyTitle();
		Thread.sleep(1000);
		getControl("Workinyourfamily").click();
		Thread.sleep(1000);
		verifyTitle();
		getControl("Education Loan").click();
		getControl("home Loan").click();
		getControl("next").click();
		Thread.sleep(1000);
		verifyTitle();
		getControl("leassthan100").click();
		Thread.sleep(1000);
		verifyTitle();
		getControl("borrowfrombank").click();
		getControl("next").click();
		getControl("comfortable,saveCheckBox").click();
		getControl("next").click();
		Thread.sleep(1000);
		verifyTitle();
		Thread.sleep(1000);
		getControl("next").click();
		Thread.sleep(1000);
		getControl("next").click();
		Thread.sleep(1000);
		getControl("next").click();
		Thread.sleep(1000);
		getControl("next").click();
		Thread.sleep(1000);
		verifyTitle();
		getControl("city").click();
		Thread.sleep(1000);
		getControl("next").click();
		getControl("next").click();
		Thread.sleep(1000);
		verifyTitle();
		getControl("noRadioButton").click();
		getControl("next").click();
		Thread.sleep(2000);
		getControl("udan").waitUntilVisible();
		if (getControl("udan").isVisible()) {
			System.out.println("Udan is verified");
		} else

		{
			System.out.println("not verified");
		}
		verifyTitle();
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

	public void resumeBankDetails() throws Exception {
		getControl("EnterIFSCode").enterText(Keys.CONTROL + "a");
		getControl("EnterIFSCode").enterText(Keys.DELETE);
		getControl("EnterIFSCode").enterText("ICIC0002695");
		getControl("next").click();
		Thread.sleep(1000);
		if (getControl("IFSCodeinvalid").isVisible()) {
			System.out.println("IFSC code is invalid for ICIC0002695.");
		} else {
			System.out.println("IFSC code is valid for ICIC0002692.");
		}
		Thread.sleep(1000);
		getControl("EnterIFSCode").enterText(Keys.CONTROL + "a");
		getControl("EnterIFSCode").enterText(Keys.DELETE);
		getControl("EnterIFSCode").enterText("ICIC0002692");
		getControl("next").click();
		Thread.sleep(2000);
		if (!(getControls("IFSCodeinvalid").size() > 0)) {
			System.out.println("IFSC code is valid for ICIC0002692.");
		} else {
			System.out.println("IFSC code is invalid for ICIC0002692.");
		}

		Thread.sleep(2000);
		

	}
	public void udaanRecomdation() throws Exception
	{
		getControl("Save for education").click();
		getControl("goalAmmount").enterText(testData.get("ammount"));
		getControl("years").enterText(testData.get("year"));
		getControl("goalAmmount").click();
		getControl("next").click();
		Thread.sleep(2000);
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
		getControl("Do you have any of these1").click();
		getControl("Do you have any of these?2").click();
		getControl("Do you have any of these?3").click();
		getControl("next").click();
		getControl("how much are you willing to invest?").click();
		getControl("income and expenses?").click();
		Thread.sleep(2000);
		

		getControl("next1").click();
		Thread.sleep(1000);
		getControl("next1").click();
		getControl("next").click();
		Thread.sleep(1000);
		
		verifyTitle();
		getControl("city").click();
		Thread.sleep(1000);
		getControl("next").click();
		getControl("next").click();
		Thread.sleep(1000);
		verifyTitle();
		getControl("noRadioButton").click();
		getControl("next").click();
		Thread.sleep(2000);
		getControl("udan").waitUntilVisible();
		if (getControl("udan").isVisible()) {
			System.out.println("Udan is verified");
		} else

		{
			System.out.println("not verified");
		}
		verifyTitle();
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
}
