import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("here is beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    here is beforeEach()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("here is afterAll()");
    }

    @Test
    void firstTest() {
        System.out.println("        Here is firstTest()");
    }

    @Test
    void secondTest() {
        System.out.println("        Here if secondTest()");
    }
}
