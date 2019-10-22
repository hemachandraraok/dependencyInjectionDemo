package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
    public RemoteWebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void setDriver(RemoteWebDriver driver) {
        this.driver = driver;
    }

    private RemoteWebDriver driver;
}
