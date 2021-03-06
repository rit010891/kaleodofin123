package core.pages;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import agent.IAgent;
import central.Configuration;
import control.WebControl;

public class VerifyTheQuestionaryForSamasta extends FullPage {
	
	

	public VerifyTheQuestionaryForSamasta(Configuration config, IAgent agent, Map<String, String> testData)
			throws Exception {
		super(config, agent, testData);
	}
	
	public void logIn() throws Exception {
		getControl("userName").enterText(testData.get("userName"));
		getControl("passWord").enterText(testData.get("paasWord"));
		getControl("clickSignIn").click();
	}
	public void setGoal() throws Exception {
		getControl("goal").click();
	}
	public  boolean  tagValiadtionInpage() throws Exception
	{
		boolean b=true;
		String tag=getControl("pageValidationTag").getText().trim();
		 String pageValiadationTag=VerifyTheQuestionaryForPrinto.goalSelected
		  +" | ? "+"1000 "+"per month for ".concat(getTestData().get("goalDuration")+
		  " years");
		 tag=tag.replaceAll("[^a-zA-Z0-9\\s+]","").trim();
		 pageValiadationTag=pageValiadationTag.replaceAll("[^a-zA-Z0-9\\s+]","").trim();
		if(!pageValiadationTag.equalsIgnoreCase(tag))
		  {	
		b=false;
		logger.info("page Valiadation Tag is not correct");
		 }
		return b;
		
	}
	
	static  String mnthlyContribution;
	public void verifyAndAnswerTheQuestions() throws Exception {
		String question_1 = getControl("verifyTheQuestion").getText();
		try {
			if (question_1.equals(testData.get("question1"))) {
				JavascriptExecutor jse = (JavascriptExecutor)this.getAgent().getWebDriver();
				jse.executeScript("arguments[0].click()",((WebControl)getControl("goalAmount")).getRawWebElement());
				getControl("goalAmount").enterText("25556");
				Thread.sleep(1000);
				jse.executeScript("arguments[0].click()",((WebControl)getControl("goalDuration")).getRawWebElement());
				getControl("goalDuration").enterText("2");
				
				getControl("next").click();
			} else {
				org.testng.Assert.assertTrue(false, "Questions not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question2 = getControl("verifyTheQuestion").getText();
		try {
			if(tagValiadtionInpage()==true && (question2.equals(testData.get("question2"))))
			{
		
				getControl("answer2").click();
			} else {
				org.testng.Assert.assertTrue(false, "Questions not found");
			}
		 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
		String question3 = getControl("verifyTheQuestion").getText();
		try {
			if (tagValiadtionInpage()==true && question3.equals(testData.get("question3"))) {
				getControl("answer3").click();
			} else {
				org.testng.Assert.assertTrue(false, "Questions not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question4 = getControl("verifyTheQuestion").getText();
		try {
			if (tagValiadtionInpage()==true && question4.equals(testData.get("question4"))) {
				getControl("answer4").click();
			} else {
				org.testng.Assert.assertTrue(false, "Questions not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question5 = getControl("verifyTheQuestion").getText();
		try {
			if (tagValiadtionInpage()==true && question5.equals(testData.get("question5"))) {
				getControl("answer5").click();
			} else {
				Assert.assertTrue(false, "Question not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question6 = getControl("verifyTheQuestion").getText();
		try {
			if (tagValiadtionInpage()==true && question6.equals(testData.get("question6"))) {
				getControl("answer6").click();
			} else {
				Assert.assertTrue(false, "Question not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question7 = getControl("verifyTheQuestion").getText();
		try {
			if (tagValiadtionInpage()==true && question7.equals(testData.get("question7"))) {
				getControl("answer7").click();
			} else {
				Assert.assertTrue(false, "Question not found");
			
		} }catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question8 = getControl("verifyTheQuestion").getText();
		try {
				
			if (tagValiadtionInpage()==true && question8.equals(testData.get("question8"))) {
				getControl("answer8").click();
				Thread.sleep(1000);
				getControl("clickNext").click();
			} else {
				Assert.assertTrue(false, "Question not found");
			
				}
				}
		catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question9 = getControl("verifyTheQuestion").getText();
		try {
			if (tagValiadtionInpage()==true && question9.equals(testData.get("question9"))) {
				getControl("answer9").click();
			} else {
				Assert.assertTrue(false, "Question not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		String question10 = getControl("verifyTheQuestion").getText();
		try {
			if (tagValiadtionInpage()==true && question10.equals(testData.get("question10"))) {
				getControl("answer10").click();
				Thread.sleep(1000);
			} else {
				Assert.assertTrue(false, "Question not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
