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
Feature: Test Vite App

  Scenario: Fill in registration and login forms
    Given I open the browser
    When I navigate to "http://localhost:5173/"
    And I click Object Repository/Page_Vite App/a
    And I click Object Repository/Page_Vite App/a_1
    And I enter "test@testes.pt" into the email field
    And I enter "teste" into the name field
    And I enter "8SQVv/p9jVScEs4/2CZsLw==" into the password field
    And I enter "testeee" into the nickname field
    And I click Object Repository/Page_Vite App/button_Nickname_inline-flex items-center ju_ee67eb
    And I enter "test@testes.pt" into the email field
    And I enter "8SQVv/p9jVScEs4/2CZsLw==" into the password field
    And I click Object Repository/Page_Vite App/button_Password_inline-flex items-center ju_559f66
    Then I close the browser