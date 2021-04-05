package com.Automation_prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void ClickElement(WebElement element) {
		element.click();
	}

	public static void InputValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void getsource(String type) {
		try {
			if (type.equalsIgnoreCase("url")) {
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
			} else if (type.equalsIgnoreCase("pagesource")) {
				String pageSource = driver.getPageSource();
				System.out.println(pageSource);
			} else if (type.equalsIgnoreCase("title")) {
				String title = driver.getTitle();
				System.out.println(title);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isoptions(WebElement element, String type) {
		if (type.equalsIgnoreCase("isenabled")) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		} else if (type.equalsIgnoreCase("isdisplayed")) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		} else if (type.equalsIgnoreCase("isselected")) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
	}

	public static void getelements(WebElement element, String type) {
		try {
			if (type.equalsIgnoreCase("gettext")) {
				String text = element.getText();
				System.out.println(text);
			} else if (type.equalsIgnoreCase("getattribute")) {
				String attribute = element.getAttribute(null);
				System.out.println(attribute);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void endsession(String type) {
		if (type.equalsIgnoreCase("close")) {
			driver.close();
		} else if (type.equalsIgnoreCase("quit")) {
			driver.quit();
		}
	}

	public static void navigate(String type, String s) {
		if (type.equalsIgnoreCase("naviagateto")) {
			driver.navigate().to(s);
		} else if (type.equalsIgnoreCase("naviagateback")) {
			driver.navigate().back();
		} else if (type.equalsIgnoreCase("naviagateforward")) {
			driver.navigate().forward();
		} else if (type.equalsIgnoreCase("navigateRefresh")) {
			driver.navigate().refresh();
		}
	}

	public static void get(String value) {
		driver.get(value);

	}

	public static void actionelements(WebElement element, String type) {
		Actions ac = new Actions(driver);
		if (type.equalsIgnoreCase("contextxlick")) {
			ac.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).build().perform();

		}
	}

	public static void robotactions(String type) throws AWTException {
		Actions ac = new Actions(driver);
		ac.build().perform();
		Robot r = new Robot();
		if (type.equalsIgnoreCase("keydown")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (type.equalsIgnoreCase("keyenter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (type.equalsIgnoreCase("keyup")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
	}

	public static void Frames(String type, int i, String value) {
		if (type.equalsIgnoreCase("frameindex")) {
			driver.switchTo().frame(i);
		} else if (type.equalsIgnoreCase("framewebelement")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("frameidorname")) {
			driver.switchTo().frame(value);
		}
	}

	public static void dropdownSelect(WebElement element, String value, String type) {
		try {
			Select sc = new Select(element);
			if (type.equalsIgnoreCase("byvalue")) {
				sc.selectByValue(value);
			} else if (type.equalsIgnoreCase("byvisibletext")) {
				sc.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("byindex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void takescreenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(location);
		FileUtils.copyFile(source, destination);
	}

	public static void simplealert() {
		driver.switchTo().alert().accept();
	}

	public static void confirmalert(String type) {
		Alert calert = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			calert.accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			calert.dismiss();
		}
	}

	public static void promptalert(String value) {
		driver.switchTo().alert().sendKeys(value);
		simplealert();
	}

	public static void gettextalert() {
		String message = driver.switchTo().alert().getText();
		System.out.println(message);

	}

	public static void multidropdown(WebElement element, String type) {
		Select sc = new Select(element);
		if (type.equalsIgnoreCase("ismultiple")) {

			boolean multiple1 = sc.isMultiple();
			System.out.println(multiple1);
		} else if (type.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = sc.getOptions();
			System.out.println("***********all options are***********");
			for (WebElement element1 : options) {
				int size = sc.getOptions().size();
				System.out.println("total option are:" + size);
				System.out.println(element1.getText());
			}
		} else if (type.equalsIgnoreCase("getallselected")) {
			// int size = sc.getOptions().size();
			// System.out.println("total option are:" + size);
			List<WebElement> allSelected = sc.getAllSelectedOptions();
			System.out.println("***********all selected options are***********");
			for (WebElement element2 : allSelected) {
				System.out.println(element2.getText());
			}
		} else if (type.equalsIgnoreCase("getfirstselected")) {
			WebElement firstSelected = sc.getFirstSelectedOption();
			System.out.println("***********first selected***********");
			System.out.println(firstSelected.getText());
		}
	}

	/*
	 * }
	 * 
	 * public static void ismultiple(WebElement element) {
	 * 
	 * boolean multiple1 = sc.isMultiple(); System.out.println(multiple1); }
	 * 
	 * public static void getoptions(WebElement element) { Select sc = new
	 * Select(element); List<WebElement> options = sc.getOptions();
	 * System.out.println("***********all options are***********"); for (WebElement
	 * element1 : options) { System.out.println(element1.getText()); }
	 * 
	 * //}
	 * 
	 * //public static void size(WebElement element) { //Select sc = new
	 * Select(element); int size = sc.getOptions().size();
	 * System.out.println("total option are:" + size);
	 * 
	 * 
	 * }
	 * 
	 * public static void getallselected(WebElement element) {
	 * 
	 * Select sc1=new Select(element); //int size = sc1.getOptions().size();
	 * //System.out.println("total option are:" +size);
	 * 
	 * List<WebElement> allSelected = sc1.getAllSelectedOptions();
	 * System.out.println("***********all selected options are***********"); for
	 * (WebElement element2 : allSelected) { System.out.println(element2.getText());
	 * } }
	 * 
	 * public static void getfirstselectedoption(WebElement element) { Select sc=new
	 * Select(element); WebElement firstSelected = sc.getFirstSelectedOption();
	 * System.out.println("***********first selected***********");
	 * System.out.println(firstSelected.getText());
	 * 
	 * }
	 */

}
