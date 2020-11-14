import org.testng.annotations.*;

public class Test1 {

    @Test(priority=1, enabled=false)
    void setup()
    {
        System.out.println("setup - Opening browser");
    }

    @Test(priority=2)
    void login()
    {
        System.out.println("This is a login test");
    }

    @Test(priority=3)
    void teardown()
    {
        System.out.println("teardown - Closing browser");
    }

    @BeforeSuite
    void beforeSuite() {
        System.out.println("beforeSuite called");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("afterSuite called");
    }

    @BeforeClass
    void beforeclass() {
        System.out.println("beforeclass called");
    }

    @AfterClass
    void afterClass() {
        System.out.println("afterclass called");
    }

    @BeforeTest
    void beforetest() {
        System.out.println("beforetest called");
    }

    @AfterTest
    void aftertest() {
        System.out.println("aftertest called");
    }

    @BeforeMethod
    void beforemethod() {
        System.out.println("beforemethod called");
    }

    @AfterMethod
    void aftermethod() {
        System.out.println("aftermethod called");
    }

}
