
Feature: Add to cart

Background: 
	Given User enters the URL 
  Then User lands on login page of saucelabs
  When User Enters username "standard_user"
  And User Enters password "secret_sauce"
  And User clicks on Login button
  Then User should land on home page of saucelabs 
  
  Scenario: Add single item to cart
    
    When user clicks on add to cart
    Then product is moved to cart
    

  
 Scenario: Add multiple item to cart
    
   When user clicks on add to cart
    Then product is moved to cart
    When user clicks on add to cart for another product
    Then multiple product is moved to cart
  