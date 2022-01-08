package com.stepdef.com;

import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import com.Adactin_Cucumber.BaseClass;
import com.helper.com.FileReadManager;
import com.pom.com.AdactinLogin;
import com.runner.com.Runner;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass{
	
	public static WebDriver driver=Runner.driver;
	
	AdactinLogin al = new AdactinLogin(driver);
	
	@Given("^launch the application$")
	public void launch_the_application() throws Throwable {
		String url = FileReadManager.getInstanceFR().getInstanceCR().getUrl();
	   getLink(url); 
	}

	@When("^user enter the valid username in username field$")
	public void user_enter_the_valid_username_in_username_field() throws Throwable {
		String uname = FileReadManager.getInstanceFR().getInstanceCR().getUname();
		sendValues(al.getUname(), uname);
	}

	@When("^user enter the valid password in password field$")
	public void user_enter_the_valid_password_in_password_field() throws Throwable {
		String pass = FileReadManager.getInstanceFR().getInstanceCR().getpass();
	   sendValues(al.getPassword(), pass);
	}

	@Then("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
	   clickElement(al.getLogin());
	}

	@Given("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	   
	}

	@When("^user checks for the location$")
	public void user_checks_for_the_location() throws Throwable {
	    dropDown(al.getLocation(), "value", "Melbourne");
	}

	@When("^user selectes the hotel$")
	public void user_selectes_the_hotel() throws Throwable {
	   dropDown(al.getHotel(), "value", "Hotel Sunshine");
	}

	@When("^user enters the room type$")
	public void user_enters_the_room_type() throws Throwable {
	   dropDown(al.getRoom(), "value", "Double");
	}

	@When("^user enters the number of rooms$")
	public void user_enters_the_number_of_rooms() throws Throwable {
	  
	}

	@When("^user choose the check in date$")
	public void user_choose_the_check_in_date() throws Throwable {
	    
	}

	@When("^user choose the check out date$")
	public void user_choose_the_check_out_date() throws Throwable {
	   
	}

	@When("^user adds the adults per room$")
	public void user_adds_the_adults_per_room() throws Throwable {
	    
	}

	@When("^user adds the children per room$")
	public void user_adds_the_children_per_room() throws Throwable {
	    
	}

	@Then("^user clicks the search button$")
	public void user_clicks_the_search_button() throws Throwable {
	   clickElement(al.getSearch());
	}

	@Given("^user gets the hotel name$")
	public void user_gets_the_hotel_name() throws Throwable {
	 
	}

	@When("^user clicks on the radio button$")
	public void user_clicks_on_the_radio_button() throws Throwable {
	    radiobuton(al.getRadio());
	}

	@Then("^user click on the continue button$")
	public void user_click_on_the_continue_button() throws Throwable {
	    clickElement(al.getCon());
	}

	@Given("^user navigates to booking page$")
	public void user_navigates_to_booking_page() throws Throwable {
	    
	}

	@When("^user enters the first name in first name field$")
	public void user_enters_the_first_name_in_first_name_field() throws Throwable {
		String fname = FileReadManager.getInstanceFR().getInstanceCR().getFname();
	    sendValues(al.getFname(), fname);
	}

	@When("^user enters the last name in last name field$")
	public void user_enters_the_last_name_in_last_name_field() throws Throwable {
		String lname = FileReadManager.getInstanceFR().getInstanceCR().getLname();
	    sendValues(al.getLname(), lname);
	}

	@When("^user enters the address in billing address field$")
	public void user_enters_the_address_in_billing_address_field() throws Throwable {
	   sendValues(al.getAddress(), "Coimbatore");
	}

	@When("^user enters the credit card number$")
	public void user_enters_the_credit_card_number() throws Throwable {
		String cardnum = FileReadManager.getInstanceFR().getInstanceCR().getCardnum();
	    sendValues(al.getCard(), cardnum);
	}

	@When("^user selects the credit card type$")
	public void user_selects_the_credit_card_type() throws Throwable {
		String cardtype = FileReadManager.getInstanceFR().getInstanceCR().getcardtype();
	   dropDown(al.getCtype(), "value", cardtype);
	}

	@When("^user selects  the month of expiry$")
	public void user_selects_the_month_of_expiry() throws Throwable {
	    dropDown(al.getMonth(), "value", "5");
	}

	@When("^user selects the year of expiry$")
	public void user_selects_the_year_of_expiry() throws Throwable {
	   dropDown(al.getYear(), "value", "2022");
	}

	@When("^user enters the Cvv number$")
	public void user_enters_the_Cvv_number() throws Throwable {
		String cvv = FileReadManager.getInstanceFR().getInstanceCR().getCvv();
	   sendValues(al.getCvv(), cvv);
	}

	@Then("^clicks on the Book Now button$")
	public void clicks_on_the_Book_Now_button() throws Throwable {
	    clickElement(al.getBook());
	}

}
