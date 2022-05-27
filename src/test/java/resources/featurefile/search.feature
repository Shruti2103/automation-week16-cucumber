Feature: SignUp, Sign In and Purchase Product
#  As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.

  Scenario: TC-001 Create New User/SignUp
    Given I am on home page
    Then I navigate to SignUp page
    And  create an account with random username
@smoke
  Scenario: TC-002 Sign In with newly created user credentials
    Given I am on the Sign In Page
    When Login using newly create credentials
    Then I shall verify the address information in my address section
