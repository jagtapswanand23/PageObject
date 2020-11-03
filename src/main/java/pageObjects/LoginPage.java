package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;

    By email = By.cssSelector("input[id=email]");
    By password =By.cssSelector("input[id=passwd]");
    By sigin=By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement emailaddress(){
        return driver.findElement(email);
    }

    public WebElement password1(){
        return driver.findElement(password);
    }

    public WebElement signin(){
        return driver.findElement(sigin);
    }
}
