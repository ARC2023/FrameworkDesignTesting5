
Feature: Data Driven Testing

  @ddt
  Scenario Outline: Data Driven Testing in scenario outline
    Given Name of employee "<name>"
    When salary of employee "<salary>" in step
    Then company of employee "<company>" in step

    Examples: 
      | name  | salary | company  |
     |Bharti|90000|IBM|
     |Anjali|99000|Wipro|
     |Tushar|96000|LTI|
