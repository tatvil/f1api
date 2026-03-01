package es.tatvil.formula1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "es.tatvil.formula1.repository")
@EntityScan(basePackages = "es.tatvil.formula1.entity")
public class Formula1Application {

    public static void main(String[] args) {
        SpringApplication.run(Formula1Application.class, args);
    }
}