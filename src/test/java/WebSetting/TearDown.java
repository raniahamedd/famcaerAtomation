package WebSetting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TearDown {
    @AfterTest
    public void tearDown(){
        SetUp.driver.quit();
    }
}
