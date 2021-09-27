package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ConfigurationAnnotations {
  @Test
  public void searchCustomer() {
	  System.out.println("Search Customer");
  }
  
  @Test
  public void searchProduct() {
	  System.out.println("Search Product");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Sign in");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Sign out");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Open Test Application");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Close Test Application");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Open Chrome");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close Chrome");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Chrome - Set Up System Property");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Chrome - Clean Up All Cookies");
  }

}
