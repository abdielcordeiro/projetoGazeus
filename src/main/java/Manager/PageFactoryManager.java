package Manager;

import PageFactory.TrancaPage;
import io.appium.java_client.android.AndroidDriver;

public class PageFactoryManager {

    private AndroidDriver driver;
    private TrancaPage trancaPage;

    public PageFactoryManager(AndroidDriver driver) {
        this.driver = driver;
    }

    public TrancaPage getTrancaPage(){
        return (trancaPage == null) ? trancaPage = new TrancaPage(driver) : trancaPage;
    }

}

