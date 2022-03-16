package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClsBrowser extends ClsWebElements {

    public static String BrowserName;
    public static WebDriver objDriver;
    public static WebDriverWait wait;


    public ClsBrowser() {
        BrowserName = "Chrome";
    }

    public WebDriver OpenBrowser()
    {
        switch (BrowserName.toUpperCase()) {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "./src/test/resources/selenium_driver/chromedriver.exe");
                objDriver = new ChromeDriver();
                objDriver.manage().window().maximize();
                objDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                break;

            default:
                System.out.println("The browser is "+ BrowserName +" not supported.");
                break;
        }
        return objDriver;
    }




    public void CloseBrowser()
    {
        objDriver.close();
        objDriver.quit();
    }

    public void NavigateToUrl(String pstrUrl)
    {
        objDriver.get(pstrUrl);
    }


}
