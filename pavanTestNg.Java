package pageobject;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg {
	//DependsOnMethods
	@Test
	public void TestNg01() {
		System.out.println("TestNg01");
		Assert.assertFalse(false);
	}
	
	@Test(dependsOnMethods = "TestNg01")
	public void TestNg02() {
		System.out.println("TestNg02");
		
	}
	
	//Priority checking
	@Test(priority=2)
	public void priority2() {
		System.out.println("priority2");
	}
	
	@Test(priority=1)
	public void priority1() {
		System.out.println("priority1");
	}
	
	//DataProvider checking
	@Test(dataProvider="dataMethod")
	public void testMethod(String param) {
		System.out.println("The parameter is::"+ param);
	}
	
	@Test(invocationCount = 3)
	public void testMethod1() {
		System.out.println("count");
	}
	
	@DataProvider
	public Object[][] dataMethod() {
		return new Object[][] { {"A"}, {"B"}, {"C"}, {"D"}, {"E"}};
	}
	
	
	
    @BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeSuite
	public void Test02() {
		System.out.println("Test2");
	}
	
	@BeforeMethod
	public void Test03() {
		System.out.println("Test3");
	}
	
	@BeforeTest
	public void Test04() {
		System.out.println("Test4");
	}
	
	@AfterMethod
	public void Test05() {
		System.out.println("Test5");
	}
	
	@AfterSuite
	public void Test06() {
		System.out.println("Test6");
	}
	
	@AfterTest
	public void Test07() {
		System.out.println("Test7");
	}
	
	@AfterClass
	public void Test08() {
		System.out.println("Test9");
	}
	
		
		

	}


