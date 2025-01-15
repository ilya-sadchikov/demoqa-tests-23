import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SimpleJunitTest {

    int result;

    @AfterAll


    @BeforeAll
    static void beforeAll(){
        System.out.println("###  beforeALL");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("###  beforeeach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("###  aftereach\n");
    }

    @Test
    void firstTest() {
        int result = getResult();
        System.out.println("###     firstTest");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        int result = getResult();
        System.out.println("###     secondTest");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        int result = getResult();
        System.out.println("###     thirdTest");
        Assertions.assertTrue(result > 2);
    }

    public int getResult() {

       return result = 3;
    }


}
