package pomexample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;

public class Login_test {

    private WebDriver driver;

    LogInPage logInPage;

    @Before
    public void setUp() throws Exception {
        logInPage = new LogInPage(driver);
        driver = logInPage.chromeDriverConnection();
        logInPage.visit("https://demoqa.com/login");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        logInPage.logIn();
        Thread.sleep(2000);
        logInPage.scrollDown();
        logInPage.goToBookStore();
        Thread.sleep(2000);
        logInPage.addBook();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        logInPage.scrollDown();
        Thread.sleep(2000);
        logInPage.goToProfile();
        Thread.sleep(5000);

    }
}

