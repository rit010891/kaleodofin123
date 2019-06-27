package core.pages;

import java.util.Map;

import org.openqa.selenium.By;

import agent.IAgent;
import central.Configuration;

public class ProductRecommendation extends FullPage {

	public ProductRecommendation(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);
		assertPageLoad();
	}

	// Product Recommendation
	public void productRecom() throws Exception {
		logger.debug(String.format("(%s) Logging in...", this.getPlatform()));
		switch (this.getPlatform()) {
		case IOS:
			break;
		case IOS_WEB:
			break;
		case ANDROID:
			break;
		/*
		 * case ANDROID_WEB: getControl("childeducation").click();
		 * enterDataMweb(this.getTestData()); takeSnapShot(); break;
		 */
		case DESKTOP_WEB:
			getControl("childeducation").click();
			enterData(this.getTestData());
			takeSnapShot();
			break;
		}
		logger.debug(String.format("(%s) Logging out...", this.getPlatform()));
	}

	private void enterData(Map<String, String> testData) throws Exception {
		getControl("goalAmmount").enterText(testData.get("ammount"));
		getControl("goalDuration").enterText(testData.get("year"));
		getControl("savings").click();
		// Click on Next button 
		getControl("nextBtn").click();
		getControl("familyMember").click();
		Thread.sleep(5000);
		getControl("workInFamily").click();
		Thread.sleep(5000);
		getControl("typeofLoan").click();
	    getControl("nextBtn").click();
		Thread.sleep(5000);
        getControl("loanEMI").click();
        getControl("householdExpenditure").click();
        getControl("nextBtn").click();
        getControl("yourIncomeExpenses").click();
    	Thread.sleep(5000);
        getControl("nextBtn").click();
    	Thread.sleep(5000);
        getControl("nextBtn").click();
    	Thread.sleep(5000);
        getControl("nextBtn").click();
    	Thread.sleep(5000);
        getControl("nextBtn").click();
    	Thread.sleep(5000);
        getControl("addressCheckBox").click();
    	Thread.sleep(5000);
        getControl("nextBtn").click();
    	Thread.sleep(5000);
        getControl("nextBtn").click();
    	Thread.sleep(5000);
        getControl("employmentDetails").click();
    	Thread.sleep(5000);
        getControl("nextBtn").click();
    	Thread.sleep(5000);
	    // Recommendation screen
	    getControl("knowMoreBtn").click();
	    Thread.sleep(5000);
	    // Verify Know More details are shown
	    getControl("knowMoreContent").assertVisible();
	    Thread.sleep(5000);
	    // Click on Close btn
	    getControl("closeBtn").click();
	    Thread.sleep(5000);
	    getControl("nextBtn").click();
	    Thread.sleep(5000);
	    // Product details screen
	    getControl("t&CBtn").click();
	    Thread.sleep(5000);
	    // Verify Terms and Conditions are shown
	    getControl("t&CContent").assertVisible();
	    Thread.sleep(5000);
	    // Click on close button
	    getControl("closeBtn").click();
	    Thread.sleep(5000);
	    getControl("acceptBtn").click();
	    Thread.sleep(3000);
	    getControl("nextBtn").click();
	    Thread.sleep(4000);
	    // KYC screen
	    getControl("nextBtn").click();
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
	    getControl("nextBtn").click();
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

	/*
	 * private void enterDataMweb(Map<String, String> testData) throws Exception {
	 * getControl("goalAmmount").enterText(testData.get("ammount"));
	 * getControl("goalDuration").enterText(testData.get("year"));
	 * getControl("savings").click(); getControl("nextBtn").click();
	 * getControl("familyMember").click(); Thread.sleep(10000);
	 * 
	 * getControl("workInFamily").click();
	 * 
	 * Thread.sleep(5000); getControl("typeofLoan").click(); Thread.sleep(5000);
	 * getControl("nextBtn").click(); Thread.sleep(5000);
	 * getControl("loanEMI").click(); Thread.sleep(5000);
	 * getControl("householdExpenditure").click(); getControl("nextBtn").click();
	 * Thread.sleep(5000); getControl("yourIncomeExpenses").click();
	 * Thread.sleep(5000); getControl("nextBtn").click(); Thread.sleep(5000);
	 * getControl("nextBtn").click(); Thread.sleep(5000);
	 * getControl("nextBtn").click(); getControl("nextBtn").click();
	 * Thread.sleep(5000); getControl("addressCheckBox").click();
	 * Thread.sleep(5000); getControl("nextBtn").click(); Thread.sleep(5000);
	 * getControl("nextBtn").click(); Thread.sleep(5000);
	 * getControl("employmentDetails").click(); Thread.sleep(5000);
	 * getControl("nextBtn").click(); // Scroll down scrollDown(); // Recommendation
	 * screen getControl("knowMoreBtn").hover(); getControl("knowMoreBtn").click();
	 * Thread.sleep(5000); // Verify Know More details are shown
	 * getControl("knowMoreContent").assertVisible(); Thread.sleep(5000); // Click
	 * on Close btn getControl("closeBtn").click();
	 * 
	 * Thread.sleep(5000); getControl("nextBtn").click(); Thread.sleep(5000); //
	 * Scroll Down scrollDown(); // Product details screen
	 * getControl("t&CBtn").click(); Thread.sleep(5000); // Verify Terms and
	 * Conditions are shown getControl("t&CContent").assertVisible();
	 * Thread.sleep(5000); // Click on close button getControl("closeBtn").click();
	 * Thread.sleep(5000); getControl("acceptBtn").hover();
	 * getControl("acceptBtn").click(); // KYC screen getControl("nextBtn").click();
	 * Thread.sleep(5000); // Scroll down scrollDown(); /* // Bank details screen
	 * and clear IFSC code getControl("ifscTxt").clear(); // Enter invalid IFSC code
	 * getControl("ifscTxt").enterText(testData.get("invalidIFSC"));
	 * Thread.sleep(5000); // Search button click getControl("searchBtn").click();
	 * Thread.sleep(4000); // Verify error message is shown on invalid IFSC
	 * getControl("invalidIFSCErrMsg").assertVisible(); Thread.sleep(4000); // Bank
	 * details screen and clear IFSC code getControl("ifscTxt").clear(); // Search
	 * button click getControl("searchBtn").click(); Thread.sleep(5000); // Verify
	 * error message is shown on empty IFSC
	 * getControl("invalidIFSCErrMsg").assertVisible();
	 * 
	 * // Verify Bank name getControl("bankName").assertVisible(); // Verify Branch
	 * name getControl("bankBranch").assertVisible(); // Verify Bank code
	 * getControl("bankCode").assertVisible(); // Enter valid IFSC code
	 * getControl("ifscTxt").enterText(testData.get("validIFSC"));
	 * Thread.sleep(5000); // Search button click getControl("searchBtn").click();
	 * Thread.sleep(4000); // Clear the account number
	 * getControl("accountNumberTxt").clear(); Thread.sleep(5000); // Click on Setup
	 * Payment in Bank details getControl("setupPaymentBtn").click();
	 * Thread.sleep(4000); // Search button click getControl("searchBtn").click();
	 * Thread.sleep(6000); // Scroll Down scrollDown(); // Click on Setup Payment in
	 * Bank details getControl("setupPaymentBtn").click(); Thread.sleep(4000); //
	 * Click on Next in Bank details getControl("nextBtn").click();
	 * Thread.sleep(4000); // Verify Promotion screen is shown
	 * getControl("congratulationsTxt").assertVisible(); Thread.sleep(4000); //
	 * Click on Google Play button getControl("googlePlayBtn").click();
	 * Thread.sleep(4000); try { switchToNativeView();
	 * getControl("googlePlayScreen").click(); }catch (Exception e) {}
	 * Thread.sleep(10000); takeSnapShot(); takeSnapShot();
	 * 
	 * }
	 */

}
