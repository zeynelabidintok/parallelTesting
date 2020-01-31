@view_orders
Feature: View All Orders

    As User I want to be able to see all orders

  Scenario: Verify that List of  All Orders table title and displayed
    Given user is on the Login page
    Then user logs in
    And user verifies that "list of All Orders" table-tile is displayed

