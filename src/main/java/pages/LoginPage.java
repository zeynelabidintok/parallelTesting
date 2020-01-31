package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
@FindBy(id="ctl00_MainContent_username")
public WebElement userNameInputBoxElement;

@FindBy(id="ctl00_MainContent_password")
public WebElement userPasswordElement;


public void login(String userName,String password){
    userNameInputBoxElement.sendKeys(userName);
    userPasswordElement.sendKeys(password, Keys.ENTER);
}

}
