package Manager;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static AndroidDriver driver;
    private static final CapabilitiesManager capabilitiesManager = new CapabilitiesManager();

    public AndroidDriver createDriver() {
        try {
            if (driver == null) {
                DesiredCapabilities capabilities = capabilitiesManager.setCapabilities("android");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            }
        } catch (MalformedURLException mue) {
            System.out.println(mue.getMessage());
        }
        return driver;
    }

    public AndroidDriver closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        return driver;
    }
}
