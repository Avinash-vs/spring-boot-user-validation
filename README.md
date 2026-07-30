# User Validation API 🛡️

This is a Spring Boot REST API demonstrating how to implement strict data validation and centralize error handling for a `User` entity. Instead of returning raw, confusing server stack traces, this application cleanly intercepts bad requests and provides structured, user-friendly error messages.

## 🛠️ Tech Stack & Tools
* **Language:** Java 17
* **Framework:** Spring Boot, Spring Web
* **Data Access:** Spring Data JPA
* **Build Tool:** Maven
* **IDE:** Eclipse

## ✨ Key Features
* **User Management:** RESTful endpoints to create and manage users via the `UserController`.
* **Input Validation:** Enforces strict data integrity using Spring Validation (e.g., ensuring fields are not blank or enforcing size limits) directly on the `User` entity.
* **Global Error Handling:** Utilizes `@RestControllerAdvice` in the `GlobalExceptionHandler` to catch `MethodArgumentNotValidException` and extract specific field errors.
* **Clean Architecture:** Well-structured MVC layers dividing controllers, services, repositories, and exception logic.

## 🚀 How to Run
1. Clone this repository to your local machine.
2. Import the project into Eclipse as an **Existing Maven Project**.
3. Open your `src/main/resources/application.properties` file and ensure your database configuration (URL, username, and password) is set correctly.
4. Right-click on `ValidationApplication.java` and select **Run As > Java Application**.
5. Use a tool like Postman to send a POST request with missing or invalid data to see the custom validation error response in action!

## 📁 Project Structure
* `com.example.controller` - Contains `UserController` to handle incoming HTTP requests.
* `com.example.entity` - Contains the `User` model with validation annotations.
* `com.example.exception` - Contains `GlobalExceptionHandler` to intercept and format validation errors.
* `com.example.repository` - Contains `UserRepository` for database interactions.
* `com.example.service` - Contains `UserService` for core business logic.
