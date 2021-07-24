package Manager;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class DriverManager {

    private AndroidDriver driver;

    public AndroidDriver createDriver(String url, DesiredCapabilities capabilities) throws Exception {
        return (driver == null) ? new AndroidDriver(new URL(url), capabilities) : driver;
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    public AndroidDriver closeDriver() {
        if (driver != null)
            driver.quit();
        return driver;
    }
}
