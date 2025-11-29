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
Feature: Manage match entry cost
  As a registered user,
  I want the app to check and deduct the entry cost before starting a competitive match,
  so that the game economy is respected.

  Scenario: Deduct entry cost when starting a competitive match
    Given I am logged in and on the competitive match page
    And I have enough coins to pay the entry fee
    When I start the competitive match
    Then the entry fee should be deducted from my balance
