#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login and validate elements after page reload
  As a valid user
  I want to log in
  So that I can see my dashboard and ensure it persists after a refresh

  Scenario: User logs in and verifies elements remain after page refresh
    Given the browser is open
    When I navigate to "http://localhost:5173/"
    And I click "Object Repository/Page_Vite App/a"
    And I enter email "test@example.com"
    And I enter password "8SQVv/p9jVScEs4/2CZsLw=="
    And I click "Object Repository/Page_Vite App/button_Password_inline-flex items-center ju_559f66"
    Then I should see the user profile panel
    And I should see the PlayBisca element
    When I wait for 2 seconds
    And I refresh the page
    And I wait for 2 seconds
    Then I should still see the PlayBisca element
    And I should still see the user profile panel
    Then I close the browser