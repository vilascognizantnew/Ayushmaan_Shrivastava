package com.cts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cts.model.Book;
import com.cts.repos.BookRepository;

@SpringBootApplication
public class SpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}
	
	@Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", 15.41));
            repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", 9.69));
            repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", 47.99));
        };
    }

}
