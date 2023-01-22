#• Siteye gidin.
#• Sign In butonuna tıklayın.
#• Geçerli veya geçersiz bir email ve password girin.
#• Sign In butonuna tıklayın.
#• Başarılı bir şekilde login olup olamadığınızı doğrulayın

#Scenario Outline kullanarak positive ve negative testler için username
#ve password gönderiniz (negatif login için de senaryolar oluşturulacak).

Feature: Login Functionality

  Background:
    Given Navigate to Clever WebSite

  @Smoke
  Scenario Outline:User should be able to login successfully
    When Click elements on dialogContent
      | signInButton |
    When Enter valid Username and Password anc click login button
      | email    | something1234@gmail.com |
      | password | 1234abcd               |
    And  Click elements on dialogContent
      | logIn |
    Then User should be able to login successfully
      | <message> |

    Examples:
      | message |
      | Welcome |

  @Smoke
  Scenario Outline: User should not be able to login successfully

    When Click elements on dialogContent
      | signInButton |
    When Enter valid Username and Password anc click login button
      | email    | something1234@gmail.com |
      | password | invalid123             |
    And  Click elements on dialogContent
      | logIn |
    Then User should not be able to login successfully
      | <message> |

    Examples:
      | message |
      | There   |
