Feature: Validate the invalid login functionality
  Scenario Outline: Verify the user is not able to login with invalid details
    Given user opens the website
    Then verify the user is on home page
    When user clicks on the login link
    Then verify the user login page is displayed
    When user enters the phone number
    And user clicks on continue button
    And user enters the invalid otp "<otp>"
    And user clicks on continue
    Then verify the error message is displayed
    Examples:
      | otp |
      |123678|
      |567245|
      |245987|