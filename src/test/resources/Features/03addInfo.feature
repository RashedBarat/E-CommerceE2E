Feature: Login

  @smoke
  Scenario Outline: Add new customer into the system
    Given user in ecom page
    When user enter '<username>' and '<password>'
    Then click login button
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

