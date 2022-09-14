package dev.theCheeseSticks.TodoApp.repositories;

import dev.theCheeseSticks.TodoApp.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}