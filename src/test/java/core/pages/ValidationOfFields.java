package core.pages;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import agent.IAgent;
import central.Configuration;
import control.WebControl;

public class ValidationOfFields extends FullPage {
	public ValidationOfFields(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);

	}

	VerifyTheQuestionaryForSamasta v = new VerifyTheQuestionaryForSamasta(this.getConfig(), this.getAgent(), testData);

	public void selectAllAndClearTheText() {
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_A);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_A);
		rt.keyPress(KeyEvent.VK_BACK_SPACE);
		rt.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

	public void undo() {
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_Z);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_Z);
	}

	public void validateFields() throws Exception {
		// tagValiadtionInpage();
		Thread.sleep(1000);
	if (v.tagValiadtionInpage() == true)
			getControl("clickNext").click();
		Thread.sleep(1000);
		
	//Address details
		if (v.tagValiadtionInpage() == true)
		{
		getControl("addressLine1").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforAddressLine1 = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforAddressLine1);
		logger.info(errorMessageforAddressLine1);
		Thread.sleep(1000);
		undo();

		// Clearing and getting the error message for City field

		getControl("city").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforCity = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforCity);
		logger.info(errorMessageforCity);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);

		// Clearing and getting the error message for State field

		getControl("state").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforState = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforState);
		logger.info(errorMessageforState);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);

		// Clearing and getting the error message for Pin Code field

		getControl("pinCode").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforPinCode = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforPinCode);
		logger.info(errorMessageforPinCode);
		Thread.sleep(1000);
		undo();
		getControl("clickNext").click();
		
		}

		// Personal details

		// Clearing and getting the error message for Father field
		
		if (v.tagValiadtionInpage() == true)
		{
		getControl("father").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforFathersname = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforFathersname);
		logger.info(errorMessageforFathersname);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);

		// Clearing and getting the error message for Mother field

		getControl("mother").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforMothersname = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforMothersname);
		logger.info(errorMessageforMothersname);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);
		getControl("clickNext").click();
		Thread.sleep(1000);

		}
		
		//Nominee Details
		// Clearing and getting the error message for Nominee name field
		if (v.tagValiadtionInpage() == true)
		{
		getControl("nomineeName").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageForNomineeName = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageForNomineeName);
		logger.info(errorMessageForNomineeName);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);
		getControl("clickNext").click();
		Thread.sleep(1000);
		}

		// Clearing and getting the error message for Nominee address field
		
	//Nominee Address
		if (v.tagValiadtionInpage() == true)
		{
		getControl("checkBox").click();
		getControl("nomineeAddress").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageForNomineeAddress = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageForNomineeAddress);
		logger.info(errorMessageForNomineeAddress);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);

		// Clearing and getting the error message for Nominee City field

		getControl("city").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforNomineeCity = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforNomineeCity);
		logger.info(errorMessageforNomineeCity);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);

		// Clearing and getting the error message for Nominee State field

		getControl("state").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforNomineeState = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforNomineeState);
		logger.info(errorMessageforNomineeState);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);

		// Clearing and getting the error message for Nominee Pin Code field

		getControl("pinCode").click();
		selectAllAndClearTheText();
		getControl("clickNext").click();
		String errorMessageforNomineePinCode = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforNomineePinCode);
		logger.info(errorMessageforNomineePinCode);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);
		getControl("clickNext").click();
		Thread.sleep(1000);
		}
	
		//Employment Details
		
		if (v.tagValiadtionInpage() == true)
		getControl("clickNext").click();
		Thread.sleep(1000);
		//OverDraft
		if (v.tagValiadtionInpage() == true)	
		getControl("overDraftOption").click();
		getControl("clickNext").click();
		Thread.sleep(1000);
		
		

		// Getting Goal details from recommendation page
		
		if (v.tagValiadtionInpage() == true)
		{
		String goalText = getControl("goalDisplayed").getText();
		Assert.assertEquals(VerifyTheQuestionaryForPrinto.goalSelected, goalText, "Selected goal is not same");

		// getting plan recommended and loan amount in last
		
		String planRecomended = getControl("recommendedPlan").getText();
		String loanAmount = getControl("loanAmount").getText();
		loanAmount = loanAmount.replaceAll("[^a-zA-Z0-9\\s+]", "").trim();
		int amt = Integer.parseInt(loanAmount);
		if (amt == 1000) {
			amt = amt + 17;
		}
		getControl("knowMore").click();
		Thread.sleep(1000);
		String productName = getControl("productName").getText();
		if (productName.contains(planRecomended)) {
			getControl("closeTab").click();
		} else {
			Assert.assertTrue(false, "Product Name is not Matching");
		}
		Thread.sleep(1000);
		getControl("clickNext").click();
		Thread.sleep(1000);
		String gDisplayed=getControl("goalV").getText();
		String contribution = getControl("monthlyContribution").getText();
		contribution = contribution.replaceAll("[^a-zA-Z0-9\\s+]", "").trim();
		int contributionAmount = Integer.parseInt(contribution);
		if (amt == contributionAmount && v.tagValiadtionInpage() == true && gDisplayed.equals(VerifyTheQuestionaryForPrinto.goalSelected)) {
			getControl("agree").click();
		} else {
			Assert.assertTrue(false, "Contribution amount is not same");
			logger.info("Contribution amount is not same");
		}
		Thread.sleep(3000);
		
//Bank details
		// Clearing and getting the error message for IFSC field
if(v.tagValiadtionInpage()==true)
{
		getControl("ifsc").click();
		Thread.sleep(1000);
		selectAllAndClearTheText();
		getControl("bankAccountNumber").click();
		String errorMessageforifsc = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforifsc);
		logger.info(errorMessageforifsc);
		Thread.sleep(1000);
		undo();
		
		// Clearing and getting the error message for Bank Account Number field
		
		getControl("bankAccountNumber").click();
		selectAllAndClearTheText();
		getControl("ifsc").click();
		String errorMessageforAccountNo = getControl("errorMsg").getText();
		Assert.assertTrue(getControl("errorMsg").isVisible(), errorMessageforAccountNo);
		logger.info(errorMessageforAccountNo);
		Thread.sleep(1000);
		undo();
		Thread.sleep(1000);
		getControl("setUpPayment").click();
		Thread.sleep(1000);
}

//last page
if(v.tagValiadtionInpage()==true)
{
		String status = getControl("status").getText();
		status = status.replace("!", "");
		if (status.equals("Payment setup was successful")) {
			getControl("clickNext").click();
		} else {
			Assert.assertTrue(false, "Succes Message Not displayed");
			logger.info("Succes Messafge Not displayed");
		}
		
		
		Thread.sleep(1000);
		String msg = getControl("recommendationMsg").getText();
		if (getControl("recommendationMsg").isVisible()) {
			getControl("googlePlay").click();
		} else {
			Assert.assertTrue(false, "Recommendation not same");
			logger.info("Recommendation not same");
		}
		Thread.sleep(1000);
	}
}
}
	}