Feature: Verify Flipkart Registration 
Scenario: Registration with mobile number 
	Given site url as "http://flipkart.com" 
	And click on Register with us 
	When user enter valid mobilenumber "7997792902" 
	And enter firstname "krish" 
	And Enter Surname as "k" 
	And Enter password and retype password "hello@123" and "hello@123" 
	And Enter age as 22 
	And click on Register 
	Then verify Successful messege 