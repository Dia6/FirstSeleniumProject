import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    public void addToWishlist() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.get("http://testfasttrackit.info/selenium-test/sale.html");
        driver.get("http://testfasttrackit.info/selenium-test/slim-fit-dobby-oxford-shirt-572.html");
        driver.get("http://testfasttrackit.info/selenium-test/wishlist/index/add/product/403/form_key/810cxA4IRKnFL0Q3/");
        driver.quit();


    }
}
