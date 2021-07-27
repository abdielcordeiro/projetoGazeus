package StepDefinitions;

import Manager.TestContext;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;

public class Hooks {

    private AndroidDriver driver;
    private TestContext testContext;

    public Hooks(TestContext context)  {
        this.testContext = context;
    }

    @Before
    public void initTest() throws MalformedURLException{
        System.out.println("Hooks");
        driver = testContext.getDriverManager().createDriver();
    }

    @After
    public void finishTest() {
        System.out.println("Fechar o Driver");
        testContext.getDriverManager().closeDriver();
    }
}
