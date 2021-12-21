package Factories;

import Constants.Constants;
import Drivers.DriverManager;
import WaitStretegy.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitFactory {
   static WebElement element2 = null;

    public static WebElement performExplicitlyWait(By element, WaitStrategy waitStrategy) {
        if (waitStrategy == WaitStrategy.CLICKABLE) {
            element2 = new WebDriverWait(DriverManager.getDriver(), Constants.getEXPLICITLYWAIT()).ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.elementToBeClickable(element));
        } else if (waitStrategy == WaitStrategy.PRESENCE) {
            element2 = new WebDriverWait(DriverManager.getDriver(), Constants.getEXPLICITLYWAIT()).ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.presenceOfElementLocated(element));
        } else if (waitStrategy == WaitStrategy.VISIBLE) {
            element2 = new WebDriverWait(DriverManager.getDriver(), Constants.getEXPLICITLYWAIT()).ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.visibilityOfElementLocated(element));
        } else if (waitStrategy == WaitStrategy.NONE) {
            element2 = DriverManager.getDriver().findElement(element);
        }
        return element2;
    }


}
