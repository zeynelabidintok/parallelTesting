package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {

    public BasePage(){
        //makes @FİndBy work
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
