package team9.gccoffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GcCoffeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcCoffeeApplication.class, args);
    }
}
