package WebSetting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class SetUp {
    public static Wait<WebDriver> wait;
    public static WebDriver driver;
    JavascriptExecutor jse;

    @Test(priority = 1)
    public void setUp() throws  IOException {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/");
        driver.manage().window().maximize();
        Assert.assertTrue(true);
}
}
