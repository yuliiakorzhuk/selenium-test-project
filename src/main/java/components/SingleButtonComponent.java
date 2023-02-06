package components;

import abstractions.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingleButtonComponent extends BaseComponent {
    @FindBy(id = "test5-button")
    private WebElement button;

    @FindBy(id = "test5-alert")
    private WebElement successMessage;

    public SingleButtonComponent(WebDriver driver) {
        super(driver);
    }

    public boolean isButtonEnabled() {
        return button.isEnabled();
    }

    // max wait time set to 3 minutes
    public void waitAndClickButton() {
        new WebDriverWait(driver, Duration.ofSeconds(180)).until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}
