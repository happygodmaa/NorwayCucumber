@test0
Feature: Login scenario outline Test

Scenario Outline:
Given User0 navigate to Login Page
When User0 Enters <uid> and <password>
Then User0 close all browser

Examples:
|uid|	|password|
|nik8|	|pwd3|
|nik9|	|pwd2|