package testNGMain;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGMainRunner {

	public static void main(String[] args) {

		TestNG runner = new TestNG();

		// Create a list of String
		List<String> suitefiles = new ArrayList<String>();
		 String strRelPath = TestNGMainRunner.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			
				 System.out.println(strRelPath.split("/bin")[0]);
				 
		// Add xml file which you have to execute /Cukes_Version_3_2Scenario_Fixed_New/Config/suite.xml
		suitefiles.add(strRelPath.split("/bin")[0]+"/suite.xml");

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
	}

}
