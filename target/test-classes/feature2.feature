Feature: Calculator app
 
 Scenario Outline: Add two numbers 
 Given a as "<A>" and b as "<B>"
 When add the two integer values 
 Then Result should be sum of two integers 
 
 Examples:
 |A|B|
 |100|50|
 |20|20|
 |10|5|
 