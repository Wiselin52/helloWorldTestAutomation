Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
 Given User is on Home Page "http://localhost:8081/helloWorld/index.html" on browser "chrome"
 When User Enters Username as "John Doe"
 And User clicks on "Submit" button
 Then Message displayed "Hello John Doe"
 Then close browser