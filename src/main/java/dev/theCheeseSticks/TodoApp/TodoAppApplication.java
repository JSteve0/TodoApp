package dev.theCheeseSticks.TodoApp;

import dev.theCheeseSticks.TodoApp.documents.Todo;
import dev.theCheeseSticks.TodoApp.documents.User;
import dev.theCheeseSticks.TodoApp.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class TodoAppApplication implements CommandLineRunner {

	//For Testing
	private final UserRepository userRepository;

	//For Testing
	public TodoAppApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//For testing
		userRepository.save(new User(null, "jsteve", "j@gmail.com", "123", null));

		User u1 = new User(null, "kaldfj", "jklajdf", "abc", null);
		List<Todo> test = new ArrayList<Todo>();
		test.add(new Todo("title", "description", "", new Date(), new Date(), new Date(), false));
		u1.setTodos(test);
		userRepository.save(u1);

		System.out.println("size: " + userRepository.findAll().size());

		userRepository.findAll().forEach(System.out::println);

		userRepository.deleteAll();
	}
}
