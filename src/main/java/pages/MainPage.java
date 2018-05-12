package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.BaseSteps;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
/**
 * @author Nikita Blokhin
 */
public class MainPage  extends BasePageObject{
    @FindBy(xpath = "//div[contains(@class, 'home-tabs')]/a")
    List<WebElement> menuItems;


    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName){
        selectCollectionItem(itemName, menuItems);
    }
}
