
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyFirstTest {
    @Test
    public void Test1() throws InterruptedException {
        WebDriverWait wait;
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/selenium_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Click on Elements box
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[text()='Elements']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='Elements']")));
        WebElement elementsBox= driver.findElement(By.xpath("//h5[text()='Elements']"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",elementsBox);
        ((WebElement) elementsBox).click();

        //Click on TextBox link
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Text Box')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Text Box')]")));
        WebElement textBoxLink = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        ((WebElement) textBoxLink).click();

        //Click on fullName input and send text
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='userName']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userName']")));
        WebElement fullNameInput = driver.findElement(By.xpath("//input[@id='userName']"));
        ((WebElement) fullNameInput).sendKeys("Emilio Enrique Orozco Bravo");

        //Click on email input and send text
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='userEmail']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userEmail']")));
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        ((WebElement) emailInput).sendKeys("intern26@agilethought.com");

        //Click on Current address input and send text
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='currentAddress']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='currentAddress']")));
        WebElement currentAddressInput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        ((WebElement) currentAddressInput).sendKeys("Mexico 1");

        //Click on Permanent address input and send text
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='permanentAddress']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='permanentAddress']")));
        WebElement permAddressInput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        ((WebElement) permAddressInput).sendKeys("Mexico 2");

        Thread.sleep(5000);
        driver.quit();
    }


}
