package step_definitions;

import io.cucumber.java.After;
import utilities.Driver;

public class Hooks {

    @After
    public void tearDown(){
        System.out.println("closing driver");
        Driver.getDriver().quit();


    }
}
