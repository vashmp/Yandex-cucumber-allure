package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;
import util.Stash;
/**
 * @author Nikita Blokhin
 */
public class FinalPage extends BasePageObject{

    @FindBy(xpath = "//h1[@class='event-heading__title']")
    public WebElement title;

    @FindBy(xpath = "//span[@class='event-heading__place']")
    public WebElement subTitle;

    public FinalPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public void checkNameAndPlaces(){
        String expectedName = (String) Stash.get(Stash.movieName);
        String factName = title.getText();
        String expectedPlaces = (String) Stash.get(Stash.moviePlaces);
        String factPlaces = subTitle.getText();
        Assert.assertEquals("Название в заголовке не соответствует запомненому", expectedName, factName);
        Assert.assertEquals("Кол-во кинотеатров не соотвутствует", expectedPlaces, factPlaces);

    }
}
