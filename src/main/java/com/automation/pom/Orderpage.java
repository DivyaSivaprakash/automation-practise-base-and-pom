package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderpage {
	public WebDriver driver;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement che ;

	public Orderpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getChe() {
		return che;
	}


}
