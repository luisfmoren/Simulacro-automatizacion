#Autor: Luis Moreno

  @stories
  Feature: Test El Colombiano
    As a user, I wants to validate to page el colombiano

  @scenario1
  Scenario: Login in the page
    Given than luis wants to login
    When he enter your information
    Then he will be login in the page

    @scenario2
    Scenario: register in the page
      Given than luis wants register in the page
      When he enter your information
      |strName|strLastName|strEmail            |strPassword |
      |luis   |moreno     |luismoreno@gmail.com|LuisMoreno77|
      Then he will have a user in the page
      |strText     |
      |CREAR CUENTA|

    @scenario3
    Scenario: search about sports
      Given than luis wants search news about sports
      When he enter the information about sports
      |strSearch|
      |deportes |
      Then he will find information about sports
      |strTextTwo|
      |CICLISMO  |