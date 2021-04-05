package com.Automation_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wo_cls_Pgm {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php	");
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("shivanya111@gmail.com");
		
		WebElement create = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		create.click();
		
		Thread.sleep(5000);
		
		WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
		gender.click();
		
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		fname.sendKeys("s ");
		
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		lname.sendKeys("sivaprakash");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("1234qwert");
		
		WebElement day = driver.findElement(By.id("days"));
		Select sc=new Select(day);
		sc.selectByValue("28");
		
		WebElement month = driver.findElement(By.id("months"));
		Select sc1=new Select(month);
		sc1.selectByValue("11");
		
		WebElement year = driver.findElement(By.id("years"));
		Select sc2=new Select(year);
		sc2.selectByVisibleText("2017  ");
		
		WebElement ch1 = driver.findElement(By.id("newsletter"));
		ch1.click();
		
		WebElement ch2 = driver.findElement(By.id("optin"));
		ch2.click();
		
		Thread.sleep(4000);
		
		WebElement name = driver.findElement(By.id("firstname"));
		name.sendKeys("shivanya");
	
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("greens technologies,porur");
		
		WebElement add = driver.findElement(By.id("address1"));
		add.sendKeys("lakshmi nagar");
		
		WebElement add2 = driver.findElement(By.id("address2"));
		add2.sendKeys("avadi");
		
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
	    Select sc4=new Select(state);
	    sc4.selectByValue("3");
	    
	    WebElement pc = driver.findElement(By.id("postcode"));
	    pc.sendKeys("85013");
	    
	    WebElement oth = driver.findElement(By.id("other"));
	    oth.sendKeys("i am testing");
	    
	    WebElement phone = driver.findElement(By.id("phone"));
	    phone.sendKeys("3452629791");
	    
	    WebElement ph = driver.findElement(By.id("phone_mobile"));
	    ph.sendKeys("2657439030");
	    
	    WebElement al = driver.findElement(By.id("alias"));
	    al.sendKeys("govardhanagiri");
	    
	    WebElement reg = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
	    reg.click();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
