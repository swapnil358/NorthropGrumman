package Drivers;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class DriverManager {

    private DriverManager() {

    }

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(WebDriver driverRef) {
        if (Objects.nonNull(driverRef)) {
            driver.set(driverRef);
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void unload() {
        driver.remove();
    }
}
