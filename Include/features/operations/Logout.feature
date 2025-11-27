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

##so funciona se tiver este javascript por causa do comportamento do frontend
Feature: Login and Logout functionality
  As a user
  I want to login and logout from the application
  So that I can access my dashboard securely

  Scenario: User logs in and logs out successfully
    Given the browser is open
    When I navigate to "http://localhost:5173/"
    And I click "Object Repository/Page_Vite App/a"
    And I set text "Object Repository/Page_Vite App/input_Email address_email" to "test@example.com"
    And I set encrypted text "Object Repository/Page_Vite App/input_Password_password" to "8SQVv/p9jVScEs4/2CZsLw=="
    And I click "Object Repository/Page_Vite App/button_Password_inline-flex items-center ju_559f66"
    Then I wait for element "Object Repository/Page_Vite App/div_(teste)_flex items-center text-xl space-x-1" to be visible 10
    And I verify element "Object Repository/Page_Vite App/div_(teste)_flex items-center text-xl space-x-1" is present
    And I wait for element "Object Repository/Page_Vite App/a_Logout" to be visible 10
    And I execute javascript "document.evaluate('//nav//a[text()=\"Logout\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();"
    Then I close the browser 
