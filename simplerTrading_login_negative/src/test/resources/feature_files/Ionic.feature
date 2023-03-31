Feature: User can able to login the the Simpler trading Application

  Scenario Outline: Login and Logout Functionality
    Given Users enter invalid "<UserName>" and  invalid "<PassWord>"
    And Users can able to Logout the Applications

Examples:
|UserName| PassWord |
|Rooomstest112_@simplertrading.com |                     |
|roomtest1@simplertrading.com | 4IW6i8vINHxW_awdD@1upABBOqxG |
|roomtest1@simplertrading.com |                          |
|        |          |
|roomtEST1@@simplertrading.com | 4IW6rgri8vINHxWD@142upABBOqxG |
|roomtest1@simplertrading.com | 4IW6i8vINHxWD@1upABBOqxG |
