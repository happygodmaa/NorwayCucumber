@test
Feature: Login Test

Background:
Given User navigate to Login Page

Scenario: login page success
When User Enters "nik1" and "pass1"
Then User close all browser



