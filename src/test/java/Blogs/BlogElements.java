package Blogs;

import HomePage.HomePageElements;
import SpecialistProfile.SpecialistProfileElements;
import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogElements {

public static WebElement getBlogsSection() {
    return SetUp.driver.findElement(By.xpath("/html/body/section[3]"));
}
public static Boolean BlogsSectionIsDisplayed(){
    return getBlogsSection().isDisplayed();
}
public static WebElement getDetailsButton() {
    return SetUp.driver.findElement(By.xpath("/html/body/section[3]/div/div/article[1]/div[2]/div[2]/div/a"));
}

public static Boolean DetailsButtonIsDisplayed(){
    return getDetailsButton().isDisplayed();
}

public static void clickHelpButton(){

    getDetailsButton().click();
}

public static WebElement getArticleDetailsSection() {
    return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div/h1"));
}
public static Boolean ArticleDetailsIsDisplayed(){
    return getArticleDetailsSection().isDisplayed();
}
}
