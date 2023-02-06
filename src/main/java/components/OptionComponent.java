package components;

import abstractions.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OptionComponent extends BaseComponent {
    @FindBy(id = "dropdownMenuButton")
    private WebElement dropdownButton;

    String optionXpath = "//a[text()=\"%s\"]";

    public OptionComponent(WebDriver driver) {
        super(driver);
    }

    public String getSelectedOption() {
        return dropdownButton.getText();
    }

    public void selectOption(String optionToSelect) {
        dropdownButton.click();
        String optionToSelectXpath = String.format(optionXpath, optionToSelect);
        driver.findElement(By.xpath(optionToSelectXpath)).click();
    }
}
