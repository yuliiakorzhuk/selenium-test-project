package abstractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseComponent {
    protected WebDriver driver;

    protected BaseComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
