package core.pages;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import agent.IAgent;
import central.Configuration;
import control.WebControl;

public class VerifyTheQuestionaryForPrinto extends FullPage {

	public VerifyTheQuestionaryForPrinto(Configuration config, IAgent agent, Map<String, String> testData)
			throws Exception {
		super(config, agent, testData);

	}

	public void logIn() throws Exception {
		getControl("userName").enterText(testData.get("userName"));
		getControl("passWord").enterText(testData.get("paasWord"));
		getControl("clickSignIn").click();
	}

	static String goalSelected;

	// Setting goal

	public void setGoal() throws Exception {
		getControl("goal").click();
		goalSelected = getControl("goal").getText();
		System.out.println("*****Goal selected is " + goalSelected);
	}

	// Verifying the questions

	public void verifyAndAnswerTheQuestions() throws Exception {
		String question_1 = getControl("verifyTheQuestion").getText();
		try {
			if (question_1.equals(testData.get("question1"))) {
				Thread.sleep(1000);
				JavascriptExecutor jse = (JavascriptExecutor)this.getAgent().getWebDriver();
				jse.executeScript("arguments[0].click()",((WebControl)getControl("goalAmount")).getRawWebElement());
				getControl("goalAmount").enterText("25556");
				Thread.sleep(1000);
				jse.executeScript("arguments[0].click()",((WebControl)getControl("goalDuration")).getRawWebElement());
				getControl("goalDuration").enterText("2");
				jse.executeScript("arguments[0].click()",((WebControl)getControl("goalAmount")).getRawWebElement());
				getControl("next").click();
			} else {
				org.testng.Assert.assertTrue(false, "Questions not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question2 = getControl("verifyTheQuestion").getText();
		String goal=getControl("goalName").getText();
		System.out.println("*********"+goal);
	
		/*
		 * if (!getControl("goalName").getText().contains(testData.get("goalTag"))) {
		 * org.testng.Assert.assertTrue(false, "Goal Name got change"); }
		 */
		try {
			if (question2.equals(testData.get("question2"))) {
				getControl("answer2").click();
			} else {
				org.testng.Assert.assertTrue(false, "Questions not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question3 = getControl("verifyTheQuestion").getText();
		/*
		 * if (!getControl("goalName").getText().contains(testData.get("goalTag"))) {
		 * org.testng.Assert.assertTrue(false, "Goal Name got change"); }
		 */
		try {
			if (question3.equals(testData.get("question3"))) {
				getControl("answer3").click();
			} else {
				org.testng.Assert.assertTrue(false, "Questions not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		
		/*
		 * if (!getControl("goalName").getText().contains(testData.get("goalTag"))) {
		 * org.testng.Assert.assertTrue(false, "Goal Name got change"); }
		 */
		String question4 = getControl("verifyTheQuestion").getText().trim();
		System.out.println("*******"+question4);
		System.out.println(testData.get("question4"));
		try {
			if (question4.equals(testData.get("question4").trim())) {
				getControl("answer4").click();
				//getControl("next").click();
			} else {
				org.testng.Assert.assertTrue(false, "Questions not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question5 = getControl("verifyTheQuestion").getText();
		System.out.println("Question 5 is "+question5);
		/*
		 * if (!getControl("goalName").getText().contains(testData.get("goalTag"))) {
		 * org.testng.Assert.assertTrue(false, "Goal Name got change"); }
		 */
		try {
			if (question5.equals(testData.get("question5"))) {
				getControl("answer5").click();
			} else {
				Assert.assertTrue(false, "Question not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question6 = getControl("verifyTheQuestion").getText();
		/*
		 * if (!getControl("goalName").getText().contains(testData.get("goalTag"))) {
		 * org.testng.Assert.assertTrue(false, "Goal Name got change"); }
		 */
		try {
			if (question6.equals(testData.get("question6"))) {
				getControl("answer6").click();
				getControl("next").click();
			} else {
				Assert.assertTrue(false, "Question not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question7 = getControl("verifyTheQuestion").getText();
		/*
		 * if (!getControl("goalName").getText().contains(testData.get("goalTag"))) {
		 * org.testng.Assert.assertTrue(false, "Goal Name got change"); }
		 */
		try {
			if (question7.equals(testData.get("question7"))) {
				getControl("answer7").click();
			} else {
				Assert.assertTrue(false, "Question not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		getControl("answer7").click();
	}

}
