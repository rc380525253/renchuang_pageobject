package com.first_demo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.frist_demo.LoginPage;
import com.frist_demo.MainPage;

public class LoginTest {
  WebDriver driver;
  @BeforeTest
  public void setUp(){
	  driver=new ChromeDriver();
  }
  
         
  @Test
  public void logintest01() {
	  LoginPage lg = new LoginPage(driver);
	  MainPage mg = lg.loginPageoprate("admin","rc0.12345678");
	  String value = mg.getloginUserMenu();
	  Assert.assertEquals(value.contains("admin"), true);
    
  }
  @Test
  public void faillogintest01() throws InterruptedException {
	  LoginPage lg = new LoginPage(driver);
	  String value = lg.loginFailopreat("admin","rc0.123456");
	  Assert.assertEquals(value.contains("登录失败"), true);
  }
  @AfterTest
  public void tearDown() throws InterruptedException{
	  Thread.sleep(3000);
	  driver.quit();
  }
}
