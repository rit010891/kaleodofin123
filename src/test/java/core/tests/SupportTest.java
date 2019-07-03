package core.tests;

import java.lang.reflect.Method;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import agent.AgentFactory;
import agent.IAgent;
import central.Configuration;
import core.pages.HomePage;
import core.pages.LakshyaRecommendation;
import core.pages.VerifyTheQuestionaryForSamasta;
import core.pages.LoginPage;
import core.pages.ProductRecommendation;
import core.pages.SignupPage;
import core.pages.UdaanRecomdation;
import core.pages.ValidationOfFields;
import core.pages.VerifyTheQuestionaryForPrinto;
import central.AppachhiCentral;


public class SupportTest {
	protected static Logger logger = AppachhiCentral.getLogger();
	private Configuration conf = null;
	protected core.pages.LoginPage login;
	protected core.pages.HomePage home;
	protected core.pages.ProductRecommendation product;
	public  core.pages.UdaanRecomdation up;
	protected core.pages.SignupPage signup;
	private IAgent agent;
	private ITestContext context = null;
	public LakshyaRecommendation lr;
	private String testName = null;
	protected VerifyTheQuestionaryForSamasta vf;
	protected ValidationOfFields validate;
	protected VerifyTheQuestionaryForPrinto printo;

	@BeforeSuite(alwaysRun = true)
	public void runOncePerSuite() throws Exception {
		AppachhiCentral.INSTANCE.init();
		logger = AppachhiCentral.getLogger();
		logger.info("Central setup completed.");
	}

	@BeforeTest(alwaysRun = true)
	public void runOncePerContext(ITestContext context) throws Exception {
		logger.info(String.format("Test context setup started for %s test.", context.getName()));
		AppachhiCentral.INSTANCE.registerContext(context);
		logger.info(String.format("Test context setup completed for %s test.", context.getName()));
	}

	@BeforeClass(alwaysRun = true)
	public void runOncePerClass(ITestContext context) throws Exception {
		this.context = context;
		this.conf = AppachhiCentral.INSTANCE.getContextConfig(context);
	}

	@BeforeMethod(alwaysRun = true)
	public void runOncePerMethod(ITestContext context, Method method) throws Exception {
		testName = method.getName();
		logger.info(String.format("Set up for test method [%s] started.", testName));
		logger.debug(String.format("Creating agent for %s", this.conf.getPlatform()));
		agent = AgentFactory.createAgent(this.conf);
		logger.debug(String.format("Test Method Name Started :: %s", testName));
		Map<String, String> testData = AppachhiCentral.INSTANCE.getTestData(context, testName);
		login = new LoginPage(this.conf, agent, testData);
		vf=new VerifyTheQuestionaryForSamasta(this.conf, agent, testData);
		validate=new ValidationOfFields(this.conf, agent, testData);
		printo=new VerifyTheQuestionaryForPrinto(this.conf, agent, testData);
		home = new HomePage(this.conf, agent, testData);
		product=new ProductRecommendation(this.conf,agent,testData);
		up=new UdaanRecomdation(this.conf, agent, testData);
		signup = new SignupPage(this.conf, agent, testData);
		lr=new LakshyaRecommendation(conf, agent, testData);
		logger.info(String.format("Set up for test method [%s] ended.", testName));
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) throws Exception {
		logger.info(String.format("Tear down for test method [%s] started.", testName));
		if (ITestResult.FAILURE == result.getStatus()) {
			agent.takeSnapShot();
		}
		agent.quit();
		logger.info(String.format("Tear down for test method [%s] ended.", testName));
	}

	protected String getTestInfoMessage(String stage, String method) {
		return String.format("Test method [%s] %sed.", method, stage);
	}

	protected String getTestStartInfoMessage(String method) {
		return getTestInfoMessage("start", method);
	}

	protected String getTestEndInfoMessage(String method) {
		return getTestInfoMessage("end", method);
	}
}
