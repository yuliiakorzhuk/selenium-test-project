package components;

import abstractions.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableComponent extends BaseComponent {
    private String cellXpathByRowColumn = "//table//tr[%s]//td[%s]";

    public TableComponent(WebDriver driver) {
        super(driver);
    }

    public String getCellValue(int row, int column) {
        WebElement cell = getCellXpathByRowColumn(row, column);
        return cell.getText();
    }

    // we expect (0, 0) to provide us first column and first row value, so we add 1 here
    private WebElement getCellXpathByRowColumn(int row, int column){
        String cellXpath = String.format(this.cellXpathByRowColumn, row+1, column+1);
        return driver.findElement(By.xpath(cellXpath));
    }
}
