Feature: this feature is for smoke tests

  @smoke
  Scenario: Smoke Test
    Given I print Hello Word
    Then everybody is happy

    @regression
    Scenario: This is for cucumber test
      Given I run cucumber test
      Then verify this is Cucumber