Feature: Log In Store Portal
  As a user
  I want to enter to Store Portal
  To go shopping
  Scenario Outline:Log In Store
    Given that I am in the portal
    When Digit my <username> and <password>
    Then I can do my shopping
    Examples:
      |username                   |password |
      |diego.alvarez@castor.com.co|santi1126|