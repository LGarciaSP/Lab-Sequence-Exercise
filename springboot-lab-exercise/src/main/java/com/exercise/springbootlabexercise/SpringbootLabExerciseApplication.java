package com.exercise.springbootlabexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * The `SpringbootLabExerciseApplication` class is the entry point of the application.
 * It starts and configures the application, enabling caching support.
 */
@SpringBootApplication
@EnableCaching
public class SpringbootLabExerciseApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootLabExerciseApplication.class, args);
	}
}
