package Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    public static void initDriver(String browser) {
        if (Objects.isNull(DriverManager.getDriver())) {
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().clearResolutionCache().setup();
                DriverManager.setDriver(new ChromeDriver());
                DriverManager.getDriver().get("https://www.google.com");
            }
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }


    }

}
