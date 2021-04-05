package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tickpage {
	public WebDriver driver;
	@FindBy(name="cgv")
	private WebElement tick;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement proc;

	public WebElement getProc() {
		return proc;
	}

	public Tickpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTick() {
		return tick;
	}

}
