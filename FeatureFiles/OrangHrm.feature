Feature: LoginModule
@loginsingledata
Scenario: Validate Login with single data
Given launch url in chrome
When i enter user name and enter password
When user click on login
Then verify dashboard text in url
Then i Close Browser
@loginwithmultiple
Scenario Outline: Validate Login with multiple data
Given I launch url in "<Browser>"
When User Enter "<UserName>" in username field
When user Enter "<Password>"in password field
When user click on login button
Then user verifies url
Then user close browser
Examples:
|Browser|UserName|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin1|Qedge123!@#|
|firefox|Admin|Qedge123|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|

