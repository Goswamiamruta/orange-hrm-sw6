@regression
Feature: orangehrm login page
  As a user, I would like to login SuccessfullyEnter username
  @author_Amruta  @smoke @regression
  Scenario: verify User Should Login SuccessFully
    Given     I am on HomePage
    When      Enter username
    And       Enter password
    And       Click on Login Button
    Then      Verify "WelCome" Message
  @author_Amruta @regression
  Scenario: verify That The LogoDisplay On HomePage
    Given        I am on HomePage
    When         Login To The application
    Then         Verify Logo is Displayed

  @sanity
  Scenario:  verify User Should LogOut SuccessFully
    Given        I am on HomePage
    When         Login To The application
    Then         Click on User Profile logo
    And          Mouse hover on "Logout" and click
    And          Verify the text "Login Panel" is displayed
  @regression
  Scenario Outline: verify Error Message With Invalid Credentials
    Given        I am on HomePage
    When         Enter username <username>
    Then         Enter password <password>
    Then         Click on Login Button
    And          Verify Error message <errorMessage>

    Examples: Test Data
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |
