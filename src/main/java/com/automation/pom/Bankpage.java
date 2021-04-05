package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bankpage {
	public Bankpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver driver;
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bank;
	
	@FindBy(xpath="(//a[@class='cheque'])")
	private WebElement checkk;
	

	public WebElement getCheckk() {
		return checkk;
	}

	public WebElement getBank() {
		return bank;
	}

}
