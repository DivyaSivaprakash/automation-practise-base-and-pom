package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continuepage {
	
	public WebDriver driver;

	public Continuepage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//i[@class='icon-chevron-left left']")
	private WebElement conti;

	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement check;

	public WebElement getCheck() {
		return check;
	}

	public WebElement getConti() {
		return conti;
	}
	}
	
	
	

