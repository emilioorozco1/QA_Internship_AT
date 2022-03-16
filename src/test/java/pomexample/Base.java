package pomexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;


public class Base {

    private WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/selenium_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void visit(String url) {
        driver.get(url);
    }

    public void scrollPage() {
        ((JavascriptExecutor)driver).executeScript("scroll(50,200)");

    }



    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
