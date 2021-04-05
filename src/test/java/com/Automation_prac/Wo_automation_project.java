package com.Automation_prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Wo_automation_project {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement sign = driver.findElement(By.className("login"));
		sign.click();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("shivanya@gmail.com");

		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("1234qwert");

		WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		signin.click();

		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(dress).build().perform();

		Thread.sleep(4000);

		WebElement summer = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]"));
		summer.click();

		WebElement findElement = driver.findElement(By.xpath("(//a[@class='product_img_link'])[2]"));
		findElement.click();
		driver.switchTo().frame(0);

		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		plus.click();

		WebElement size = driver.findElement(By.name("group_1"));
		Select sc = new Select(size);
		sc.selectByValue("2");

		WebElement colour = driver.findElement(By.id("color_8"));
		colour.click();

		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();

		Thread.sleep(3000);

		WebElement cont = driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
		cont.click();

		WebElement dress1 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(dress1).build().perform();

		WebElement cas = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		cas.click();

		WebElement d2 = driver.findElement(By.xpath("(//a[@class='product_img_link'])"));
		d2.click();
		driver.switchTo().frame(0);

		WebElement pl = driver.findElement(By.xpath("(//a[@class='btn btn-default button-plus product_quantity_up'])"));
		pl.click();
		pl.click();

		WebElement dr = driver.findElement(By.id("group_1"));
		Select sc1 = new Select(dr);
		sc1.selectByValue("3");

		WebElement cart = driver.findElement(By.name("Submit"));
		cart.click();

		Thread.sleep(5000);

		WebElement conti = driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
		conti.click();
		
		Actions acc = new Actions(driver);


		WebElement drs = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
		acc.moveToElement(drs).build().perform();
		
		Thread.sleep(3000);
		
		WebElement eve = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		eve.click();
		
		WebElement quick = driver.findElement(By.xpath("//a[@class='product_img_link']"));
		quick.click();
		driver.switchTo().frame(0);
		
		WebElement plus1 = driver.findElement(By.className("icon-plus"));
		plus1.click();
		
		WebElement si = driver.findElement(By.id("group_1"));
		Select sc3=new Select(si);
		sc3.selectByValue("2");
		
		WebElement co = driver.findElement(By.id("color_24"));
		co.click();
		
		WebElement su = driver.findElement(By.xpath("(//button[@name='Submit'])[1]"));
		su.click();
		
		Thread.sleep(3000);
		
		WebElement ca = driver.findElement(By.xpath("(//i[@class='icon-chevron-left left'])"));
		ca.click();
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		tshirt.click();
		
		WebElement or = driver.findElement(By.xpath("(//a[@class='product_img_link'])"));
		or.click();
		driver.switchTo().frame(0);
		
		WebElement s = driver.findElement(By.id("group_1"));
		Select sc4=new Select(s);
		sc4.selectByValue("3");
		
		WebElement c = driver.findElement(By.id("color_14"));
		c.click();
		
		WebElement add = driver.findElement(By.xpath("(//button[@name='Submit'])"));
		add.click();
		
	    Thread.sleep(3000);
		
	    WebElement check = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		check.click();
		
		Thread.sleep(3000);
		
		WebElement che = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		che.click();
		
		WebElement proceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		proceed.click();
		
		WebElement tick = driver.findElement(By.name("cgv"));
		tick.click();
		
		Thread.sleep(3000);
		
		WebElement proc = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		proc.click();
		
		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bank.click();
		
		WebElement con = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		con.click();
		
		WebElement back = driver.findElement(By.xpath("(//i[@class='icon-chevron-left'])[1]"));
		back.click();
		
		WebElement ff = driver.findElement(By.xpath("(//div[@class='columns-container'])"));
		Actions ac3=new Actions(driver);
		ff.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		Thread.sleep(5000);
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File ("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Selenium_Project_New\\Screenshot\\cart.png");
		FileUtils.copyFile(source,destination);
		
		WebElement bb = driver.findElement(By.xpath("//i[@class='icon-chevron-left'][1]"));
		bb.click();
		
		WebElement wom = driver.findElement(By.xpath("//a[@title='Women'][1]"));
		Actions aa=new Actions(driver);
		aa.moveToElement(wom).build().perform();
		
		WebElement tsh = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		tsh.click();
		
		WebElement ts1 = driver.findElement(By.xpath("(//a[@class='product_img_link'])[1]"));
		ts1.click();
		driver.switchTo().frame(0);
		
		WebElement sizze = driver.findElement(By.id("group_1"));
		Select sc6=new Select(sizze);
		sc6.selectByValue("2");
		
		WebElement caar = driver.findElement(By.xpath("(//button[@name='Submit'])"));
		caar.click();
		
		Thread.sleep(4000);
		
		WebElement continu = driver.findElement(By.xpath("(//i[@class='icon-chevron-left left'])[1]"));
		continu.click();
		
		Thread.sleep(2000);
		
		WebElement top = driver.findElement(By.xpath("(//a[@title='Tops'])[2]"));
		top.click();
		
		WebElement black = driver.findElement(By.xpath("(//a[@class='product_img_link'])[2]"));
		black.click();
		driver.switchTo().frame(0);
		
		WebElement up = driver.findElement(By.xpath("(//i[@class='icon-plus'])[1]"));
		up.click();
		
		WebElement cca = driver.findElement(By.xpath("(//button[@name='Submit'])"));
		cca.click();
		
		Thread.sleep(4000);
		
		WebElement proceedt = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		proceedt.click();
		
		WebElement pro = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		pro.click();
		
		WebElement pp = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		pp.click();
		
		WebElement cl = driver.findElement(By.xpath("(//input[@name='cgv'])"));
		cl.click();
		
		WebElement ppp = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ppp.click();
		
		WebElement checkk = driver.findElement(By.xpath("(//a[@class='cheque'])"));
		checkk.click();
		
		WebElement conf = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		conf.click();
		
		WebElement bac = driver.findElement(By.xpath("(//i[@class='icon-chevron-left'])[1]"));
		bac.click();
		
		WebElement ff1 = driver.findElement(By.xpath("(//div[@class='columns-container'])"));
		Actions d1=new Actions(driver);
		ff1.click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		
		
		Thread.sleep(5000);
		
		TakesScreenshot tss=(TakesScreenshot) driver;
		File sou = tss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Selenium_Project_New\\Screenshot\\check.png");
		FileUtils.copyFile(sou, des);
		


	

	}

}
