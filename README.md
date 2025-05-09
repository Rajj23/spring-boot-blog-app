# Blog App 
A simple Blog Web Application built using **Spring Boot**, following clean architecture with support for creating, reading, updating, and deleting (CRUD) blog posts, users, categories, and comments.

## Features 
- Create, update, delete users	
- Add and manage blog posts
- Categorize posts
- Comment on posts
- RESTful API using Spring Boot
- Entity to DTO mapping with ModelMapper

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- ModelMapper
- PostgreSQL
- Postman (for API testing)

## API Endpoints 
### Users
- POST /home/api/user/create
- GET /home/api/user/get/{id}
- PUT /home/api/user/update/{id}
- DELETE /home/api/user/delete/{id}

### Categories
- POST /home/api/Category/creates
- GET /home/api/Category/get/{id}
- PUT /home/api/Category/updates/{id}
- GET /home/api/Category/getAll
- DELETE /home/api/Category/delete/{id}

### Posts
- POST /home/api/user/{userId}/category/{categoryId}/post
- GET /home/api/post/{postId}
- PUT /home/api/post/{postId}
- GET /home/api/post
- GET /home/api/user/{userId}/post
- GET /home/api/category/{categoryId}/post
- DELETE /home/api/post/{postId}

### Comments
- POST /home/api/post/{postId}/comments
- DELETE /home/api/post/comments/{commentId}

## Getting Started 

1. Clone the repo  
   git clone https://github.com/Rajj23/spring-boot-blog-app.git

2. Run the application  
   ./mvnw spring-boot:run

3. Test APIs with Postman

## License
This project is licensed under the MIT License.
