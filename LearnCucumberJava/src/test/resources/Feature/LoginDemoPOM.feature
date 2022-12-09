Feature: Test Login with Valid Credentials

  Scenario Outline:Check login is successful with Valid Credentials
  Given browser is open
  And user is on Login Page
  When user enters <username> and <password>
  And user clicks on Login
  Then user is navigated to homepage
  
  Examples:
  	| username | password|
  	| menaka | 12345 |
  	| Ele | 12345 |
