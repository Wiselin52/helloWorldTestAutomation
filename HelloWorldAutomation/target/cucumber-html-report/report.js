$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("helloWorld.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page \"http://localhost:8081/helloWorld/index.html\" on browser \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enters Username as \"John Doe\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Message displayed \"Hello John Doe\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:8081/helloWorld/index.html",
      "offset": 22
    },
    {
      "val": "chrome",
      "offset": 79
    }
  ],
  "location": "helloWorld.user_is_on_Home_Page(String,String)"
});
formatter.result({
  "duration": 2418621887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John Doe",
      "offset": 25
    }
  ],
  "location": "helloWorld.user_Enters_Username_as(String)"
});
formatter.result({
  "duration": 145128413,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 16
    }
  ],
  "location": "helloWorld.user_clicks_on_button(String)"
});
formatter.result({
  "duration": 55518918,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello John Doe",
      "offset": 19
    }
  ],
  "location": "helloWorld.message_displayed(String)"
});
formatter.result({
  "duration": 29879017,
  "status": "passed"
});
formatter.match({
  "location": "helloWorld.close_browser()"
});
formatter.result({
  "duration": 89515930,
  "status": "passed"
});
});