Feature: feature to test login functionality

  Scenario: Successful Login with valid Credentials
    Given user Launch Chrome browser
    When User opens URL "https://practice.automationtesting.in/my-account/"
    And User enters Email as "adangowda1995@gmail.com" and Password as "Adangowda@1234"
    And clicks on login button
    Then URL of the page should be "https://practice.automationtesting.in/my-account/"
    And close browser
