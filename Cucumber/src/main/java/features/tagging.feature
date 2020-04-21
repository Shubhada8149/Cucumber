@FunctionalTest
Feature: Free CRM application Testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given this is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given this is a invalid login test

@SmokeTest
Scenario: Login with correct username and incorrect password
Given this is a invalid login test


@SmokeTest @RegressionTest
Scenario: Login with incorrect username and incorrect password
Given this is a invalid login test


@SmokeTest 
Scenario: Create new deal
Given this is create deal test


@RegressionTest
Scenario: Verify left pannel links
Given clicking on left pannel link


@SmokeTest @RegressionTest
Scenario: seach a deal
Given search deal test


@SmokeTest
Scenario: seach a contact
Given search contact test

 @RegressionTest
Scenario: seach a case
Given search case test


@SmokeTest @RegressionTest
Scenario: seach a task
Given search task test


@SmokeTest 
Scenario: seach a docs
Given search docs test


@SmokeTest @EndToEndTest
Scenario: seach a forms
Given search forms test

@EndToEndTest
Scenario: validate a report
Given this is report test

@EndToEndTest
Scenario: logout 
Given logout from application test







