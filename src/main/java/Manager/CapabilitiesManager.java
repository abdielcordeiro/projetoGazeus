package Manager;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;

public class CapabilitiesManager {

    private DesiredCapabilities capabilities;

    public CapabilitiesManager() {
        capabilities = new DesiredCapabilities();
    }

    public DesiredCapabilities setCapabilities(String device) {
        if (device.equalsIgnoreCase("android")) {
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("language", FileReaderManager.getInstance().getConfigReader().getLanguageConfigPath());
            capabilities.setCapability("locale", FileReaderManager.getInstance().getConfigReader().getLocaleConfigPath());
            capabilities.setCapability("noReset", true);
            capabilities.setCapability("deviceName", "mobile1");
            capabilities.setCapability("appPackage", "com.jogatina.tranca");
            capabilities.setCapability("appActivity", "com.jogatina.menu.Splash");
        }

        return capabilities;
    }
}
