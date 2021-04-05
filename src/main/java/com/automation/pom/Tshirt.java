package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt {
	public WebDriver driver;
	
@FindBy (xpath="(//a[@title='T-shirts'])[2]")
private WebElement tshirt;

public Tshirt(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}

public WebElement getTshirt() {
	return tshirt;
}
@FindBy(xpath="(//a[@title='Tops'])[2]")
private WebElement top ;


public WebElement getTop() {
	return top;
}
}
