$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking functionality on the ADACTIN Application",
  "description": "",
  "id": "hotel-booking-functionality-on-the-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User checking the login functionality using valid username and password",
  "description": "",
  "id": "hotel-booking-functionality-on-the-adactin-application;user-checking-the-login-functionality-using-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the valid username in username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_the_application()"
});
formatter.result({
  "duration": 4269718174,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_username_in_username_field()"
});
formatter.result({
  "duration": 310702344,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_password_in_password_field()"
});
formatter.result({
  "duration": 122499116,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 848501423,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User checking the availability of the hotel",
  "description": "",
  "id": "hotel-booking-functionality-on-the-adactin-application;user-checking-the-availability-of-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user should be logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user checks for the location",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user selectes the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters the room type",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters the number of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user choose the check in date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user choose the check out date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user adds the adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user adds the children per room",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user clicks the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_logged_in()"
});
formatter.result({
  "duration": 5257768,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_checks_for_the_location()"
});
formatter.result({
  "duration": 265840646,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selectes_the_hotel()"
});
formatter.result({
  "duration": 185622666,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_room_type()"
});
formatter.result({
  "duration": 102035560,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_number_of_rooms()"
});
formatter.result({
  "duration": 22618,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_choose_the_check_in_date()"
});
formatter.result({
  "duration": 28787,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_choose_the_check_out_date()"
});
formatter.result({
  "duration": 28273,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_adds_the_adults_per_room()"
});
formatter.result({
  "duration": 21076,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_adds_the_children_per_room()"
});
formatter.result({
  "duration": 23647,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_search_button()"
});
formatter.result({
  "duration": 608305506,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User selects the hotel and move to next page",
  "description": "",
  "id": "hotel-booking-functionality-on-the-adactin-application;user-selects-the-hotel-and-move-to-next-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user gets the hotel name",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user clicks on the radio button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user click on the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_gets_the_hotel_name()"
});
formatter.result({
  "duration": 8311263,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_radio_button()"
});
formatter.result({
  "duration": 102444235,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_continue_button()"
});
formatter.result({
  "duration": 519151169,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "User books the hotel",
  "description": "",
  "id": "hotel-booking-functionality-on-the-adactin-application;user-books-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "user navigates to booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user enters the first name in first name field",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user enters the last name in last name field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user enters the address in billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user enters the credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user selects the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user selects  the month of expiry",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user selects the year of expiry",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user enters the Cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "clicks on the Book Now button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_booking_page()"
});
formatter.result({
  "duration": 4925688,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_first_name_in_first_name_field()"
});
formatter.result({
  "duration": 137978895,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_last_name_in_last_name_field()"
});
formatter.result({
  "duration": 135824485,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_address_in_billing_address_field()"
});
formatter.result({
  "duration": 86714111,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_credit_card_number()"
});
formatter.result({
  "duration": 96362435,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_credit_card_type()"
});
formatter.result({
  "duration": 108259755,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_month_of_expiry()"
});
formatter.result({
  "duration": 145760680,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_year_of_expiry()"
});
formatter.result({
  "duration": 118748561,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Cvv_number()"
});
formatter.result({
  "duration": 73942381,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.clicks_on_the_Book_Now_button()"
});
formatter.result({
  "duration": 64245735,
  "status": "passed"
});
});