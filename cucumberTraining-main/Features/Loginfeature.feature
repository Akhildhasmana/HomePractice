Feature: Login

  Scenario: Successfull login with credentials
    Given User launch Chrome Browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and password as "admin"
    And Click on login button
    Then the page tittle is "Dashboard / nopCommerce administration"
    When User clicks on logout
    Then the page tittle is "Your store. login"
    And Close browser

    
    
    
    
  Scenario Outline: Successfull login with credentials
    Given User launch Chrome Browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User Enters Email as "<email>" and password as "<password>"
    And Click on login button
    Then the page tittle is "Dashboard / nopCommerce administration"
    When User clicks on logout
    Then the page tittle is "Your store. login"
    And Close browser
    
    Examples:
    |email|password|
    |admin@yourstore.com|admin|
    |admin@yourstore.com|test|
    #Note scenario will execute as per the data set given under the examples .