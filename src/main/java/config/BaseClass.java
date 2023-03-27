package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    static public WebDriver driver;
    @BeforeClass
    public static void start01() {
        BaseClass.driver= DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);
    }
    @AfterClass
    public static void End() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
