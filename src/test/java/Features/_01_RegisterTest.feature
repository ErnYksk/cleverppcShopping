#✓ Data table kullanarak çözülecek.
#• Siteye gidin.
#• Sign in butonuna tıklayın.
#• Email adresi girin.
#• Create an account butonuna tıklayın.
#• Gerekli bilgileri doldurun.
#• Register Butonuna tıklayın.
#• Başarılı bir şekilde Login olduğunuzu doğrulayın

Feature: Register Functionality

  @Smoke
  Scenario Outline: Register new user

    Given Navigate to Clever WebSite
    When Click elements on dialogContent
      | signInButton |
    And  Fill the register form
      | emailCreate | something1234@gmail.com |
    And  Click elements on dialogContent
      | submitCreate |
      | gender       |
      | newsletter   |

    And Fill the register form

      | firstName | group    |
      | lastName  | study    |
      | password  | 1234abcd |

    And  Click elements on dialogContent
      | submitAccount |
    Then Alert message should be displayed
      | <message> |
    Examples:
      | message |
      | created |




