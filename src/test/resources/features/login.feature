Feature: Login feature

  Background:
   Given  User click on the user icon
    And   click on disconnection button

    @FC-107
    Scenario Outline: Login successfully
        Given User is on the login page
        When  User fill in the connection form with "<email>" and "<password>"
        And   Click on the connection button
        Then  The homepage is opened
#       And   Click on accept cookies button


       Examples:
        | email                   | password   |
        | malikadouma19@gmail.com | Malika2016+|

    @FC-36
    Scenario Outline: Create an account successfully
      Given User is on the login page
      And   Click on the signUp button
#      And   Click on accept cookies button
      When  User click on civility
      And   Fill in the fields "<firstname>", "<name>", "<number>", "<email>", "<password>",
      And   Click to choose news email and SMS
      And   Click on the creation account button
      Then  The account is successfully created

      Examples:
      | firstname | name | number    | email                          | password   |
      | Divine    | NTI  | 0307273961|CoralieVadeboncoeur@armyspy.com | Aliyah2020*|
