package resources;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;

public class ValidateTitle extends Base {
    @Test(dataProvider = "data")
    public void titleofPage(String email, String pass) throws IOException {
        driver = initialiseDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();

        // Creating first ref of Landing Page
        LandingPage lp = new LandingPage(driver);
        lp.getlogin().click();
        LoginPage login = new LoginPage(driver);
        login.emailaddress().sendKeys(email);
        login.password1().sendKeys(pass);
        login.signin().click();
        Assert.assertEquals(lp.titleofpage().getText(), "MY ACCOUNT");
    }

    @DataProvider
    public Object[][] data() {
        Object[][] obj = new Object[1][2];
        obj[0][0] = "vimalsgurav@gmail.com";
        obj[0][1] = "swan123";
        return obj;
    }
}
