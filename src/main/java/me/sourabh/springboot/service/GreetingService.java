package me.sourabh.springboot.service;

import me.sourabh.springboot.dao.GreetingDAO;
import me.sourabh.springboot.domain.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Greeting service
 *
 * Created by sourabhmahajan on 11/02/18.
 */
@Service
public class GreetingService {

    private final GreetingDAO greetingDAO;

    @Autowired
    public GreetingService(GreetingDAO greetingDAO) {
        this.greetingDAO = greetingDAO;
    }

    public Greeting getGreeting(String name) {
        return greetingDAO.getGreeting(name);
    }
}
