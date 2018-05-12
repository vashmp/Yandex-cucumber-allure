package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;
import util.Stash;

import java.util.List;
/**
 * @author Nikita Blokhin
 */
public class MoviePage extends BasePageObject{

    @FindBy(xpath = "//h1")
    public WebElement title;

    @FindBy(xpath = "//span[@class='button2__text' and contains(text(), 'Когда')]/ancestor::button")
    public WebElement whenBtn;

    @FindBy(xpath = "//span[@class='presets-list__title' and contains(text(), 'Завтра')]")
    public WebElement tommorowBtn;

    @FindBy(xpath = "//div[@class='event-rating__value'][text() >= 8]/ancestor::div[contains(@class, 'event__image')]/following-sibling::div//h2")
    List<WebElement> movieBlockNames;

    @FindBy(xpath = "//div[@class='event-rating__value'][text() >= 8]/ancestor::div[contains(@class, 'event__image')]/following-sibling::div//span[@class='event__place-name']")
    List<WebElement> movieBlockPlaces;

    @FindBy(xpath = "//div[@class='event-rating__value'][text() >= 8]/ancestor::a")
    List<WebElement> movieBtn;
    public MoviePage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectDate(){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 3);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        whenBtn.click();
        wait.until(ExpectedConditions.visibilityOf(tommorowBtn));
        tommorowBtn.click();
        closeAd2();
    }
    public void getNameAndPlaces() {
        String currentMovieName = movieBlockNames.get(0).getText();
        String currentMoviePlaces = movieBlockPlaces.get(0).getText();
        Stash.put(Stash.movieName, currentMovieName);
        Stash.put(Stash.moviePlaces, currentMoviePlaces);
    }
    public void clickOnMovie() {
        movieBtn.get(0).click();
    }
    }
