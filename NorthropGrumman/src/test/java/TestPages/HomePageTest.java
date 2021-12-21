package TestPages;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    HomePage homePage;

    public HomePageTest(){
        homePage = new HomePage();
    }

    @Test
    public void searchTest(){
        homePage.searchText2();
    }
}
