package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirtpage {
	public Tshirtpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;
	
	@FindBy(xpath="(//a[@class='product_img_link'])")
	private WebElement or  ;
	
	public WebElement getOr() {
		return or;
	}
	

}
