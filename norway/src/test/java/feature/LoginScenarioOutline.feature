@test3
Feature: Login Test

Scenario Outline:
Given User navigate to Login Page
When User Enters "<uid>" and "<password>"
Then User close all browser

Examples:
|uid|	|password|
|nik3|	|pwd3|
|nik2|	|pwd2|