####  OOP Day2

​    

Goals for the day:

- review and cement the basic OOP principles
- become a little more comfortable with "big" applications (meaning 200+ lines of code )
- our thought process when we need to start designing an application





Car Dealership

- which to design first? the public interface or the inner details
  - "top down or bottom up" design concept
  - depends on a lot of factors and most teams will use both when delivering software
- Top Down: identify "top level" objects first then find objects that represent smaller portions of the system. 
  - we continually refine those definitions until the system is complete
  - In our Dealership application this may look like this designing objects in this order:
    - Dealership
    - Departments (ex Sales, Service, Finance)
    - Staff
    - Vehicles
- Bottom up: the lowest level of objects (those that are the most specific) would be designed first and then those objects would be combined into bigger modules until the overall system is complete.
  - In the Dealership this would be designed in this order:
    - Vehicles
    - Departments
    - Dealership
    - Staff

Starting with Vehicles

 - Object hierarchy
    - "Gen-Spec" (Generalized-Specialized) / "is-a" relationship
      	- means start with base vehicle class and then build out specialized vehicle classes. 
   	- Find common **abstractions**(the guts of our classes that we are hiding away) and model those in our base class then having specialized classed derive those from the base class. 



New things we learned about today

1. Enumeration (SUNDAY) 
2. instanceof keyword
3. How to work with a multifile Java program in VS Code. 