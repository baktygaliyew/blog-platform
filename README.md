# 📝 Blog Platform
A blogging platform built with Spring Boot 3 and Java 21, featuring secure JWT authentication, post management (including drafts), categories, and tags. This application uses Spring Security, JPA, PostgreSQL, and MapStruct for fast development and clean architecture.

### ✅ Features

- 🔐 User authentication using JWT
- 📝 CRUD operations on blog posts
- 🗃️ Category and tag management
- 🧾 Draft post support
- 🗂️ Data mapping with MapStruct
- ⚡  Integrated PostgreSQL via Docker
- 🧪 H2 for testing environment
- 🧭 Adminer for database visualization

### 🔧 Technologies Used
| Tech             | Version |
| ---------------- | ------- |
| Java             | 21      |
| Spring Boot      | 3.5.0   |
| Spring Security  | ✅       |
| PostgreSQL       | ✅       |
| H2 (Test DB)     | ✅       |
| JWT (jjwt)       | 0.11.5  |
| MapStruct        | 1.6.3   |
| Lombok           | 1.18.36 |
| Docker & Compose | ✅       |



### 📦 API Endpoints
#### 🔐 Authentication
| Method | Endpoint             | Description                        |
| ------ | -------------------- | ---------------------------------- |
| POST   | `/api/v1/auth/login` | Authenticate and receive JWT token |

#### 📝 Posts
| Method | Endpoint               | Description                     |
| ------ | ---------------------- | ------------------------------- |
| POST   | `/api/v1/posts`        | Create a new post               |
| GET    | `/api/v1/posts/{id}`   | Get a specific post             |
| PUT    | `/api/v1/posts/{id}`   | Update an existing post         |
| DELETE | `/api/v1/posts/{id}`   | Delete a post                   |
| GET    | `/api/v1/posts/drafts` | Get authenticated user's drafts |

#### 🗂️ Categories
| Method | Endpoint                  | Description        |
| ------ | ------------------------- | ------------------ |
| GET    | `/api/v1/categories`      | Get all categories |
| POST   | `/api/v1/categories`      | Create a category  |
| DELETE | `/api/v1/categories/{id}` | Delete a category  |

#### 🏷️ Tags
| Method | Endpoint            | Description  |
| ------ | ------------------- | ------------ |
| GET    | `/api/v1/tags`      | Get all tags |
| POST   | `/api/v1/tags`      | Create a tag |
| DELETE | `/api/v1/tags/{id}` | Delete a tag |

### 🚀 Getting Started
#### Prerequisites
- Java 17+
- Maven 3.9+
- Docker
- IntelliJ IDEA (recommended)

#### 🐳 Run with Docker
You can use Docker to run the database and Adminer UI locally.
```
docker-compose up -d
```

Access Adminer at http://localhost:8888

    System: PostgreSQL
    Server: db or localhost
    Username: postgres
    Password: changemeinprod!

#### 🚀 Running the App
With Maven
```
./mvnw spring-boot:run
```
Or Package and Run
```
./mvnw clean package
java -jar target/blog-0.0.1-SNAPSHOT.jar
```
### 🧾 License
This project is licensed under the MIT License.
