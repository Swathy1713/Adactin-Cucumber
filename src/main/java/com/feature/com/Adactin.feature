Feature: Hotel booking functionality on the ADACTIN Application

Scenario: User checking the login functionality using valid username and password
Given launch the application
When user enter the valid username in username field
And user enter the valid password in password field
Then user clicks the login button

Scenario: User checking the availability of the hotel
Given user should be logged in
When user checks for the location
And user selectes the hotel
And user enters the room type
And user enters the number of rooms
And user choose the check in date
And user choose the check out date
And user adds the adults per room
And user adds the children per room
Then user clicks the search button

Scenario: User selects the hotel and move to next page
Given user gets the hotel name
When user clicks on the radio button
Then user click on the continue button

Scenario: User books the hotel
Given user navigates to booking page
When user enters the first name in first name field
And user enters the last name in last name field
And user enters the address in billing address field
And user enters the credit card number
And user selects the credit card type
And user selects  the month of expiry
And user selects the year of expiry
And user enters the Cvv number
Then clicks on the Book Now button

