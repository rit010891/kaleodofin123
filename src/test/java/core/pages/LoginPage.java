package core.pages;

import java.io.File;
import java.sql.Driver;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import agent.IAgent;
import central.Configuration;
import enums.ConfigType;

public class LoginPage extends FullPage {

	public LoginPage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
		super(conf, agent, testData);
		assertPageLoad();
	}
// Successfull Login in
	public void successLogin() throws Exception {
		logger.debug(String.format("(%s) Logging in...", this.getPlatform()));
		switch (this.getPlatform()) {
		case IOS:
			break;
		case IOS_WEB:
			break;
		case ANDROID:
			break;
		case ANDROID_WEB:
			this.getAgent().goTo(System.getProperty("app_browser_url"));
			enterText(this.getTestData(), "username");
			enterText(this.getTestData(), "password");
			getControl("signin").click();
			Thread.sleep(5000);
			takeSnapShot();
			break;
		case DESKTOP_WEB:
			enterText(this.getTestData(), "username");
			enterText(this.getTestData(), "password");
			getControl("signin").click();
		//	getControl("goalText").assertVisible();
		//	getControl("goalText").click();
			Thread.sleep(5000);
			takeSnapShot();
			break;
		}
		logger.debug(String.format("(%s) Logging out...", this.getPlatform()));
	}

	// Failed Login
	public void failLogin() throws Exception {
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
			enterText(this.getTestData(), "username");
			enterText(this.getTestData(), "password");
			getControl("signin").click();
			getControl("invaliderror").assertVisible();
			getControl("invaliderror").click();
			takeSnapShot();
			break;
		}
		logger.debug(String.format("(%s) Logging out...", this.getPlatform()));
	}
	// Forgot Password test
		public void forgotPassword() throws Exception {
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
				enterText(this.getTestData(), "username");
				getControl("forgotPassword").click();
				enterText(this.getTestData(), "username");
				getControl("sendresetlink").click();
				getControl("resendlinkconfirmation").assertVisible();
				getControl("resendlinkconfirmation").click();
				takeSnapShot();
				takeSnapShot();
				break;
			}
			logger.debug(String.format("(%s) Logging out...", this.getPlatform()));
		}
	private void enterText(Map<String, String> testData, String control) throws Exception {
		getControl(control).enterText(testData.get(control));
		takeSnapShot();
	}
}
