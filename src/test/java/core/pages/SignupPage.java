package core.pages;

import java.util.Map;

import agent.IAgent;
import central.Configuration;

public class SignupPage extends FullPage {

	public SignupPage(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);
		assertPageLoad();
	}
	
	// invalidMobileNumber
		public void invalidMobileNumber() throws Exception {
			logger.debug(String.format("(%s) Logging in...", this.getPlatform()));
			switch (this.getPlatform()) {
			case IOS:
				break;
			case IOS_WEB:
				break;
			case ANDROID:
				break;
			case ANDROID_WEB:
				break;
			case DESKTOP_WEB:
				enterText(this.getTestData(), "email");
				enterText(this.getTestData(), "mobilenumber");
				enterText(this.getTestData(), "password");
				getControl("eyeicon").click();
				enterText(this.getTestData(), "confirmpassword");
				getControl("eyeicon").click();
				getControl("verify").click();
				break;
			}
			logger.debug(String.format("(%s) Logging out...", this.getPlatform()));
		}
//		Password mismatch
		public void passwordMismatch() throws Exception {
			logger.debug(String.format("(%s) Logging in...", this.getPlatform()));
			switch (this.getPlatform()) {
			case IOS:
				break;
			case IOS_WEB:
				break;
			case ANDROID:
				break;
			case ANDROID_WEB:
				break;
			case DESKTOP_WEB:
				enterText(this.getTestData(), "email");
				enterText(this.getTestData(), "mobilenumber");
				enterText(this.getTestData(), "password");
				getControl("eyeicon").click();
				enterText(this.getTestData(), "confirmpassword");
				getControl("eyeicon").click();
				getControl("verify").click();
				break;
			}
			logger.debug(String.format("(%s) Logging out...", this.getPlatform()));
			
		}

		private void enterText(Map<String, String> testData, String control) throws Exception {
			getControl(control).enterText(testData.get(control));
			takeSnapShot();
		}
}
 