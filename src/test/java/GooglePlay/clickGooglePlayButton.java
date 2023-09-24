package GooglePlay;

import HomePage.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickGooglePlayButton {
    @Test(priority = 1)
    public void ClickConntectWithUsButton() {
        Assert.assertTrue(HomePageElements.BookSessionButtonIsDisplayed());
        HomePageElements.clickBookSessionButton();
    }
}

