package config;

import animal.Cat;
import animal.Dog;
import cage.AnimalCage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Timer;


@Configuration
public class AppConfig {
    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public AnimalCage animalCage() {
        return new AnimalCage();
    }

    @Bean
    public Timer timer() {
        return new Timer();
    }
}