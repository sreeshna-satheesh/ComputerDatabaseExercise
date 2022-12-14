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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes


@CDExercise
Scenario: To test the ComputerDatabse Application
Given I login to Computer Database "https://computer-database.gatling.io/computers"
And verify the title as "Computer database"
And verify the page header is same as the title
And validate if "Filter by computer name..." is visible
And validate if "Add a new computer" button is visible
And validate if "Filter by name" button is visible
And validate if table is visible
And validate if headers are visible

| Computer name |
| Introduced |
| Discontinued |
| Company |

And validate if pagination is visible
And click on the "Add a new computer" icon
And click on the "Create this computer" button
And validate the red background on the computer name field
And enter the computer name and company
And validate the successful message on submission
Then search the created data
And validate the result





  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
