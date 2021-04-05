package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="//a[@title='Women'][1]")
	private WebElement wom;

	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private WebElement tsh;
	
	public WebElement getTsh() {
		return tsh;
	}

	public WebElement getWom() {
		return wom;
	}

	public Dresspage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getSummer() {
		return summer;
	}

	@FindBy(xpath="(//a[@title='Summer Dresses'])[2]")
	private WebElement summer;
	
	@FindBy(xpath="(//a[@title='Casual Dresses'])[2]")
	private WebElement casual;
	
	@FindBy(xpath="(//a[@title='Evening Dresses'])[2]")
	private WebElement eve;

	public WebElement getEve() {
		return eve;
	}

	public WebElement getCasual() {
		return casual;
	}
	
	
}
