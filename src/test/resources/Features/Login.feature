#Sample Feature Definition Template

Feature: Login to application

  @tag1
  Scenario: verify user able to login in to sause application with valid credentials
    Given user navigates to loginpage    
    When user enter valid username and password
    And clicks login button    
    Then Navigate to home page
    And close the browser

  
