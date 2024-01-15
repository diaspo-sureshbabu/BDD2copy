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

Feature: Title of your feature
  I want to use this template for my feature file

  @tag1 @tag2
  Scenario: Title of your scenario1
    Given I want to write a step with precondition1
    
    When I complete action1
    
    Then I validate the outcomes1
    

	@tag1
  Scenario: Title of your scenario2
    Given I want to write a step with precondition2
    
    When I complete action2
    
    Then I validate the outcomes2
    

	@tag2
  Scenario: Title of your scenario3
    Given I want to write a step with precondition3    
    When I complete action3    
    Then I validate the outcomes3
    

   @tag1
  Scenario Outline: Title of your scenario4 outline 
    Given I want to write a step with "<name>" 
    When I check for the "<value>"  
    Then I verify the "<status>"  

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
     
