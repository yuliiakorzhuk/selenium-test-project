package components;

import abstractions.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ButtonsComponent extends BaseComponent {
    @FindBy(css = "div#test-4-div button")
    private List<WebElement> buttons;

    public ButtonsComponent(WebDriver driver) {
        super(driver);
    }

    // elements in list starts for 0 index but from test we want to access like on the UI starting from 1
    public boolean isButtonEnabled(int i) {
        return buttons.get(i-1).isEnabled();
    }
}
