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
@tag
Feature: Start Competitive Match
  As a registered user, I want to start a competitive single-player match against a bot, so that I can play ranked Bisca.

  @tag1
  Scenario: Launch game and begin competitive Bisca de 3 match
    Given the application is open
    And I open the main menu dropdown from the top right
    When I select a_Login_data-activetruefocusbg-accent data-_cc2a33
    And I choose game mode "Competitive"
    And I choose game type "Match"
    And I choose variant "Bisca de 3"
    And I click "Start Game"
    Then the game should start successfully