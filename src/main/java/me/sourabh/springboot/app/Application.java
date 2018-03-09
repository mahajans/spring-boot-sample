package me.sourabh.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "me.sourabh.springboot")
@EnableMongoRepositories(basePackages = "me.sourabh.springboot")
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        AppProperties config = context.getBean(AppProperties.class);
        System.out.println(config.getSampleIntProperty());
        System.out.println(config.getSampleStringProperty());
        System.out.println(config.getSampleListProperty());
    }
}