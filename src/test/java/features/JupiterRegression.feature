@Regression
Feature: Jupiter Regression Tests

  Background: Navigate to Jupiter Application
    Given I initiate selenium web driver
    Given I navigate to Jupiter Application

    @sanity
    Scenario: TC1_Validate Errors on Contact page by clicking submit button
      Given I'm on HomePage
      When I navigate to contact page
      And clicked on Submit button
      Then Mandatory field errors exist on contact page
      And I close selenium web driver

    Scenario:TC2_Validate Errors are gone by entering mandatory fields
      Given I'm on HomePage
      When I navigate to contact page
      And I entered mandatory fields
      |ForeName| Email         | Message      |
      | Anu    | anu@gmail.com |  Test Only   |
      And clicked on Submit button
      Then I validate Success message for contact page
      And I close selenium web driver
     ##Passing data in step
     ##Then I enter "Melbourne" and "3000" in text field

    Scenario: TC3_Verify the shopping items in the cart
      Given I'm on HomePage
      When I navigate to shop page
      And I add 2 FunnyCow toys to the cart
      And add 1 FluffyBunny toy to the cart
      And I click on cart button
      Then Verify the items in the cart
      And I close selenium web driver

   Scenario: TC4_Verify total with sum of subtotal
     Given I'm on HomePage
     When I navigate to shop page
     And add 2 StuffedFrog toys to the cart
     And add 5 FluffyBunny toy to the cart
     And add 3 ValentineBear toy to the cart
     Then I click on cart button
     And I validate price of Stuffed frog and product subtotal
     And Validate price of FluffyBunny and product subtotal
     And Validate price of ValentineBear and product subtotal
     Then Verify total with sum of subtotal
     And I close selenium web driver
