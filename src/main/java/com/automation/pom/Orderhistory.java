package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderhistory {
	public WebDriver driver;

	@FindBy(xpath="(//div[@class='columns-container'])")
	private WebElement ff ;

	public Orderhistory(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//i[@class='icon-chevron-left'][1]")
	private WebElement bb;
	

	public WebElement getBb() {
		return bb;
	}

	public WebElement getFf() {
		return ff;
	}
}
