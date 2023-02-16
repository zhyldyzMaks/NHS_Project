package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "inputEmail")
    WebElement username;

    @FindBy(id = "inputPassword")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInButton;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logOutButton;

    @FindBy()
    WebElement errorMessage;

    public void login(String username, String password ){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }
    public void pressSignInButton(){
        signInButton.click();
    }
    public void pressLogOutButton(){
        logOutButton.click();
    }


}
