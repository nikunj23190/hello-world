Feature:
  As a user
  I want to be able to add new clients in the system
  So that i can add accounting data for that client
  As a facebook user 
  I want to login and Search person name Kanika

Scenario: Search Kanika in Facebook with valid user login
    Given the user is on login page of facebook
    When the user choose to login
    And he provides user id as 
    And he provides password 
    And he click on submit button
    Then Successfully login
    

