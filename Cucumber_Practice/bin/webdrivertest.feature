Feature: Outlook test 
Scenario: Verify email validation with invalid email id 
	Given navigate to outlook page
	And clicking on signin button
	When user enter invalid email address
	Then verify error messege Displayed