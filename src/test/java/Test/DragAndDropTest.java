package Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DragAndDropPage;

public class DragAndDropTest extends TestBase {
    DragAndDropPage dragAndDropPage;

    @Test
    public void DragAndDropTest(){
        dragAndDropPage =new DragAndDropPage(driver);
        Actions builder = new Actions(driver);
        builder.dragAndDrop(dragAndDropPage.source,dragAndDropPage.target).perform();
        Assert.assertEquals("Dropped!",dragAndDropPage.target.getText());
    }
}
