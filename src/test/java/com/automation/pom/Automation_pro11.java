package com.automation.pom;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class Automation_pro11 extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		driver = getbrowser("chrome");

		get("http://automationpractice.com/index.php");

		Thread.sleep(3000);

		Home_Page home = new Home_Page(driver);
		ClickElement(home.getSign());

		Signinpage sign = new Signinpage(driver);
		InputValue(sign.getEmail(), "shivanya@gmail.com");
		InputValue(sign.getPass(), "1234qwert");
		ClickElement(sign.getSignin());

		Dresspage dresses=new Dresspage(driver);
		actionelements(dresses.getDress(),"movetoelement");
		Thread.sleep(4000);
		ClickElement(dresses.getSummer());

		Summerdresspage summer=new Summerdresspage(driver);
		ClickElement(summer.getDress1());

		Frames("frameindex", 0, null);
		
		Quickviewpage1 quick=new Quickviewpage1(driver);
		ClickElement(quick.getPlus());

		dropdownSelect(quick.getSize(),"2", "byvalue");

		ClickElement(quick.getColour());

		ClickElement(quick.getCart());

		Thread.sleep(3000);
		
		Continuepage continu=new Continuepage(driver);
		ClickElement(continu.getConti());

		actionelements(dresses.getDress(),"movetoelement");
		
		ClickElement(dresses.getCasual());

		Casualdresspage casual= new Casualdresspage(driver);
		ClickElement(casual.getD2());

		Frames("frameindex", 0, null);

		ClickElement(quick.getPl());
		ClickElement(quick.getPl());

		dropdownSelect(quick.getSize(),"3", "byvalue");

		ClickElement(quick.getCart());
		Thread.sleep(5000);

		ClickElement(continu.getConti());

		actionelements(dresses.getDress(), "movetoelement");

		ClickElement(dresses.getEve());

		Eveningdress evening=new Eveningdress(driver);
		ClickElement(evening.getQuick1());
		Frames("frameindex", 0, null);

		ClickElement(quick.getPlus());

		dropdownSelect(quick.getSize(), "2", "byvalue");

		ClickElement(quick.getCo());

		ClickElement(quick.getCart());
		
		Thread.sleep(4000);

		ClickElement(continu.getConti());

		Tshirt shirt=new Tshirt(driver);
		ClickElement(shirt.getTshirt());
		
		Tshirtpage tpage=new Tshirtpage(driver);
		ClickElement(tpage.getOr());
		Frames("frameindex", 0, null);

		dropdownSelect(quick.getSize(), "3", "byvalue");

		ClickElement(quick.getC());

		ClickElement(quick.getCart());
		
		Thread.sleep(3000);

		ClickElement(continu.getCheck());
		
		Thread.sleep(3000);

		Orderpage order=new Orderpage(driver);
		ClickElement(order.getChe());

		Addresspage address=new Addresspage(driver);
		ClickElement(address.getProceed());

		Tickpage tick=new Tickpage(driver);
		ClickElement(tick.getTick());
		Thread.sleep(3000);

		ClickElement(tick.getProc());

		Bankpage bank=new Bankpage(driver);
		ClickElement(bank.getBank());

		Confirmpage confirm=new Confirmpage(driver);
		ClickElement(confirm.getCon());

		Backtoorder back=new Backtoorder(driver);
		ClickElement(back.getBack());

		Orderhistory history =new Orderhistory(driver);
		ClickElement(history.getFf());

		for (int i = 0; i < 10; i++) {
			robotactions("keydown");
		}
		
		Thread.sleep(5000);

		takescreenshot("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Selenium_Project_New\\Screenshot\\cart.png");

		ClickElement(history.getBb());

		//WebElement wom = driver.findElement(By.xpath("//a[@title='Women'][1]"));
		actionelements(dresses.getWom(), "movetoelement");

		//WebElement tsh = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		ClickElement(dresses.getTsh());

		ClickElement(tpage.getOr());

		Frames("frameindex", 0, null);

		dropdownSelect(quick.getSize(), "2", "byvalue");

		ClickElement(quick.getCart());
		Thread.sleep(4000);

		ClickElement(continu.getConti());
		Thread.sleep(2000);

		ClickElement(shirt.getTop());
		
		Topspage top=new Topspage(driver);
		ClickElement(top.getBlack());
		Frames("frameindex", 0, null);

		ClickElement(quick.getPlus());
		
		ClickElement(quick.getCart());

		Thread.sleep(3000);

		ClickElement(continu.getCheck());

		ClickElement(order.getChe());

		ClickElement(address.getProceed());

		ClickElement(tick.getTick());

		ClickElement(tick.getProc());

		ClickElement(bank.getCheckk());

		ClickElement(confirm.getCon());

		ClickElement(back.getBack());

		ClickElement(history.getFf());

		for (int i = 0; i <= 10; i++) {
			robotactions("keydown");

		}

		Thread.sleep(5000);
		takescreenshot("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Selenium_Project_New\\Screenshot\\check.png");

	}

}
