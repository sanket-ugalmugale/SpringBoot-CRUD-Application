# Spring Boot CRUD Application

A simple REST API project built using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL** to perform CRUD (Create, Read, Update, Delete) operations.

## About the Project

This project demonstrates how to build REST APIs in Spring Boot and connect an application to a MySQL database using Spring Data JPA.

### Features

- Create a new student record
- Retrieve student records
- Update an existing student record
- Delete a student record
- Persist data in a MySQL database using Spring Data JPA

> The CRUD features above describe the intended API functionality. Adjust the endpoint paths below to match your controller if they differ.

## Technologies Used

- Java 21
- Spring Boot 4.1.1
- Spring Web MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman (for API testing)

## Prerequisites

Install the following before running the project:

- JDK 21
- MySQL Server
- Maven (or use the included Maven Wrapper)
- An IDE such as IntelliJ IDEA or Eclipse
- Postman or another REST API client (optional)

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repository-name>.git
cd <your-repository-name>
```

Replace the URL and repository name with your own GitHub details.

### 2. Create the MySQL database

Open MySQL and run:

```sql
CREATE DATABASE student_db;
```

If your application uses a different database name, use that name instead.

### 3. Configure the database connection

Add or update these properties in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace `YOUR_MYSQL_USERNAME` and `YOUR_MYSQL_PASSWORD` with your local MySQL credentials. Make sure the database name matches the one you created.

**Security note:** Do not commit real database passwords or other secrets to GitHub. For a public repository, use environment variables or a local configuration file excluded from version control.

### 4. Run the application

From the project root, run one of these commands.

Using the Maven Wrapper on Windows:

```bash
mvnw.cmd spring-boot:run
```

Using Maven:

```bash
mvn spring-boot:run
```

The application normally starts at:

```text
http://localhost:8080
```

Check the console output for startup errors.

## API Endpoints

The exact URLs depend on the mappings in your controller. If your controller uses the base path `/api/students`, a typical CRUD API can look like this:

| Method | Endpoint | Purpose |
|---|---|---|
| POST | `/api/students` | Create a student |
| GET | `/api/students` | Retrieve all students |
| GET | `/api/students/{id}` | Retrieve a student by ID |
| PUT | `/api/students/{id}` | Update a student |
| DELETE | `/api/students/{id}` | Delete a student |

Use Postman to send requests to `http://localhost:8080`. Update the endpoint paths and JSON fields to match your actual controller and entity.

### Example JSON

A typical student request body might look like this:

```json
{
  "name": "Rahul",
  "age": 21,
  "city": "Pune"
}
```

Use only the fields that exist in your `Student` entity.

## Project Structure

A typical Spring Boot project structure is:

```text
src/
└── main/
    ├── java/
    │   └── com/example/SpringBootDemoApplication/
    │       ├── Controller/
    │       ├── entity/
    │       ├── repository/
    │       ├── service/
    │       └── SpringBootDemoApplication.java
    └── resources/
        └── application.properties
pom.xml
mvnw
mvnw.cmd
```

Your actual package and folder names may differ.

## Learning Outcomes

- Creating REST endpoints with Spring Boot
- Implementing CRUD operations
- Connecting Spring Boot to MySQL
- Using Spring Data JPA repositories
- Testing REST APIs with Postman
- Managing project dependencies with Maven

## Author

Sanket Ugalmugale

GitHub: [sanket-ugalmugale](https://github.com/sanket-ugalmugale)

---

