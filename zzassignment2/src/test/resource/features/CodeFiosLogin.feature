@regression
Feature: Techfios Other billing login page functionality validation

 Background: @smoke
 Given User is on the techfios login page

Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	
	When User enters the "<username>" in the "username" field
	When User enters the "<password>" in the "password" field
	And User clicks on "login"
	Then User should land on Dashboard page 
	And User clicks on "bankCash"
	And User clicks on "newAccount"
	And User enters "<accountTitle>" in the "accountTitle" field in accounts page 
	And User enters "<description>" in the "description" field in accounts page 
	And User enters "<initialBalance>" in the "initialBalance" field in accounts page  
	And User enters "<accountNumber>" in the "accountNumber" field in accounts page 
	And User enters "<contactPerson>" in the "contactPerson" field in accounts page 
	And User enters "<Phone>" in the "Phone" field in accounts page   
	And User enters "<internetBankingURL>" in the "internetBankingURL" field in accounts page  
	And User clicks on "submit"
	Then User should be able to validate account created successfully
	
	Examples: 
	|username|password|Dashboard|accountTitle|description|initialBalance|accountNumber|contactPerson|Phone|internetBankingURL|
	|demo1@codefios.com|abc123|dashboard|techfios|TF testing by manoj|9999|1111|phuyaManoj|6823758443|phuyalmanoj@higerdimension.com|