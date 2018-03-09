package me.sourabh.springboot.service;

import me.sourabh.springboot.dao.GreetingDAO;
import me.sourabh.springboot.domain.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(GreetingService.class);

    @Autowired
    public GreetingService(GreetingDAO greetingDAO) {
        this.greetingDAO = greetingDAO;
    }

    public Greeting getGreeting(String name) {
        logger.info("greeting service called with args: {}", name);
        return greetingDAO.getGreeting(name);
    }
}
