Feature: Contact Customer service
  @smoke
Scenario: TC-004 Contact customer service for the previous successful order
Given I am on the Sign In Page
When Login using newly create credentials
And I am on the contact page
Then I send refund request to customer care for previous order