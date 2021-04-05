package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Backtoorder {
	public WebDriver driver;
	@FindBy(xpath="(//i[@class='icon-chevron-left'])[1]")
	private WebElement back ;

	public Backtoorder(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBack() {
		return back;
	}

}
