package TestPages;

import Drivers.Driver;
import Drivers.DriverManager;
import org.apache.hc.core5.http.impl.io.IdentityOutputStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Driver.initDriver("chrome");
    }


    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }


}
