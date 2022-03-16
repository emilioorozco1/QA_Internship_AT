package pomexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogInPage extends Base{


    //login
    By userLocator = By.id("userName");
    By passLocator = By.id("password");
    By signInBtnLocator = By.id("login");
    By homePageLocator = By.id("userName-value");

    //addbook
    By gotoStoreInBtnLocator = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[2]");
    By bookNumberOne = By.id("see-book-Git Pocket Guide");
    By addButton = By.xpath("//button[contains(text(),'Add To Your Collection')]");
    By profilePage = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[3]");

    public LogInPage(WebDriver driver) {
        super(driver);
    }
    //login
    public void logIn() {
        if (isDisplayed(userLocator)) {

            type("eorozco", userLocator);
            type("emilio!123", passLocator);
            click(signInBtnLocator);

        } else {
            System.out.println("username textbox was not present");
        }
    }

    public void goToBookStore(){
        if(isDisplayed(gotoStoreInBtnLocator)) {
            click(gotoStoreInBtnLocator);
        }else{
            System.out.println("Book Store not available");
        }
    }

    public void addBook(){
        if (isDisplayed(bookNumberOne)){
            click(bookNumberOne);
            if (isDisplayed(addButton)){
                click(addButton);
            }
        }else{
            System.out.println("Not possible to add book");
        }
    }

    public void goToProfile(){
        if(isDisplayed(profilePage)){
            click(profilePage);
        }else{
            System.out.println("No access to profile");
        }
    }

    public void scrollDown()  {
        //scrollPage(); // scroll down
        scrollPage();

    }

}