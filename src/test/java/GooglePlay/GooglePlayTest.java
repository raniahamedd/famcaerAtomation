package GooglePlay;

import HomePage.HomePageElements;
import SpecialistProfile.SpecialistProfileElements;
import WebSetting.SetUp;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePlayTest {

    @Test(priority = 1)
    public  void VerifyThatInstallButtonIsDisplayed()  {
        HomePageElements.scrollDownToVisibleElement(GooglePlayElements.getInstallButton());
        Assert.assertTrue(GooglePlayElements.InstallButtonIsDisplayed());
    }
}
