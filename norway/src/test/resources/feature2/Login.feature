@test2
Feature: Login Test

Background:
Given User navigate to Login Page

Scenario:
When User Enters "nik1" and "pass1"
Then User close all browser


Scenario Outline:
When User Enters "<uid>" and "<password>"
Then User close all browser

Examples:
|uid|	|password|
|nik3|	|pwd3|
|nik2|	|pwd2|
