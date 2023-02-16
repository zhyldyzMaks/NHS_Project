Feature:Check NHS website login functionality

  Scenario: Checking login functionality with valid credentials
    Given User navigates to NHS website
    When User provides username and password
    And User clicks on the signIn button
    Then User validates the title 'NHS patients'

    Scenario: Checking login functionality with wrong username and correct password
      Given user gets to the NHS website
      When user provides username and empty password and clicks on signin button
      Then user validates the error message 'Please fill out this field.'

