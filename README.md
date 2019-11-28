# Quartet

## Table of Contents
[Introduction](#introduction)  
[How-to-run](#how-to-run)  
[Enhancements](#enhancements)  

## Introduction
This is an eclipse project using Selenium to test the login portal of Quartet.

##### QuartetLogin.java
POM of the Login Portal of Quartet

##### TestQuartetLogin.java
Holds the testcase and uses QuartetLogin to run its validations.

## How-to-run
TestQuartetLogin.java can be run with JUnit inside of eclipse.

![](media/test.gif)

## Enhancements
The following enhancements can be done in the future and should be revisited when
used in a production environment:
* Timeouts globally defined
* Using _@CacheLookup_ to make the lookup once and cache elements
* Check for other browsers
* Additional Testcases could be:
  * Check for correct credentials
  * Check for incorrect format of username/email
