package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import selenium.ClsBrowser;

public class TestCase_Exec extends ClsBrowser{
    public String URL;

    @Before
    public void setup()
    {
        URL = "https://demoqa.com/";
        ClsBrowser.BrowserName = "Chrome";
        OpenBrowser();
    }

    @Test
    public void FillElementsInput()
    {
        //Go to URL QA DEMO
        NavigateToUrl(URL);

        //Go to Elements Menu
        WaitForElement("//h5[text()='Elements']");
        WaitForElementClickable("//h5[text()='Elements']");
        Click("//h5[text()='Elements']");

        //Wait for Elements Page
        WaitForElement("//div[@class='main-header' and text()='Elements']");

        //Click TextBoxes
        WaitForElement("//li[span[text()='Text Box']]");
        Click("//li[span[text()='Text Box']]");

        //SendKeys to Full name input
        WaitForElement("//input[@id='userName']");
        SendKeys("//input[@id='userName']", "Test UserName");

        //SendKeys to email input
        WaitForElement("//input[@id='userEmail']");
        SendKeys("//input[@id='userEmail']", "intern26@at.com");

        //SendKeys to current address input
        WaitForElement("//textarea[@id='currentAddress']");
        SendKeys("//textarea[@id='currentAddress']", "Colima, Mexico 1");

        //SendKeys to permanent address input
        WaitForElement("//textarea[@id='permanentAddress']");
        SendKeys("//textarea[@id='permanentAddress']", "Villa de Alvarez, Colima, Mexico 2");

        //Click on Submit button
        WaitForElement("//button[@id='submit']");
        Click("//button[@id='submit']");

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        CloseBrowser();
    }

}
