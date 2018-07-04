Feature: CucumberJava

@POC1
Scenario: Login functionality exists
Given User launches Browser "CHROME"
Then user loads datasheet "C:\\evidence\\testdata.xlsx"
Then User navigates to "https://w3.ibm.com/"
Then user enter text in textbox "login>username"
Then user enter text in textbox "login.passwords"
Then user clicks on button "login.signIn"
Then user clicks on button "compose.new mail"
Then user enter text in textbox "compose.draft mail"
Then user clicks on button "compose.send"
Then user clicks on button "logout.logout"

@POC2 @SubTASK_123
Scenario: Login functionality exists
Given User launches Browser "CHROME"
Then user loads datasheet "C:\\evidence\\testdata.xlsx"
Then User navigates to "https://w3.ibm.com/"
Then user enter textin textbox "login.username"
Then user enter textin textbox "login.passwords"
Then user clicks on button "login.signIn"
Then user clicks on button "compose.new mail"
Then user enter textin textbox "compose.draft mail"
Then user clicks on button "compose.send"
Then user clicks on button "logout.logout"

@POC3
Scenario: Login functionality exists
Given User launches Browser "CHROME"
Then user loads datasheet "C:\\evidence\\testdata.xlsx"
Then User navigates to "https://w3.ibm.com/"
Then user enter textin textbox "login.username"
Then user enter textin textbox "login.passwords"
Then user clicks on button "login.signIn"
Then user clicks on button "compose.new mail"
Then user enter textin textbox "compose.draft mail"
Then user clicks on button "compose.send"
Then user clicks on button "logout.logout"