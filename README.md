Overview
* This repository contains the system design and implementation for a simplified version of the Stack Overflow platform. The goal of this project is to showcase a scalable and efficient system architecture to handle the key features of a Q&A platform.

Functionalities
1. Login/Signup
2. User can add/edit/delete question
3. User can upvote/downvote question
4. Moderator can add Tags
5. User can add comment to question/answer
6. Moderator can correct answer
7. Moderator can close or open question

- User
- Moderator
- Visitor (Unregisterd users access to limited information)
- Question
- Answer
- Vote
- Tags
- Comment

Tech Stack

* Backend: Node.js with Express
* Database: MongoDB for storing questions, answers, and user data.
* Message Queue: RabbitMQ for inter-service communication.
* Caching: Redis for caching frequently accessed data.
* Frontend (if applicable): React.js
