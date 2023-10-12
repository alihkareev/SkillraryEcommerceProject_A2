package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.DemoSkillraryAppPage;
import POM.SkillraryHomePage;
import POM.TestingPage;

public class TestCase1 extends BaseClass {
@Test
public void tc1() throws Throwable {
	SkillraryHomePage s = new SkillraryHomePage(driver);
	s.gearsbutton();
	s.skillrarydemoapplink();
	utilities.childBrowser(driver);
	 DemoSkillraryAppPage dS=new  DemoSkillraryAppPage(driver);
	utilities.dropDowns(dS.getSelectDd(), pdata.getPropertyData("coursedd"));
	TestingPage tP= new TestingPage(driver);
	utilities.scrollBar(driver, tP.getFbIcon());
	tP.fbIconWebElement();
	
	
	
	
}
}
