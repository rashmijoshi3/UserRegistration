Registration with Exclusion Service
============

## Problem statement
Build a web application that offers a remote service interface (endpoint) to register a user. A user
can only register if not part of an exclusion list. The goal is to demonstrate that the web application
runs, the tests are passing, and real HTTP requests can be made. In summary:
1. Set up a way to run a web application server
2. Implement a REST endpoint for the register operation based on the given interface
   specifications
3. Implement a simple way for the web application to remember already registered users (no
   real persistence needed, in-memory is sufficient)
4. Implement a way to use the given 'ExclusionService' interface to simulate the business
   logic of validating the user against an exclusion list.


## Running Application

1. Go to UserRegistration directory
2. UserRegistrationApplication is main class to run application
3. Go to http://localhost:8080/register
