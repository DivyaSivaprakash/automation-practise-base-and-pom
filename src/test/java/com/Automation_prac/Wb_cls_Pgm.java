package com.Automation_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Wb_cls_Pgm extends Base_Class{
	public static WebDriver driver;

		public static void main(String[] args) throws Throwable  {
			
			driver=getbrowser("chrome");
			get("http://automationpractice.com/index.php	");
			
			WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
			ClickElement(signin);
			
			WebElement email = driver.findElement(By.id("email_create"));
			InputValue(email,"shivanya111@gmail.com" );
			
			WebElement create = driver.findElement(By.xpath("//i[@class='icon-user left']"));
			ClickElement(create);
			
			Thread.sleep(5000);
			
			WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
			ClickElement(gender);	
			
			WebElement fname = driver.findElement(By.id("customer_firstname"));
			InputValue(fname, "s ");
			
			WebElement lname = driver.findElement(By.id("customer_lastname"));
			InputValue(lname,"sivaprakash" );
			
			WebElement pass = driver.findElement(By.id("passwd"));
			InputValue(pass, "1234qwert");
			
			WebElement day = driver.findElement(By.id("days"));
			dropdownSelect(day,"28" , "byvalue");
			
			WebElement month = driver.findElement(By.id("months"));
			dropdownSelect(month,"11" , "byvalue");
			
			WebElement year = driver.findElement(By.id("years"));
			dropdownSelect(year, "2017  ","byvalue"); 
			
			WebElement ch1 = driver.findElement(By.id("newsletter"));
			ClickElement(ch1);
			
			WebElement ch2 = driver.findElement(By.id("optin"));
			ClickElement(ch2);			
			Thread.sleep(4000);
			
			WebElement name = driver.findElement(By.id("firstname"));
			InputValue(name, "shivanya");
		
			
			WebElement company = driver.findElement(By.id("company"));
			InputValue(company, "greens technologies,porur");
			
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
