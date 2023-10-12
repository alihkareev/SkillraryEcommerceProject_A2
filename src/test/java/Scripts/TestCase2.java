package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.DemoSkillraryAppPage;
import POM.InvoicePage;
import POM.SkillraryHomePage;

public class TestCase2 extends BaseClass{
	@Test

	public void tc2() {
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childBrowser(driver);
		 DemoSkillraryAppPage dS=new  DemoSkillraryAppPage(driver);
		 dS.feedBackButoon();
		 InvoicePage iP=new InvoicePage(driver);
		 iP.InvoiceButton();
	}
}
