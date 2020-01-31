package step_definitions;

import io.cucumber.java.After;
import utilities.Driver;

public class Hooks {


    //cleanup part
    //will be executed runs after every test scenario
    //to close browser
    @After
    public void tearDown(){
        System.out.println("closing driver");
        Driver.closeDriver();
    }
}
