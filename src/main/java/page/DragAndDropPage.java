package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends PageBase {
    public DragAndDropPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(id = "draggable")
    public WebElement source;
    @FindBy(id = "droppable")
    public WebElement target;
}
