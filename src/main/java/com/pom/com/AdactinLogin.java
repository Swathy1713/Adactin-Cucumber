package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin {
	public static WebDriver driver;

	public AdactinLogin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "username")
	private WebElement uname;

	public WebElement getUname() {
		return uname;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}

	@FindBy(id = "room_type")
	private WebElement room;

	public WebElement getRoom() {
		return room;
	}

	@FindBy(id = "room_nos")
	private WebElement number;

	public WebElement getNumber() {
		return number;
	}

	@FindBy(id = "datepick_in")
	private WebElement pickin;

	public WebElement getPickin() {
		return pickin;
	}

	@FindBy(id = "datepick_out")
	private WebElement pickout;

	public WebElement getPickout() {
		return pickout;
	}

	@FindBy(id = "adult_room")
	private WebElement adult;

	public WebElement getAdult() {
		return adult;
	}

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radio;

	public WebElement getRadio() {
		return radio;
	}

	@FindBy(id = "continue")
	private WebElement con;

	public WebElement getCon() {
		return con;
	}

	@FindBy(id = "first_name")
	private WebElement fname;

	public WebElement getFname() {
		return fname;
	}

	@FindBy(id = "last_name")
	private WebElement lname;

	public WebElement getLname() {
		return lname;
	}

	@FindBy(id = "address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(id = "cc_num")
	private WebElement card;

	public WebElement getCard() {
		return card;
	}

	@FindBy(id = "cc_type")
	private WebElement ctype;

	public WebElement getCtype() {
		return ctype;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}
	
	@FindBy(id = "cc_exp_year")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}

	@FindBy(id="book_now")
	private WebElement book;

	public WebElement getBook() {
		return book;
	}
	
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
