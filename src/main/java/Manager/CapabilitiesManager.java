package Manager;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesManager {

    private DesiredCapabilities capabilities;

    public CapabilitiesManager(){
        capabilities = new DesiredCapabilities();
    }

    public DesiredCapabilities setCapabilities(String device) {

        if (device.equalsIgnoreCase("android")){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "mobile1");
//            capabilities.setCapability("appPackage", "");
//            capabilities.setCapability("appActivity", "");
        }

        return capabilities;
    }
}
