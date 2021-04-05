package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
	public WebDriver driver;
	@FindBy(id="email")
	private WebElement email;
	

	public Signinpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	@FindBy(id="passwd")
	private WebElement pass;
	
	
	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}

}
