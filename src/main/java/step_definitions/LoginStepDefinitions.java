package step_definitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.security.Key;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();


    @Given("user is on the Login page")
    public void user_is_on_the_Login_page() throws InterruptedException {

        System.out.println("user is login");
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        Thread.sleep(1000);

    }

    @Then("user logs in")
    public void user_logs_in() throws InterruptedException {

        System.out.println("user is login oluyor");
        String userName=ConfigurationReader.getProperty("user_name");
        String password=ConfigurationReader.getProperty("password");
        loginPage.login(userName,password);
        Thread.sleep(2000);

    }



}
