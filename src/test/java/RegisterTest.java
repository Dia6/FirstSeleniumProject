import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public void registerAccount(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.get("http://testfasttrackit.info/selenium-test/customer/account/create/");
        driver.findElement(By.id("firstname")).sendKeys("Ginny");
        driver.findElement(By.id("lastname")).sendKeys("Rose");
        driver.findElement(By.id("email_address")).sendKeys("ginny@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("12violet");
        driver.findElement(By.id("confirmation")).sendKeys("12violet");

        driver.quit();


    }
}
