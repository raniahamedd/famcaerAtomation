package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import WebSetting.SetUp;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageElements {
public static WebElement getNavbarContentButton(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
}
public static WebElement getLogoImg(){
    return SetUp.driver.findElement(By.xpath("/html/body/header/div/div/nav/a/img"));
}
public static WebElement getFamcareButtonFromList(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
}

/*********/
public static WebElement getBlogButtonFromList(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
}
public static Boolean BlogButtonButtonIsDisplayed() {

    return getBlogButtonFromList().isDisplayed();
}
public static void clickBlogButtonButton(){
    getBlogButtonFromList().click();
}
/**********/
public static WebElement getAcademicButtonFromList(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-1227\"]/a"));
}
public static WebElement getOrganizationsButtonFromList(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-187\"]/a"));
}
public static WebElement getAboutUsButtonFromList(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-188\"]/a"));
}
public static WebElement getFormHeader(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/h2"));
}
public static WebElement getHeaderContent(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
}
public static WebElement getSubHeaderContent(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]/p"));
}
/********************/

public static WebElement getBookSessionButton(){
    waitForElementToBeClickableBy(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
    return SetUp.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
}
public static Boolean BookSessionButtonIsDisplayed() {

    return getBookSessionButton().isDisplayed();
}
public static void clickBookSessionButton(){
    getBookSessionButton().click();
}

/****************/

public static WebElement getscrollTopButton(){
return SetUp.driver.findElement(By.xpath("//*[@id=\"topcontrol\"]"));
}
//*Specialists
public static WebElement getSpecialistsButtonFromList(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
}
public static Boolean SpecialistsButtonFromListIsDisplayed(){
    return getSpecialistsButtonFromList().isDisplayed();
}
public static void clickSpecialistsButtonFromList(){
    getSpecialistsButtonFromList().click();
}

/******************/
public static WebElement getFirstSessionButton(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
}
public static Boolean FirstSessionButtonIsDisplayed(){
    return getFirstSessionButton().isDisplayed();
}
public static void clickFirstSessionButton(){
    getFirstSessionButton().click();
}
/******************/
public static WebElement getJoinAsSpecialistButton(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
}
    public static Boolean JoinAsSpecialistButtonIsDisplayed(){
        return getJoinAsSpecialistButton().isDisplayed();
    }
    public static void clickJoinAsSpecialistButton(){
        getJoinAsSpecialistButton().click();
    }
/*******************/
/******************/
public static WebElement getIntercomButton(){
    HomePageElements.waitForElementToBeVisibleBy(By.xpath("/html/body/div[12]/div"));
    return SetUp.driver.findElement(By.xpath("/html/body/div[12]/div"));
}
    public static Boolean IntercomButtonIsDisplayed(){
    return getIntercomButton().isDisplayed();
    }
    public static void clickIntercomButton(){
        getIntercomButton().click();
    }
    /*********************/
//public static void scrollDownBy(int value) {
//    JavascriptExecutor jse = (JavascriptExecutor) SetUp.driver;
//    String scrollStatement = "window.scrollBy(0,"+ value +")";
//    jse.executeScript(scrollStatement);
//}
public static void scrollDownToVisibleElement(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) SetUp.driver;
    js.executeScript("arguments[0].scrollIntoView();", element);
}
//public static void scrollUpBy(int value) {
//    JavascriptExecutor jse = (JavascriptExecutor) SetUp.driver;
//    jse.executeScript("window.scrollBy(0,"+(-1 * value)+")");
//}
public static void waitForElementToBeClickableBy(By locator) {
    SetUp.wait.until(ExpectedConditions.elementToBeClickable(locator));
}
public static void waitForElementToBeVisibleBy(By locator) {
    SetUp.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
}
}
