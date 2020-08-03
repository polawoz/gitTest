package testgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "hsql");
        SpringApplication.run(GitTestApplication.class, args);

        System.out.println("Prrrrrroooooosiaczka lovvvvve");
    }
}
