package testNGMain;

import java.util.ArrayList;
import java.util.List;
import tests.TestSet1_ApiTest;
import org.testng.TestNG;

public class TestNGMainRunner {

	public static void main(String[] args) {

		TestNG runner = new TestNG();
		runner.setTestClasses(new Class[] { TestSet1_ApiTest.class });
		
		// Create a list of String
		List<String> suitefiles = new ArrayList<String>();
		 String strRelPath = TestNGMainRunner.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			
				/* System.out.println(strRelPath.split("/bin")[0]);
				 System.out.println(System.getProperty("user.dir"));*/
				 
		// Add xml file which you have to execute /Cukes_Version_3_2Scenario_Fixed_New/Config/suite.xml
		suitefiles.add(System.getProperty("user.dir")+"\\suite.xml");
//		suitefiles.add(strRelPath.split("/bin")[0]+"/suite.xml");
		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
	}

}
