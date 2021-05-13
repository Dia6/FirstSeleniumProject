import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    @Test
    public void registerNewAccount() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.get("http://testfasttrackit.info/selenium-test/customer/account/create/");
        driver.findElement(By.id("firstname")).sendKeys("Ginny");
        driver.findElement(By.id("lastname")).sendKeys("Rose");
        driver.findElement(By.id("email_address")).sendKeys("ginny@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("12violet");
        driver.findElement(By.id("confirmation")).sendKeys("12violet");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        driver.quit();

    }
    @Test
    public void AlreadyRegisteredAccount() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.get("http://testfasttrackit.info/selenium-test/customer/account/create/");
        driver.findElement(By.id("firstname")).sendKeys("Ginny");
        driver.findElement(By.id("lastname")).sendKeys("Rose");
        driver.findElement(By.id("email_address")).sendKeys("ginny@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("12violet");
        driver.findElement(By.id("confirmation")).sendKeys("12violet");
        driver.findElement(By.cssSelector(".buttons-set button")).click();
        WebElement welcomeText = driver.findElement(By.cssSelector(".error-msg"));
        Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", welcomeText.getText());
        driver.quit();

    }

}
