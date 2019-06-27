package core.tests;

import org.testng.annotations.Test;

public class ScenariosNewPatners extends SupportTest
{
	@Test(enabled = false, priority = 4)

	public void watchTutorialTest() throws Exception {
		logger.debug(this.getTestStartInfoMessage("watchTutorialTest"));
		login.successLogin();
		home.watchTutorial();
		logger.debug(this.getTestEndInfoMessage("watchTutorialTest"));	
	}
	@Test(enabled = false, priority = 4)
	public void verifyMinimumGoalAmountDuration() throws Exception {
		logger.debug(this.getTestStartInfoMessage("verifyminGoalAmmountDuration"));
		login.successLogin();
		home.verifyDurationError();
		logger.debug(this.getTestEndInfoMessage("verifyminGoalAmmountDuration"));	
	}
	
	@Test(enabled = false, priority = 5)
	public void verifyMaximumGoalDuration() throws Exception {
		logger.debug(this.getTestStartInfoMessage("verifyMaxGoalAmmountDuration"));
		login.successLogin();
		home.verifyMaxDurationError();
		logger.debug(this.getTestEndInfoMessage("verifyMaxGoalAmmountDuration"));	
	}
	@Test(enabled = false, priority = 3)
	public void udaanRecommendation() throws Exception {
		logger.debug(this.getTestStartInfoMessage("UdaanRecomdation"));
		login.successLogin();
		up.udaanRecomdation();
		logger.debug(this.getTestEndInfoMessage("UdaanRecomdation"));	
	}
	@Test(enabled = true, priority = 2)
	public void resumeBankdetails() throws Exception {
		logger.debug(this.getTestStartInfoMessage("watchTutorialTest"));
		login.successLogin();
		up.resumeBankDetails();
		logger.debug(this.getTestEndInfoMessage("watchTutorialTest"));	
	}		
	@Test(enabled = false, priority = 3)
	public void LakshyaRecommendation() throws Exception {
		logger.debug(this.getTestStartInfoMessage("LakshyaRecommendation"));
		login.successLogin();
		lr.verifyLakshyaRecommendation();
		logger.debug(this.getTestEndInfoMessage("LakshyaRecommendation"));	
	}
	@Test(enabled = false, priority = 3)
	public void loginTestPass() throws Exception {
		logger.debug(this.getTestStartInfoMessage("LoginTestPass"));
		login.successLogin();
		logger.debug(this.getTestEndInfoMessage("LoginTestPass"));	
	}
	@Test(enabled = false, priority = 3)
	public void loginTestFail() throws Exception {
		logger.debug(this.getTestStartInfoMessage("LoginTestFail"));
		login.failLogin();
		logger.debug(this.getTestEndInfoMessage("LoginTestFail"));	
	}
	@Test(enabled = false, priority = 3)
	public void forgotPasswordTest() throws Exception {
		logger.debug(this.getTestStartInfoMessage("forgotPasswordTest"));
		login.forgotPassword();
		logger.debug(this.getTestEndInfoMessage("forgotPasswordTest"));	
	}


}
