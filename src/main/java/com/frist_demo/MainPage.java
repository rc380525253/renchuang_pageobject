package com.frist_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	private WebDriver driver;
	private WebElement userMenu;
	
	
	public MainPage(WebDriver dr){
		this.driver=dr;
		this.userMenu = driver.findElement(By.cssSelector("div#userMenu"));
	}
	public String getloginUserMenu(){
		return userMenu.getText();
		
	}
}
