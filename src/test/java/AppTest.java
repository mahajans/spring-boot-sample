/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import me.sourabh.springboot.app.GreetingController;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        GreetingController classUnderTest = new GreetingController();
        assertNotNull("app should have a greeting", classUnderTest.greeting("adf"));
    }
}
