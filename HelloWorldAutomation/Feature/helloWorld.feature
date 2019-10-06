Feature: BDD Demo
Scenario: Accept input and display message
 Given User is on Home Page "http://localhost:8081/helloWorld/index.html" on browser "chrome"
 When User Enters Username as "John Doe"
 And User clicks on "Submit" button
 Then Message displayed "Hello John Doe"
 Then close browser