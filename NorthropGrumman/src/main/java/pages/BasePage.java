package pages;

import Drivers.DriverManager;
import WaitStretegy.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {


    public static void click(WebElement element, String elementName, WaitStrategy waitStrategy) {
        try {
            element.click();
            System.out.println(elementName + " clicked");
        } catch (Exception e) {
            click(element, elementName, waitStrategy);

        }
    }

    public static void click(By by, String elementName, WaitStrategy waitStrategy){
        click(DriverManager.getDriver().findElement(by), elementName, waitStrategy);
    }

    public static void click(String locatorStrategy, String value, String elementName, WaitStrategy waitStrategy){
        if(locatorStrategy.equalsIgnoreCase("xpath")){
            click(By.xpath(value), elementName, waitStrategy);
        }if(locatorStrategy.equalsIgnoreCase("name")){
            click(By.name(value), elementName, waitStrategy);
        }if(locatorStrategy.equalsIgnoreCase("tagName")){
            click(By.tagName(value), elementName, waitStrategy);
        }if(locatorStrategy.equalsIgnoreCase("className")){
            click(By.className(value), elementName, waitStrategy);
        }else{
            System.out.println("Selected locator strategy is wrong");
        }
    }

    public static void sendKey(WebElement element,String value, String elementName){
        element.clear();
        element.sendKeys(value);
        System.out.println(value+"*** entered in ***"+ elementName);

    }

    public static void sendKey(By by, String value, String elementName){
        DriverManager.getDriver().findElement(by).clear();
        DriverManager.getDriver().findElement(by).sendKeys(value);
        System.out.println(value+"*** entered in ***"+ elementName);
    }





}
