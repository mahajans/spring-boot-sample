package me.sourabh.springboot.dao;

import me.sourabh.springboot.domain.Greeting;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicLong;

/**
 * DAO for greeting
 *
 * Created by sourabhmahajan on 11/02/18.
 */
@Repository
public class GreetingDAO {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting getGreeting(String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

}
