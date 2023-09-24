package GooglePlay;

import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GooglePlayElements {
    public static WebElement getInstallButton(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/section[1]/div/div[2]/header/h1"));
    }
    public static Boolean InstallButtonIsDisplayed(){
        return getInstallButton().isDisplayed();
    }

}
