package resources;

import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;

public class HomePage extends Base {

    @BeforeTest
    public void initialise() throws IOException {
        driver = initialiseDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "data")
    public void basePageNavigation(String email, String pass) throws IOException {

        // Creating first ref of Landing Page
        LandingPage lp = new LandingPage(driver);
        lp.getlogin().click();

        //Second page ref
        LoginPage login = new LoginPage(driver);
        login.emailaddress().sendKeys(email);
        login.password1().sendKeys(pass);
        login.signin().click();
    }

    /*
    @Author : Swanand
    Git push and pull practice
    Git pull
    Feature 1
     */
    @DataProvider
    public Object[][] data() {
        Object[][] obj = new Object[1][2];
        obj[0][0] = "vimalsgurav@gmail.com";
        obj[0][1] = "swan123";
        return obj;
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }
}
