Feature: verifyng book version 
Background: 
	Given Navigating to page 
	Scenario: check book1 Availability
	When book1 is selected
	Then check Author of Book is "Sam"
	Scenario: Check Book2 Availability 
	When book2 is selected
	Then Check Author of book2 is "Arjun"
	Scenario: Check book3  Availability
	When book3 is selected 
	Then Check Author of book3 is "Krish"
	
 