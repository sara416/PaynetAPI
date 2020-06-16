package tests;

//import org.junit.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

import static io.restassured.RestAssured.given;
//import com.aventstack.extentreports.ExtentReports;

public class TestSet1_ApiTest{
	
	@Test
	public void validateAPISample(){
//		System.out.println(given().get("http://dummy.restapiexample.com/api/v1/employees").then().statusCode(200));
//		System.out.println(new Object(){ }.getClass().getEnclosingMethod().getName()+ " - Validation with valid Zip code");
//		Assert.assertTrue(homepage.getCurrentLocation().contains( "Bell Gardens 90201"));
		String username = "8BSPR7J5LX29CDI0ERN321Pisz3NqcAHrgc117_PHjOOIAQnk";
		String password = "jF1Mv180zPm0gtTF9m0189KEAO2yLt1gflru";	
		RestAssured.config = RestAssured.config().sslConfig(new SSLConfig().keyStore(System.getProperty("user.dir")+"/src/test/resources/myProject_keyAndCertBundle.jks", "test1234"));
		
//		RestAssured.config().sslConfig(new SSLConfig().keyStore("/paynetMaven/src/test/resources/myProject_keyAndCertBundle.jks", "test1234"));		
//		Assert.assertTrue(given().auth().preemptive().basic(username, password).get("https://sandbox.api.visa.com/globalatmlocator/vdp/helloworld").statusCode());
		System.out.println(given().auth().preemptive().basic(username, password).get("https://sandbox.api.visa.com/globalatmlocator/vdp/helloworld").then().log().all());
//		System.out.println(given().get("http://dummy.restapiexample.com/api/v1/employees").then().statusCode(200).log().all());

		
	}

	
	
}
