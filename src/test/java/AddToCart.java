import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    @Test
    public void AddToCartWithoutAccount() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".nav-6")).click();
        driver.findElement(By.cssSelector("li:nth-child(2) .button")).click();
        driver.findElement(By.cssSelector("#swatch27 .swatch-label")).click();
        driver.findElement(By.cssSelector("#option68.option-27")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons")).click();
        WebElement message = driver.findElement(By.cssSelector("div.page-title h1"));
        Assert.assertEquals("SHOPPING CART", message.getText());
        WebElement message2 = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertEquals("DUMBO Boyfriend Jean was added to your shopping cart.", message2.getText());
        driver.quit();
    }

    @Test

    public void ChangeQuantityInCart() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".nav-6")).click();
        driver.findElement(By.cssSelector("li:nth-child(2) .button")).click();
        driver.findElement(By.cssSelector("#swatch27 .swatch-label")).click();
        driver.findElement(By.cssSelector("#option68.option-27")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons")).click();
        WebElement message = driver.findElement(By.cssSelector("div.page-title h1"));
        Assert.assertEquals("SHOPPING CART", message.getText());
        WebElement message2 = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertEquals("DUMBO Boyfriend Jean was added to your shopping cart.", message2.getText());
        driver.findElement(By.cssSelector(".product-cart-actions input")).clear();
        driver.findElement(By.cssSelector(".product-cart-actions input")).sendKeys("3");
        driver.findElement(By.cssSelector(".btn-update[title='Update']")).click();
        driver.quit();
    }
    @Test
    public void AddMultipleItemsToCart(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".nav-6")).click();
        driver.findElement(By.cssSelector("li:nth-child(2) .button")).click();
        driver.findElement(By.cssSelector("#swatch27 .swatch-label")).click();
        driver.findElement(By.cssSelector("#option68.option-27")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons")).click();
        WebElement message = driver.findElement(By.cssSelector("div.page-title h1"));
        Assert.assertEquals("SHOPPING CART",message.getText());
        WebElement message2 = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertEquals("DUMBO Boyfriend Jean was added to your shopping cart.",message2.getText());
        driver.navigate().back();        driver.navigate().back();
        driver.findElement(By.cssSelector("li:nth-child(4) .button")).click();
        driver.findElement(By.cssSelector(".checkbox")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons")).click();
        WebElement message3 = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertEquals("A Tale of Two Cities was added to your shopping cart.",message3.getText());
        driver.quit();
  }
}
