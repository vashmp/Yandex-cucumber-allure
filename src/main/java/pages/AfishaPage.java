package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;
/**
 * @author Nikita Blokhin
 */
public class AfishaPage extends BasePageObject{

    @FindBy(xpath = "//ul[contains(@class, 'tabs-menu')]/li/a")
    List<WebElement> menuItems;

    public AfishaPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName)
    {
        selectCollectionItem(itemName, menuItems);
        closeAd();
    }
}
