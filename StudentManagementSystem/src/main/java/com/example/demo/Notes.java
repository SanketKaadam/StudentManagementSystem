package com.example.demo;

public class Notes 
{
	/*
	 1. This dependencies we use for this projects
         Spring web
         Thymeleaf
         MySQL Driver
         Spring Data JPA
         Spring Boot DevTools
         
         
     2. He create sub packages for controller, repository etc
     
     3. Now we configure DB related thinks in application.properties file 
     
     4. Create student class in entity package with 4 variables, getter/setter, parameterize constructor and always create normal constructor also 
     
     5. we use annotations in student class so that it work with database example we give primary key, column names, table name etc
     
     6. Now we create StudentRepository interface in repository package and extends by Jparepository interface, In StudentRepository we don't need to use @Repository annotation because internally in SimpleJparepository class it used in jparepository interface.
     
     7.  Internally like @Repository annotation @Transaction annotation also used so we don't need to write at service layer
     
     8. Now he create StudentService interface and in demo.service package he create another sub package demo.service.impl to implement dependency injection or lose coupling, in demo.service.impl he create class StudentServicesImpl and this class implements StudentService interface
     
     9. Now he create Student class in controller package and gives @Controller annotation
     
     Till here we create base now we are creating features for SMS(Student Management System)
     
     10. 
	 */

}
