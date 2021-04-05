package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdress {
	
	public WebDriver driver;
	@FindBy(xpath="//a[@class='product_img_link']")
	private WebElement quick1 ;

	public Eveningdress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuick1() {
		return quick1;
	}

}
