@OF-1302
Feature: home feature

  @OF-1300
  Scenario Outline: logout successfully
    Given User is on the login page
    And   User login with "<email>" and "<password>"
    And   Click on accept cookies button
    When  User click on the user icon
    And   click on disconnection button
    Then  The user is disconnected successfully
    @ID1
    Examples:
      | email                   | password   |
      | malikadouma19@gmail.com | Malika2016+|
    @ID2
    Examples:
      | email                   | password   |
      | ngaedzoa98@gmail.com    | Malika2016+|

  @OF-1301
  Scenario Outline: Empty the cart successfully
    Given User is on the login page
    And   User login with "<email>" and "<password>"
#    And   Click on accept cookies button
    When  User click on the cart button
    And   Click on the empty cart button
    And   Click on the empty button to confirm
    Then  All the items are deleted successfully
    @ID1
    Examples:
      | email                   | password   |
      | malikadouma19@gmail.com | Malika2016+|
    @ID2
    Examples:
      | email                   | password   |
      | ngaedzoa98@gmail.com    | Malika2016+|








#  @FC-85
#  Scenario Outline:
#    Given User is on the login page
#    And   User login with "<email>" and "<password>"
#    When  User click on a product
#    And  Click on the button to add in the cart
#    Then  The product is added in the cart
#
#    Examples:
#      | email                   | password   |
#      | malikadouma19@gmail.com | Malika2016+|



