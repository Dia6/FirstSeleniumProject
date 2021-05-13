import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    @Test
    public void addToWishlistWithoutAccount() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".nav-5")).click();
        driver.findElement(By.cssSelector(".product-info .actions .button")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
        WebElement message = driver.findElement(By.cssSelector(".page-title"));
        Assert.assertEquals("LOGIN OR CREATE AN ACCOUNT",message.getText());
        driver.quit();
    }
    @Test
    public void addToWishlistWithRegisteredAccount() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("#header-account div .last")).click();
        driver.findElement(By.id("email")).sendKeys("ginny@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("12violet");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".nav-5")).click();
        driver.findElement(By.cssSelector(".product-info .actions .button")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
        WebElement message = driver.findElement(By.cssSelector(".page-title"));
        Assert.assertEquals("MY WISHLIST",message.getText());
        driver.quit();

    }

}
