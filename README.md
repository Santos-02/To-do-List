# 📝 To-Do List API

### 📖 About the Project

The **To-Do List API** is a task management solution developed with **Java 17** and **Spring Boot 3.0.11**. The system was designed to provide a robust and streamlined structure for organizing tasks, focusing on relational data persistence and modern web development practices.

The project follows a monolithic architecture and was built to ensure that each task is strictly associated with its owner, providing data security and integrity.

---

### ✨ Key Features

* **User Management:** User registration with unique username validation.
* **Password Encryption:** Password hashing using **BCrypt** with a cost factor of 12 rounds.
* **Task CRUD Operations:** Create, retrieve, list, and update tasks associated with the authenticated user.
* **Business Rule Validation:**

  * Prevents tasks from being created with past start or end dates.
  * Ensures the start date always precedes the end date.
  * Validates task titles with a maximum length of 50 characters.
* **Partial Updates (Patch-style):** Supports updating specific fields without replacing the entire object.
* **Authentication Filter:** Basic Authentication middleware for request interception and validation.

---

### 🚀 Technologies Used

* **Language:** Java 17
* **Framework:** Spring Boot 3.0.11
* **Dependency Management:** Maven
* **Database:** H2 Database (Runtime Scope)
* **Security:** BCrypt Password Hashing and HTTP Basic Authentication
* **Utilities:** Lombok (to reduce boilerplate code) and Spring Boot DevTools

---

### 🧱 System Architecture

The project structure follows the principles of single responsibility and dependency injection:

1. **Controller:** Handles API endpoints and request processing.
2. **Model:** Contains the JPA entities (`UserModel`, `TaskModel`) that represent the database structure.
3. **Repository:** Abstracts data persistence through `JpaRepository`.
4. **Filter:** `FilterTaskAuth` middleware responsible for request authentication.
5. **Errors:** Centralized exception handling using `@ControllerAdvice`.

---

### 📊 System Diagrams

#### API Schema

![API Schema](Schemas/API%20schema.jpeg)

#### Database Schema

![Database Schema](Schemas/Database%20schema.jpeg)

### ⚙️ How to Run the Project

#### Requirements

* Java 17 or higher

#### Running Locally

1. Clone the repository:

```bash
git clone https://github.com/Santos-02/To-do-List.git
cd To-do-List
```

2. Build the project using the Maven Wrapper:

```bash
./mvnw clean install
```

On Windows:

```bash
mvnw.cmd clean install
```

3. Start the application:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

4. The API will be available at:

```txt
http://localhost:8080
```

The project uses an H2 in-memory database, so no additional database setup is required.

---

### 🧠 Key Concepts Practiced

During the development of this project, the following concepts were explored:

* REST API development with Spring Boot
* CRUD operations and endpoint design
* Data persistence using Spring Data JPA and H2 Database
* User authentication with HTTP Basic Authentication
* Password hashing with BCrypt
* Request filtering and authorization validation
* Exception handling using `@ControllerAdvice`
* Entity relationships and data modeling
* Dependency injection and separation of responsibilities
* Business rule validation and input validation

---

### 👨‍💻 Author

João Lucas dos Santos

---

### 📄 License

This project is licensed under the MIT License. See the LICENSE file for details.
