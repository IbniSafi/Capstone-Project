Feature: Sing In Feature

Background:
Given User is on retail website
When User click on Sign in option
@singinTest
Scenario: Verify user can sign in into Retail Application
And User enter email 'Test@tek.com' and password 'Tek&2025'
And User click on login button
Then User should be logged in into Account

@newAccount
Scenario: Verify user can create an account into Retail Website
And User click on Create New Account button
And User fill the signUp information with below data
| name     | email                     | password  | confirmPassword |
| panthers | panthers202@tekschool.com | Tek@2025  | Tek@2025        |
And User click on SignUp button
Then User should be logged into account page


