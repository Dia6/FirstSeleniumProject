import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    @Test
    public void AddToCartWithoutAccount(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".nav-6")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#swatch27 .swatch-label")).click();
        driver.findElement(By.cssSelector("#option68.option-27")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons")).click();
        WebElement message = driver.findElement(By.cssSelector("div.page-title h1"));
        Assert.assertEquals("SHOPPING CART",message.getText());
        WebElement message2 = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertEquals("DUMBO Boyfriend Jean was added to your shopping cart.",message2.getText());
        driver.quit();

    }
}
