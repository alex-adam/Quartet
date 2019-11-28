# Quartet

# Table of Contents
[Introduction](#introduction)  
[How-to-run](#how-to-run)  
[Improvements for Production-environment](#improvements for production environment)  

# Introduction
This is an eclipse project using Selenium to test the login portal of Quartet.

# How-to-run
The test can be run with JUnit inside of eclipse.

// gif

# Improvements for Production-environment
* Timeouts globally defined
* Using _@CacheLookup_ to make the lookup once and cache element
* Check for other browsers
* Additional Testcases could be:
  * Check for correct credentials
  * Check for incorrect format of username/email
