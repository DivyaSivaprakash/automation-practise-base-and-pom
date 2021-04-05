package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summerdresspage {
	public WebDriver driver;
	@FindBy(xpath="(//a[@class='product_img_link'])[2]")
	private WebElement dress1;

	public Summerdresspage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress1() {
		return dress1;
	}
	
	

}
