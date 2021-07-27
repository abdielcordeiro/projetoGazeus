package Manager;

import java.net.MalformedURLException;

public class TestContext {

	private DriverManager driverManager;
	private PageFactoryManager pageFactoryManager;

	public TestContext() throws MalformedURLException {
		driverManager = new DriverManager();
		pageFactoryManager = new PageFactoryManager(driverManager.createDriver());
	}

	public DriverManager getDriverManager() {
		return driverManager;
	}
	public PageFactoryManager getPageManager() {return pageFactoryManager;}
}