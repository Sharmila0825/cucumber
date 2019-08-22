
@tag
Feature: User check login functionality


  @tag1
  Scenario: User check the login page
    Given User launch the facebook app
    And User chek url and title
    When User enters the username
    And User enters the password
    And User click login button
    Then User checks the navigated url is correct or not
    And User close the browser

 