package core.tests;

//import org.testng.annotations.BeoreClass;
import org.testng.annotations.Test;

public class Scenarios extends SupportTest {

	/*
	 * @Test(enabled = true, priority = 4)
	 * 
	 * public void watchTutorialTest() throws Exception {
	 * logger.debug(this.getTestStartInfoMessage("watchTutorialTest"));
	 * login.successLogin(); home.watchTutorial();
	 * logger.debug(this.getTestEndInfoMessage("watchTutorialTest")); }
	 * 
	 * @Test(enabled = true, priority = 4) public void
	 * verifyMinimumGoalAmountDuration() throws Exception {
	 * logger.debug(this.getTestStartInfoMessage("verifyminGoalAmmountDuration"));
	 * login.successLogin(); home.verifyDurationError();
	 * logger.debug(this.getTestEndInfoMessage("verifyminGoalAmmountDuration")); }
	 * 
	 * @Test(enabled = true, priority = 5) public void verifyMaximumGoalDuration()
	 * throws Exception {
	 * logger.debug(this.getTestStartInfoMessage("verifyMaxGoalAmmountDuration"));
	 * login.successLogin(); home.verifyMaxDurationError();
	 * logger.debug(this.getTestEndInfoMessage("verifyMaxGoalAmmountDuration")); }
	 * 
	 * @Test(enabled = true, priority = 3) public void udaanRecommendation() throws
	 * Exception { logger.debug(this.getTestStartInfoMessage("UdaanRecomdation"));
	 * login.successLogin(); up.udaanRecomdation();
	 * logger.debug(this.getTestEndInfoMessage("UdaanRecomdation")); }
	 * 
	 * @Test(enabled = true, priority = 2) public void resumeBankdetails() throws
	 * Exception { logger.debug(this.getTestStartInfoMessage("watchTutorialTest"));
	 * login.successLogin(); up.resumeBankDetails();
	 * logger.debug(this.getTestEndInfoMessage("watchTutorialTest")); }
	 * 
	 * @Test(enabled = true, priority = 3) public void LakshyaRecommendation()
	 * throws Exception {
	 * logger.debug(this.getTestStartInfoMessage("LakshyaRecommendation"));
	 * login.successLogin(); lr.verifyLakshyaRecommendation();
	 * logger.debug(this.getTestEndInfoMessage("LakshyaRecommendation")); }
	 * 
	 * @Test(enabled = true, priority = 3) public void loginTestPass() throws
	 * Exception { logger.debug(this.getTestStartInfoMessage("LoginTestPass"));
	 * login.successLogin();
	 * logger.debug(this.getTestEndInfoMessage("LoginTestPass")); }
	 * 
	 * @Test(enabled = true, priority = 3) public void loginTestFail() throws
	 * Exception { logger.debug(this.getTestStartInfoMessage("LoginTestFail"));
	 * login.failLogin(); logger.debug(this.getTestEndInfoMessage("LoginTestFail"));
	 * }
	 * 
	 * @Test(enabled = true, priority = 3) public void forgotPasswordTest() throws
	 * Exception { logger.debug(this.getTestStartInfoMessage("forgotPasswordTest"));
	 * login.forgotPassword();
	 * logger.debug(this.getTestEndInfoMessage("forgotPasswordTest")); }
	 * 
	 * @Test(enabled = true, priority = 3) public void productRecommendation()
	 * throws Exception {
	 * logger.debug(this.getTestStartInfoMessage("productRecommendation"));
	 * login.successLogin(); product.productRecom();
	 * logger.debug(this.getTestEndInfoMessage("productRecommendation")); }
	 * 
	 * @Test public void invalidMobileNumberTest() throws Exception {
	 * logger.debug(this.getTestStartInfoMessage("invalidMobileNumberTest"));
	 * signup.invalidMobileNumber();
	 * logger.debug(this.getTestEndInfoMessage("invalidMobileNumberTest")); }
	 * 
	 * @Test public void passwordMismatchTest() throws Exception {
	 * logger.debug(this.getTestStartInfoMessage("passwordMismatchTest"));
	 * signup.passwordMismatch();
	 * logger.debug(this.getTestEndInfoMessage("passwordMismatchTest")); }
	 */

	@Test(enabled = false)
	public void TC1_verifyTheQuestionaryForSamasta() throws Exception {
		vf.logIn();
		Thread.sleep(1000);
		vf.setGoal();
		Thread.sleep(1000);
		vf.verifyAndAnswerTheQuestions();

	}

	@Test(enabled = true)
	public void TC2_validationForFields() throws Exception {
		printo.logIn();
		Thread.sleep(1000);
		printo.setGoal();
		Thread.sleep(1000);
		vf.verifyAndAnswerTheQuestions();
		Thread.sleep(1000);
		validate.validateFields();
	}

	@Test(enabled = false)
	public void TC3_verifyTheQuestionaryForPrinto() throws Exception {
		printo.logIn();
		Thread.sleep(2000);
		printo.setGoal();
		Thread.sleep(1000);
		printo.verifyAndAnswerTheQuestions();
	
		
	}
}
