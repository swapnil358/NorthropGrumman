package pages;

import Drivers.DriverManager;
import WaitStretegy.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private static final By searchButton = By.name("q");
    private static final By feelingLucky = By.xpath(" /html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]");


    @FindBy(xpath = "//*[@id='tsf']/div[1]/div[1]/div[1]/div[1]/div/input")
    private WebElement SearchBox;

    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public HomePage searchText(String searchText){
        sendKey(searchButton, searchText, "search field");
        return this;
    }

    public void searchText2(){
       click(feelingLucky, "feelingLucky", WaitStrategy.CLICKABLE);

    }




}
