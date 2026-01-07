# 📚 Enterprise Library System – Spring Boot

A production-ready backend module built using **Spring Boot 3.x**, demonstrating enterprise-level concepts such as **JWT security**, **Liquibase database versioning**, **multi-profile configuration**, **RBAC**, **Actuator monitoring**, and **unit & security testing**.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Security (JWT + Basic Auth)
- Spring Data JPA
- Liquibase (YAML)
- H2 Database (dev)
- Maven
- JUnit 5 & Mockito
- Actuator

---

## 📂 Features Implemented

### 🔐 Security
- JWT-based authentication for `/api/**`
- Stateless session management
- Role-based access control (RBAC)
- Two security filter chains:
  - JWT → `/api/**`
  - Basic Auth → `/actuator/**`, `/h2-console`, Swagger

### 🗄 Database & Persistence
- Liquibase master changelog with modular changesets
- Context-based data seeding (`dev`, `prod`)
- JPA entities for Users and Books

### 📊 Monitoring
- Spring Boot Actuator enabled
- Full DB health details in `dev`
- Restricted health info in `prod`

### 🧪 Testing
- Unit tests using Mockito
- Security tests using MockMvc
- `@WithMockUser` for role simulation

### 🎯 Bonus
- `/api/users/me` endpoint using `SecurityContextHolder`

---

## 📁 Project Structure