Feature: Customer
 
Scenario: Add new customer
 
    Given User launch Chrome Browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and password as "admin"
    And Click on login button
    Then User can view Dashbaord 
    When User click on customers menu
    And Click on customers tab
    And Click on Add new button
    Then User can view Add new customer page
    When User Enters customer info
    And Click on save button 
    Then User can view confirmation message "The new customer has been added successfully."
    And Close browser
    