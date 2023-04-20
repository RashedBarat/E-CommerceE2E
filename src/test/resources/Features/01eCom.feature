Feature: Login

  @test1
  Scenario Outline: Add new customer into the system
    Given user in erp page
    When user enter '<username>' and '<password>'
    Then click login button
    Examples:
      | username | password   |
      | TW190249 | Tarabr@123 |

