package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    public WebDriver driver;

    By sign = By.cssSelector("a.login");

    //Inner webelement of login page
    By title =By.xpath("//h1[text()='My account']");

    //initialise the constructor of the chrome
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement titleofpage(){
        return driver.findElement(title);
    }


    public WebElement getlogin() {
        return driver.findElement(sign);
    }

}
