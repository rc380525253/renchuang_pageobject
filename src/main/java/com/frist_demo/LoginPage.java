package com.frist_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
	private WebElement usernameBox;
	private WebElement passwordBox;
	private WebElement loginButton;
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public LoginPage(WebDriver dr){
		this.driver=dr;
		driver.get("http://127.0.0.1:81/zentao/user-login-L3plbnRhby8=.html");
		usernameBox = driver.findElement(By.cssSelector("input#account"));
		passwordBox = driver.findElement(By.cssSelector("input[name='password']"));
		loginButton = driver.findElement(By.cssSelector("button#submit"));
		
	}
	public MainPage loginPageoprate(String name,String password){
		usernameBox.sendKeys(name);
		passwordBox.sendKeys(password);
		loginButton.click();
		return new MainPage(getDriver());
	}
    public String loginFailopreat(String name,String password) throws InterruptedException{
    	usernameBox.sendKeys(name);
		passwordBox.sendKeys(password);
		loginButton.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String value = alert.getText();
		alert.accept();
		return value;
    }
}
