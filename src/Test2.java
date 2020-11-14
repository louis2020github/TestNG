import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test(priority = 2)
    void test() {
        System.out.println("Test2 test called");

    }

    @Test(priority = 1)
    void failedTest() {
        System.out.println("Test2 filedTest called");
        //Assert.assertEquals(1,2);

    }
}