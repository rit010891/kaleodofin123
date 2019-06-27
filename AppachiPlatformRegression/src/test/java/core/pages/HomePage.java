package core.pages;

import java.io.File;
import java.sql.Driver;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import agent.IAgent;
import central.Configuration;
import enums.ConfigType;

public class HomePage extends FullPage {

	public HomePage(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);
		assertPageLoad();
	}
	//Watch Tutorial
		public void watchTutorial() throws Exception {
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
				getControl("watchvideo").click();
				frame(this.getTestData());
				takeSnapShot();
				break;
			}
			logger.debug(String.format("(%s) Logging out...", this.getPlatform()));
		}
		private void frame(Map<String, String> testData) throws Exception {
			this.getAgent().getWebDriver().switchTo().frame(this.getAgent().getWebDriver().findElement(By.xpath("//iframe[@title='YouTube video player']")));
			takeSnapShot();
			Thread.sleep(2000);
			this.getAgent().getWebDriver().switchTo().activeElement().click();
			Thread.sleep(10000);
			this.getAgent().getWebDriver().switchTo().activeElement().click();
			takeSnapShot();
			this.getAgent().getWebDriver().switchTo().defaultContent();
			getControl("close").click();
		}
		@SuppressWarnings("null")
		public void verifyDurationError() throws Exception
		{
			getControl("Save for education").click();
			getControl("goalAmmount").enterText(testData.get("ammount"));
			getControl("years").enterText(testData.get("year"));
			getControl("goalAmmount").click();
			getControl("years").click();
			if(getControl("MinimumGoalammountrrormessage").isVisible())
			{
				String text = getControl("MinimumGoalammountrrormessage").getText();
				System.out.println(text);
			
				
			}
			if(getControl("MinimumGoaldurationerrormessage").isVisible())
			{
				String text = getControl("MinimumGoaldurationerrormessage").getText();
				System.out.println(text);
			
				
			}
			if(getControl("monthlycontribution").isVisible())
			{
				
				System.out.println("Minimum monthly contribution is not shown ");
			
				
			}
			Thread.sleep(2000);
			getControl("goalAmmount").enterText(Keys.CONTROL + "a");
			getControl("goalAmmount").enterText(Keys.DELETE);
			getControl("goalAmmount").enterText(testData.get("ammount1"));
			getControl("years").enterText(Keys.CONTROL + "a");
			getControl("years").enterText(Keys.DELETE);
			getControl("years").enterText(testData.get("year1"));
			getControl("years").enterText(Keys.ENTER);
			Thread.sleep(1000);
			if(getControl("monthlycontribution1").isVisible())
			{
				String text = getControl("monthlycontribution1").getText();
				System.out.println(" monthly contribution is"+ text);
			
			}
		
		
			
		}
		public void verifyMaxDurationError() throws Exception
		{
			getControl("Save for education").click();
			getControl("goalAmmount").enterText(testData.get("ammount"));
			getControl("years").enterText(testData.get("year"));
			getControl("goalAmmount").click();
			Thread.sleep(1000);
			if(getControl("MaxGoaldurationerrormessage").isVisible())
			{
				String text = getControl("MaxGoaldurationerrormessage").getText();
				System.out.println(text);
			}
			
				
			
		}
		
		

}
