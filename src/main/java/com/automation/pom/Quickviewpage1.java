package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quickviewpage1 {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plus ;
	
	public Quickviewpage1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColour() {
		return colour;
	}


	@FindBy(name="group_1")
	private WebElement size ;
	
	@FindBy(id="color_8")
	private WebElement colour ;
		
	@FindBy(xpath="(//a[@class='btn btn-default button-plus product_quantity_up'])")
	private WebElement pl ;
		
	@FindBy(name="Submit")
	private WebElement cart  ;
	
	@FindBy(id="color_24")
	private WebElement co  ;
	
	@FindBy(id="color_14")
	private WebElement c  ;
	
	public WebElement getC() {
		return c;
	}

	public WebElement getCo() {
		return co;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getPl() {
		return pl;
	}
}

