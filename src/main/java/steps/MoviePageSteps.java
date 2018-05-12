package steps;
import io.qameta.allure.Step;
import pages.MoviePage;

import static org.junit.Assert.assertTrue;
/**
 * @author Nikita Blokhin
 */
public class MoviePageSteps {

    @Step("заголовок страницы Афиши равен {expectedTitle}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new MoviePage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выбрана дата сеанса")
    public void selectDate(){
        new MoviePage().selectDate();
    }

    @Step("запомнена информация о фильме")
    public void getNameAndPlaces(){
        new MoviePage().getNameAndPlaces();
    }

    @Step("выполнен переход на страницу фильма")
    public void clickOnMovie(){
        new MoviePage().clickOnMovie();
    }
}
