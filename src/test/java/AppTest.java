/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import me.sourabh.springboot.app.Application;
import me.sourabh.springboot.service.GreetingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AppTest {

    @Autowired
    private GreetingService service;

    @Test public void testAppHasAGreeting() {
        assertNotNull("app should have a greeting", service.getGreeting("adf"));
        System.out.println(service.getGreeting("test"));
    }
}
