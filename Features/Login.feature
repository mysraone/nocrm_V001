Feature: NopCommerce  Login
  @smoketest
Scenario: Successful Login with valid credentials
    Given User launch Chrome Browser
     When User opens URL "http://admin-demo.nopcommerce.com/login"
      And User enters username: "admin@yourstore.com"
      And User enters Password: "admin"
      And Click on login
     Then Page titile should be "Dashboard / nopCommerce administration"
      And User click on Logout link
      And close chrome browser

Scenario Outline: Login Data Driven
    Given User launch Chrome Browser
     When User opens URL "http://admin-demo.nopcommerce.com/login"
      And User enters username: "<email>"
      And User enters Password: "<password>"
      And Click on login
     Then Page titile should be "Dashboard / nopCommerce administration"
      And User click on Logout link
      And close chrome browser
      
     Examples:
     	 | email | password |
     	 | admin@yourstore.com |  admin  |
     	 | admin@yourstore.com |  admin |