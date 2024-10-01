Registration and Login Page with Spring Boot, Thymeleaf, Hibernate, and Spring Security
This project is a simple web application that demonstrates user registration and login functionality using the following technologies:

    Spring Boot: For building the backend REST services.
    Thymeleaf: For building the front-end views.
    Hibernate (JPA): For ORM and database interaction.
    Spring Security: For securing the login and registration functionality.
    MySQL: As the database for persisting user information.
    Spring DevTools: For hot reloading during development.

 Features
   User registration with validation.
   Password hashing using BCrypt.
   Custom login page.
   Secured access to certain parts of the application.
   Logout functionality.
   Front-end with Thymeleaf templating.

   
Prerequisites
Before running the application, ensure you have the following installed:

    Java 17 or later
    Maven 3.8+ or Gradle (if preferred)
    MySQL Server
    An IDE like IntelliJ IDEA, Eclipse, or VS Code

1. Clone the Repository
   git clone https://github.com/your-username/registration-login-springboot
cd registration-login-springboot
2. Database Setup

    Start your MySQL server.
    Create a new database:
     CREATE DATABASE user_registration;


 3. Update the application.properties file with your MySQL database configuration:
      spring.datasource.url=jdbc:mysql://localhost:3306/user_registration?useSSL=false&serverTimezone=UTC
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update


4. Running the Application
You can run the application in your IDE or from the command line.
Run with Maven:
   mvn spring-boot:run
The application should now be running at http://localhost:8080.
5. Endpoints

    /registration: Register a new user.
    /login: Custom login page for existing users.
    /home: A secured page that can only be accessed by authenticated users.
    /logout: Logout endpoint to invalidate the session.

Configuration Files
application.properties
# MySQL Database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/user_registration?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=yourpassword

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Spring Boot DevTools (for development purposes)
spring.devtools.restart.enabled=true
spring.devtools.livereload.enabled=true

# Server configuration
server.port=8080
Here's a sample README.md file for a Registration and Login application using Thymeleaf, Hibernate, Spring Security, MySQL, Spring Boot, and Spring DevTools:
Registration and Login Page with Spring Boot, Thymeleaf, Hibernate, and Spring Security

This project is a simple web application that demonstrates user registration and login functionality using the following technologies:

    Spring Boot: For building the backend REST services.
    Thymeleaf: For building the front-end views.
    Hibernate (JPA): For ORM and database interaction.
    Spring Security: For securing the login and registration functionality.
    MySQL: As the database for persisting user information.
    Spring DevTools: For hot reloading during development.

Features

    User registration with validation.
    Password hashing using BCrypt.
    Custom login page.
    Secured access to certain parts of the application.
    Logout functionality.
    Front-end with Thymeleaf templating.

Prerequisites

Before running the application, ensure you have the following installed:

    Java 17 or later
    Maven 3.8+ or Gradle (if preferred)
    MySQL Server
    An IDE like IntelliJ IDEA, Eclipse, or VS Code

Getting Started
1. Clone the Repository

bash

git clone https://github.com/your-username/registration-login-springboot
cd registration-login-springboot

2. Database Setup

    Start your MySQL server.

    Create a new database:

    sql

CREATE DATABASE user_registration;

Update the application.properties file with your MySQL database configuration:

properties

    spring.datasource.url=jdbc:mysql://localhost:3306/user_registration?useSSL=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update

3. Running the Application

You can run the application in your IDE or from the command line.
Run with Maven:

bash

mvn spring-boot:run

Run with Gradle:

bash

./gradlew bootRun

The application should now be running at http://localhost:8080.
4. Endpoints

    /registration: Register a new user.
    /login: Custom login page for existing users.
    /home: A secured page that can only be accessed by authenticated users.
    /logout: Logout endpoint to invalidate the session.

Configuration Files
application.properties

properties

# MySQL Database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/user_registration?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=yourpassword

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Spring Boot DevTools (for development purposes)
spring.devtools.restart.enabled=true
spring.devtools.livereload.enabled=true

# Server configuration
server.port=8080

Folder Structure
src
└── main
    ├── java
    │   └── com.example.registration
    │       ├── config          # Security and application configuration
    │       ├── controller      # Controllers for handling web requests
    │       ├── entity          # Entity classes mapped to the database
    │       ├── repository      # Data access layer using Spring Data JPA
    │       └── service         # Service layer containing business logic
    └── resources
        ├── static              # Static assets (CSS, JS, images)
        ├── templates           # Thymeleaf templates for web pages
        └── application.properties   # Spring configuration file

Main Technologies Used
1. Spring Boot

This project is built on Spring Boot for rapid application development. It simplifies the dependency management and configuration setup.
2. Spring Security

Spring Security provides authentication and authorization features to secure the login and registration functionality. It includes:

    Custom login form.
    Password encoding with BCrypt.
    Role-based authorization for accessing different parts of the application.

3. Hibernate (JPA)

Hibernate is used as the ORM tool to interact with the MySQL database. It simplifies data access and management using entity classes.
4. Thymeleaf

Thymeleaf is a Java template engine used for rendering dynamic web pages. It seamlessly integrates with Spring Boot and allows creating rich, dynamic HTML views.
5. MySQL

MySQL is the relational database used to store user information. User details such as username, email, and password are persisted in the database.
6. Spring DevTools

Spring DevTools is included for hot-reloading during development, which allows changes to be instantly reflected without restarting the application.
How to Use

    User Registration:
        Navigate to /registration and fill out the form to create a new account.
        The form includes server-side validation for fields like email and password.

    User Login:
        After registering, log in with your credentials via the /login page.
        Access to certain pages like /home will only be available after logging in.

    Logout:
        Click the logout button to log out and invalidate the current session. You will be redirected to the login page.

Customization

Feel free to customize the project based on your needs. You can add new pages, roles, or modify the authentication process by changing the security configuration in UserConfiguration.
Troubleshooting

    If you encounter errors while connecting to MySQL, ensure that:
        MySQL is running.
        The database credentials in application.properties are correct.
        The JDBC URL points to the correct database and port.        
 
