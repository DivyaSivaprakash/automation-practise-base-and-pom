package com.Automation_prac;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wb_automation_project extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		driver = getbrowser("chrome");

		get("http://automationpractice.com/index.php");
        
		Thread.sleep(3000);
		
		WebElement sign = driver.findElement(By.className("login"));
		ClickElement(sign);

		WebElement email = driver.findElement(By.id("email"));
		InputValue(email, "shivanya@gmail.com");

		WebElement pass = driver.findElement(By.id("passwd"));
		InputValue(pass, "1234qwert");

		WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		ClickElement(signin);

		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		actionelements(dress, "movetoelement");
		Thread.sleep(4000);

		WebElement summer = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]"));
		ClickElement(summer);

		WebElement findElement = driver.findElement(By.xpath("(//a[@class='product_img_link'])[2]"));
		ClickElement(findElement);

		Frames("frameindex",0, null);

		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		ClickElement(plus);

		WebElement size = driver.findElement(By.name("group_1"));
		dropdownSelect(size,"2" , "byvalue");
		
		WebElement colour = driver.findElement(By.id("color_8"));
		ClickElement(colour);

		WebElement submit = driver.findElement(By.name("Submit"));
		ClickElement(submit);

		Thread.sleep(3000);

		WebElement cont = driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
		ClickElement(cont);

		WebElement dress1 = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		actionelements(dress1, "movetoelement");
		
		WebElement cas = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		ClickElement(cas);

		WebElement d2 = driver.findElement(By.xpath("(//a[@class='product_img_link'])"));
		ClickElement(d2);
		
		Frames("frameindex", 0, null);
		
		WebElement pl = driver.findElement(By.xpath("(//a[@class='btn btn-default button-plus product_quantity_up'])"));
		ClickElement(pl);
		ClickElement(pl);

		WebElement dr = driver.findElement(By.id("group_1"));
		dropdownSelect(dr, "3", "byvalue");
	
		WebElement cart = driver.findElement(By.name("Submit"));
		ClickElement(cart);
		Thread.sleep(5000);

		WebElement conti = driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"));
		ClickElement(conti);

		WebElement drs = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
		actionelements(drs, "movetoelement");
		Thread.sleep(3000);

		WebElement eve = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		ClickElement(eve);

		WebElement quick = driver.findElement(By.xpath("//a[@class='product_img_link']"));
		ClickElement(quick);
		Frames("frameindex", 0, null);

		WebElement plus1 = driver.findElement(By.className("icon-plus"));
		ClickElement(plus1);

		WebElement si = driver.findElement(By.id("group_1"));
		dropdownSelect(si, "2", "byvalue");
	
		WebElement co = driver.findElement(By.id("color_24"));
		ClickElement(co);

		WebElement su = driver.findElement(By.xpath("(//button[@name='Submit'])[1]"));
		ClickElement(su);
		Thread.sleep(3000);
		
		WebElement ca = driver.findElement(By.xpath("(//i[@class='icon-chevron-left left'])"));
		ClickElement(ca);

		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		ClickElement(tshirt);

		WebElement or = driver.findElement(By.xpath("(//a[@class='product_img_link'])"));
		ClickElement(or);
		Frames("frameindex", 0, null);

		WebElement s = driver.findElement(By.id("group_1"));
		dropdownSelect(s, "3", "byvalue");
		
		WebElement c = driver.findElement(By.id("color_14"));
		ClickElement(c);
		
		WebElement add = driver.findElement(By.xpath("(//button[@name='Submit'])"));
		ClickElement(add);
		Thread.sleep(3000);

		WebElement check = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		ClickElement(check);
		Thread.sleep(3000);

		WebElement che = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ClickElement(che);

		WebElement proceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		ClickElement(proceed);

		WebElement tick = driver.findElement(By.name("cgv"));
		ClickElement(tick);
		Thread.sleep(3000);

		WebElement proc = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ClickElement(proc);

		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		ClickElement(bank);

		WebElement con = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ClickElement(con);

		WebElement back = driver.findElement(By.xpath("(//i[@class='icon-chevron-left'])[1]"));
		ClickElement(back);

		WebElement ff = driver.findElement(By.xpath("(//div[@class='columns-container'])"));
		ClickElement(ff);
		
		for (int i = 0; i < 10; i++) {
			robotactions("keydown");
		}
		Thread.sleep(5000);

		takescreenshot("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Selenium_Project_New\\Screenshot\\cart.png");

		WebElement bb = driver.findElement(By.xpath("//i[@class='icon-chevron-left'][1]"));
		ClickElement(bb);
		
		WebElement wom = driver.findElement(By.xpath("//a[@title='Women'][1]"));
		actionelements(wom, "movetoelement");
		
		WebElement tsh = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		ClickElement(tsh);
		
		WebElement ts1 = driver.findElement(By.xpath("(//a[@class='product_img_link'])[1]"));
		ClickElement(ts1);
		
		Frames("frameindex", 0, null);

		WebElement sizze = driver.findElement(By.id("group_1"));
		dropdownSelect(sizze, "2", "byvalue");
		
		WebElement caar = driver.findElement(By.xpath("(//button[@name='Submit'])"));
		ClickElement(caar);
		Thread.sleep(4000);

		WebElement continu = driver.findElement(By.xpath("(//i[@class='icon-chevron-left left'])[1]"));
		ClickElement(continu);
		Thread.sleep(2000);

		WebElement top = driver.findElement(By.xpath("(//a[@title='Tops'])[2]"));
		ClickElement(top);

		WebElement black = driver.findElement(By.xpath("(//a[@class='product_img_link'])[2]"));
		ClickElement(black);
		Frames("frameindex", 0, null);

		WebElement up = driver.findElement(By.xpath("(//i[@class='icon-plus'])[1]"));
		ClickElement(up);
		WebElement cca = driver.findElement(By.xpath("(//button[@name='Submit'])"));
		ClickElement(cca);
		
		Thread.sleep(3000);

		WebElement proceedt = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		ClickElement(proceedt);

		WebElement pro = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ClickElement(pro);

		WebElement pp = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		ClickElement(pp);

		WebElement cl = driver.findElement(By.xpath("(//input[@name='cgv'])"));
		ClickElement(cl);

		WebElement ppp = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ClickElement(ppp);

		WebElement checkk = driver.findElement(By.xpath("(//a[@class='cheque'])"));
		ClickElement(checkk);

		WebElement conf = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ClickElement(conf);

		WebElement bac = driver.findElement(By.xpath("(//i[@class='icon-chevron-left'])[1]"));
		ClickElement(bac);

		WebElement ff1 = driver.findElement(By.xpath("(//div[@class='columns-container'])"));
		ClickElement(ff1);
		
		for (int i = 0; i <=10; i++) {
			robotactions("keydown");
			
		}

		Thread.sleep(5000);
		takescreenshot("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Selenium_Project_New\\Screenshot\\check.png");

	}

}
