package steps;

import io.qameta.allure.Step;
import pages.FinalPage;

import static org.junit.Assert.assertTrue;

/**
 * @author Nikita Blokhin
 */
public class FinalPageSteps {

    @Step("Проверка названия фильмов и кол-ва кинотеатров")
    public void checkNameAndPlaces(){
        new FinalPage().checkNameAndPlaces();
    }
}
