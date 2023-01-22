Feature: Add to cart Functionality

  Background:
    Given Navigate to Clever WebSite

  @Smoke
  Scenario Outline: User should be able to add an item to cart
    When Click elements on dialogContent
      | signInButton |
    When Enter valid Username and Password anc click login button
      | email    | something1234@gmail.com |
      | password | 1234abcd               |

    And Click elements on dialogContent
      | logIn |

    And Come to Women section and select Summer Dresses
    And Choose a product randomly
    Then Product should be added to cart
      | <message> |
    Examples:
      | message      |
      | successfully |








