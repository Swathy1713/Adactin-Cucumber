package com.Adactin_Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.com.AdactinLogin;

public class Adactin extends BaseClass{
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver = browserLaunch("chrome");
		
		getLink("https://adactinhotelapp.com/");
		
		maximize();
		
		AdactinLogin al = new AdactinLogin(driver);
		
		sendValues(al.getUname(), "Swathy123");

		sendValues(al.getPassword(), "Swathy@9894048759");
		
		clickElement(al.getLogin());
		
		dropDown(al.getLocation(), "value", "Adelaide");
		firstSelected(al.getLocation());

		dropDown(al.getHotel(), "value", "Hotel Sunshine");
		firstSelected(al.getHotel());
		
		dropDown(al.getRoom(), "visible text", "Deluxe");
		
		dropDown(al.getNumber(), "value", "3");
		
		clear(al.getPickin());
		sendValues(al.getPickin(), "28/12/2021");
	
		clear(al.getPickout());
		sendValues(al.getPickout(), "05/01/2022");
		
		dropDown(al.getAdult(), "value", "4");
		
		clickElement(al.getSearch());

		Thread.sleep(3000);
		
		clickElement(al.getRadio());
		
		clickElement(al.getCon());
		
		sendValues(al.getFname(),"Swathy");
		
		sendValues(al.getLname(), "Eswaran");
		
		sendValues(al.getAddress(), "Coimbatore");
		
		sendValues(al.getCard(), "1111110011222222");
		
		dropDown(al.getCtype(), "visible text", "American Express");
		
		dropDown(al.getMonth(), "index", "10");
		
		dropDown(al.getYear(), "value", "2020");
		
		sendValues(al.getCvv(), "123");
		
		clickElement(al.getBook());
		
		clickElement(al.getLogout());

	}

}
