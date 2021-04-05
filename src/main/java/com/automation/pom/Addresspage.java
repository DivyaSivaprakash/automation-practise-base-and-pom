package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresspage {
	public WebDriver driver;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[7]")
	private WebElement proceed;


	public Addresspage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getProceed() {
		return proceed;
	}
	
}
