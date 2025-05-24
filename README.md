# Chat_Application_Spring
This is a basic chat application backend developed using Spring Boot, which enables users to register, send messages, and retrieve chat history. The project uses Hibernate with JPA to perform seamless interactions with a MySQL database.

✨ Key Features:
✅ User Registration: Users can register and store their details in the database.
💬 Send Messages: Authenticated users can send chat messages to other users.
📜 Chat History: Users can retrieve the message history with other users based on sender/receiver.

🛠️ Tech Stack:
Backend Framework: Spring Boot
Database: MySQL
ORM Tool: Hibernate with JPA
API Type: RESTful APIs
Build Tool: Maven/Gradle

🗃️ Database Integration:
The project is connected to a MySQL database using Hibernate ORM.
All user and chat data is persisted using JPA repositories.
Proper entity relationships (e.g., @OneToMany, @ManyToOne) are defined between User and ChatMessage entities.

🔄 Workflow Summary:
User registers → data saved in MySQL via Hibernate.
User sends a message → stored in ChatMessage table.
User fetches chat history → messages fetched using JPA queries.
