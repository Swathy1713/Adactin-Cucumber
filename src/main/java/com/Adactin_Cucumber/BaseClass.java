package com.Adactin_Cucumber;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid Browser");
		}
		return driver;

	}

	public static void close() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void navigateTo(String s) {
		driver.navigate().to(s);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void minimize() {
		driver.manage().window().minimize();
	}
	
	public static void fullscreen() {
		driver.manage().window().fullscreen();
	}

	public static void getLink(String s) {
		driver.get(s);
	}
	
	public static void clear(WebElement ele) {
		ele.clear();

	}

	public static void sendValues(WebElement ele, String s) {
		ele.sendKeys(s);
	}

	public static void clickElement(WebElement ele) {
		ele.click();
	}

	public static void title() {
		String str = driver.getTitle();
		System.out.println(str);
	}

	public static void current() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void text(WebElement ele) {
		String t = ele.getText();
		System.out.println(t);
	}

	public static void attributeValue(WebElement ele) {
		String attribute = ele.getAttribute("place holder");
		System.out.println(attribute);
	}

	public static void takeScreenshot() throws Exception {
		TakesScreenshot s = (TakesScreenshot) driver;
		File a = s.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\admin\\eclipse-workspace\\Maven1\\screenshot\\img.png");
		FileHandler.copy(a, b);
	}

	public static void alert(String a) {
		if (a.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (a.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}

	}
	
	public static void action(WebElement ele, String s) {
		Actions a = new Actions(driver);
		if (s.equalsIgnoreCase("click")) {
			a.click(ele).perform();
		}
		else if (s.equalsIgnoreCase("context click")) {
			a.contextClick(ele).perform();
		}
		else if (s.equalsIgnoreCase("double click")) {
			a.doubleClick(ele).perform();
		}
		else if (s.equalsIgnoreCase("move to element")) {
			a.moveToElement(ele).perform();
		}
		
	}
	
	public static void dragDrop(WebElement drag, WebElement drop) {
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop);

	}
	
	public static void frame(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public static void dropDown(WebElement ele, String option, String input) {
		Select s = new Select(ele);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(input);
		}
		else if (option.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(input);
		}
		else if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);
		}
		
	}
	
	public static void checkbox(WebElement ele) {
		ele.click();
	}
	
	public static void radiobuton(WebElement ele) {
		ele.click();

	}
	public static void checking(WebElement ele, String str) {
		if (str.equalsIgnoreCase("is Selected")) {
			System.out.println(ele.isSelected());
		}
		else if (str.equalsIgnoreCase("is Displayed")) {
			System.out.println(ele.isDisplayed());
		}
		else if (str.equalsIgnoreCase("is Enabled")) {
			System.out.println(ele.isEnabled());
		}
	}
	
	public static void selected(WebElement ele) {
	System.out.println(ele.isDisplayed());
	}
	
	public static void enabled(WebElement ele) {
		System.out.println(ele.isSelected());

	}
	
	public static void displayed(WebElement ele) {
		System.out.println(ele.isDisplayed());
	}
	
	public static void multiple(WebElement ele) {
		Select s = new Select (ele);
		System.out.println(s.isMultiple());

	}
	
	public static void getOptions(WebElement ele) {
		Select s = new Select(ele);
		List<WebElement> a = s.getOptions();
		int size = a.size();
		for (int i = 0; i <size; i++) {
			System.out.println(a.get(i).getText());
		}
	}
	
	public static void allOptions(WebElement ele) {
		Select s = new Select(ele);
		List<WebElement> a = s.getAllSelectedOptions();
		int size = a.size();
		for (int i = 0; i <size; i++) {
			System.out.println(a.get(i).getText());
		}

	}
	
	public static void firstSelected(WebElement ele) {
		Select s = new Select(ele);
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
	}
	
	public static void scroll(String s) {
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		if (s.equalsIgnoreCase("up")) {
			Scrool.executeScript("window.scrollBy(0,250)", "");
		}else if (s.equalsIgnoreCase("down")) {
			Scrool.executeScript("window.scrollBy(0,-300)", "");
		}

	}
	
	public static void robot(WebElement ele) throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}	
	

}
