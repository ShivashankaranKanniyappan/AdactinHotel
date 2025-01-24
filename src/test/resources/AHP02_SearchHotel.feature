@All_Scenarios
Feature: Adactin Hotel - Search Hotel

  @search_Hotel
  Scenario Outline: Seaching the hotels validation
    Given User should be in Adactin Hotel Home page
    When User select the Location, Hotels, RoomType, NoOfRooms,
    And User Enters the checkIn and checkOut Date
    Then User select AdultsPerRoom, ChildrenPerRoom and Clicks the search button
    And It should be redirected to Hotel booking page
    And User select the hotel and continue for the payment
    And User should enter the FirstName, LastName, BillingAddress, CCNumber, CCType, ExpiryMonth, ExpiryYear, CVV
    Then User click the bookNow
    Then it should show the Order Number

    