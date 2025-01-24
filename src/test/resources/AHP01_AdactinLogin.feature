@All_Scenarios
Feature: Adactin Hotel Booking Validation

  @valid_Login
  Scenario Outline: Validation of Login Credentials
    Given User is on the Adactin Login page
    When User enters the valid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then User should be redirected to Adactin Homepage

    Examples: 
      | Username          | Password   |
      | shivashankaranssk | Shiva@1919 |

  @invalid_Login
  Scenario Outline: Validation of invalid Login Credentials
    Given User is on the Adactin Login page
    When User enters the invalid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then It should show the error msg

    Examples: 
      | Username          | Password   |
      | shivashankaranssk | Shiva@191  |
      | shivashankaranss  | Shiva@1919 |

  @empty_Login
  Scenario Outline: Validation of invalid Login Credentials
    Given User is on the Adactin Login page
    When User enters the invalid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then It should show the error msg as Enter Username or Enter password

    Examples: 
      | Username          | Password   |
      | shivashankaranssk |            |
      |                   | Shiva@1919 |
      |                   |            |
