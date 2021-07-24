package Hooks;

import Manager.CapabilitiesManager;
import Manager.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

public class hooks {

    private AndroidDriver driver;
    private DesiredCapabilities capabilities;
    private CapabilitiesManager capabilitiesManager = new CapabilitiesManager();
    private DriverManager driverManager = new DriverManager();

    @Before
    public void initTest() throws Exception {
        capabilities = capabilitiesManager.setCapabilities("android");
        driver = driverManager.createDriver("", capabilities);
    }

    @After
    public void finishTest(){
        driverManager.closeDriver();
    }

}
