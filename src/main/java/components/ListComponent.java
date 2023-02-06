package components;

import abstractions.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ListComponent extends BaseComponent {
    @FindBy(css = "div#test-2-div li")
    private List<WebElement> listItems;

    public ListComponent(WebDriver driver) {
        super(driver);
    }

    public int getListItemsCount() {
        return listItems.size();
    }

    // elements in list starts for 0 index but from test we want to access like on the UI starting from 1
    public String getListItem(int i) {
        return listItems.get(i-1).getText();
    }
}
