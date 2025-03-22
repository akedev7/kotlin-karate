Feature: Sample API Test

  Scenario: Get user details
    Given url 'https://jsonplaceholder.typicode.com/users/1'
    When method GET
    Then status 200
    And match response.id == 1

  Scenario: Validate email format
    * def CustomAssertions = Java.type('utils.CustomAssertions')
    * def email = "test@example.com"
    * match CustomAssertions.isValidEmail(email) == true