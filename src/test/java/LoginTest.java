import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void loginWithValidCredentials() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("#header-account div .last")).click();
        driver.findElement(By.id("email")).sendKeys("ginny@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("12violet");
        driver.findElement(By.id("send2")).click();
        WebElement welcomeText = driver.findElement(By.cssSelector(".hello strong"));
        Assert.assertEquals("Hello, Ginny Rose!", welcomeText.getText());
        driver.quit();





    }


}
