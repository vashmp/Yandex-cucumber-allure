package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;
/**
 * @author Nikita Blokhin
 */
public class BasePageObject{
    @FindBy(xpath = "//div[@class='subscribe-form__content']")
    WebElement adWindow;

    @FindBy(xpath = "//div[@class='modal__content']")
    WebElement adWindow2;

    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectCollectionItem(String itemName, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элмент коллеции - " + itemName);
    }
    public void closeAd() {
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 3);
        wait.until(ExpectedConditions.visibilityOf(adWindow));
        WebElement closeAd = BaseSteps.getDriver().findElement(By.xpath("//span[@class='button2__text' and contains(text(), 'Закрыть')]/ancestor::button"));
        closeAd.click();
        }


    public void closeAd2() {
//        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 3);
//        wait.until(ExpectedConditions.visibilityOf(adWindow2));
        WebElement closeAd2 = BaseSteps.getDriver().findElement(By.xpath("//div[@class='tutorial-modal__close']"));
        closeAd2.click();
    }

}
