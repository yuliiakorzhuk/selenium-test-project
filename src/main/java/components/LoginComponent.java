package components;

import abstractions.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginComponent extends BaseComponent {

    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(css = "div#test-1-div button")
    private WebElement signInBtn;

    public LoginComponent(WebDriver driver) {
        super(driver);
    }

    public boolean isEmailInputVisible() {
        return emailInput.isDisplayed();
    }

    public boolean isPasswordInputVisible() {
        return passwordInput.isDisplayed();
    }

    public boolean isSignInButtonVisible() {
        return signInBtn.isDisplayed();
    }

    public void fillEmail(String emailValue) {
        emailInput.sendKeys(emailValue);
    }

    public void fillPassword(String passwordValue) {
        passwordInput.sendKeys(passwordValue);
    }
}
