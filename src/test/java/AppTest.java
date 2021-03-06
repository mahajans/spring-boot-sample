/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import me.sourabh.springboot.app.Application;
import me.sourabh.springboot.domain.Product;
import me.sourabh.springboot.service.GreetingService;
import me.sourabh.springboot.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.NONE, properties = "spring.main.web-application-type=none")
public class AppTest {

    @Autowired
    private GreetingService service;

    @Autowired
    private ProductService productService;

    @Test
    public void testAppHasAGreeting() {
        assertNotNull("app should have a greeting", service.getGreeting("adf"));
        System.out.println(service.getGreeting("test"));
    }

    @Test
    public void testProductService() {
        Product product = productService.createProduct("P" + System.currentTimeMillis(), "d" + System.currentTimeMillis());
        assertNotNull(product);
        assertNotEquals(0, product.getId());
        System.out.println(product);
    }
}
