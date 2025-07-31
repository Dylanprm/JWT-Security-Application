# Spring Security JWT Application  
## Secure REST API with JWT Authentication, PostgreSQL, and Email Support

---

### Introduction

**Spring Security JWT Application** is a robust, production-ready REST API starter built with Spring Boot. It provides secure user authentication and authorization using JSON Web Tokens (JWT), integrates seamlessly with PostgreSQL for data persistence, and supports email-based features such as verification and password reset via Gmail SMTP. This project is ideal for developers looking to quickly bootstrap a secure backend for web or mobile applications.

---

## 🚀 What Does This Project Do?

This project offers a ready-to-use backend with:

- **User registration and login** with JWT-based stateless authentication
- **Role-based authorization** for protected endpoints
- **Secure password storage** using hashing
- **Email verification and password reset** via Gmail SMTP
- **PostgreSQL integration** for persistent storage
- **Extensible architecture** for adding new features or adapting to other databases/providers

<img width="1170" height="595" alt="JWT Authentication Flowchart" src="https://github.com/user-attachments/assets/cb3a72b8-0cca-4feb-bb1d-eecacdef4ba4" />


---

## 🛠️ Installation & Usage

### Prerequisites

- Java 21+
- Maven or Gradle
- PostgreSQL database
- Gmail account (for email features)

### Quick Start

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/spring-security-jwt-app.git
   cd spring-security-jwt-app
   ```

2. **Configure your environment:**
   - Edit `src/main/resources/application.properties` with your database and email credentials.
   - Example:
     ```
     spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     security.jwt.secret-key=your_jwt_secret
     spring.mail.username=your_gmail
     spring.mail.password=your_gmail_app_password
     ```

3. **Run the application:**
   ```bash
   # With Maven
   mvn spring-boot:run

   # Or with Gradle
   ./gradlew bootRun
   ```

4. **Access the API:**
   - The server runs at [http://localhost:8080](http://localhost:8080)
   - Example endpoints:
     - `POST /api/auth/register` — Register a new user
     - `POST /api/auth/login` — Authenticate and receive a JWT
     - Use the JWT as `Authorization: Bearer <token>` for protected endpoints

5. **Development tips:**
   - Use [Postman](https://www.postman.com/) or [curl](https://curl.se/) to test endpoints.
   - The main code is in `src/main/java/com/primus/security/`.
   - Key files:
     - `model/` — Entity classes (e.g., `User.java`)
     - `repository/` — Data access (e.g., `UserRepository.java`)
     - `service/` — Business logic and JWT utilities (e.g., `JwtService.java`)
     - `config/` — Security and filter configuration
     - `controller/` — REST API endpoints
---
1. **Signup:**
<img width="1918" height="806" alt="JWT Signup" src="https://github.com/user-attachments/assets/9c5b1cc9-7968-40a6-bae1-b044110289bd" />

2. **Email Verification:**
<img width="1523" height="513" alt="JWT Email Verification" src="https://github.com/user-attachments/assets/729dca6c-2940-423f-b3ec-99f2dbf6ea40" />
<img width="1918" height="780" alt="JWT Verify" src="https://github.com/user-attachments/assets/0e31605e-a06d-4fe2-96a5-ac8c49c4e4f8" />

3. **Login:**
<img width="1918" height="776" alt="JWT Login" src="https://github.com/user-attachments/assets/21d6993c-8844-4c5c-8735-baca98b58ccf" />

4. **Find User:**
<img width="1918" height="808" alt="JWT Get User" src="https://github.com/user-attachments/assets/c0202e9a-1310-409a-bae7-acaef2e0e863" />

---
## How to improve on this project more!
**Add password hashing (e.g., with BCrypt).**

**Add email verification and password reset.**

**Add roles and permissions.**

**Write unit and integration tests.**

## 🙏 Thanks for checking out Spring Security JWT Application!
