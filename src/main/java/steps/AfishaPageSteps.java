package steps;

import io.qameta.allure.Step;
import pages.AfishaPage;

/**
 * @author Nikita Blokhin
 */
public class AfishaPageSteps {

    @Step("выбран пункт меню {menuItem}")
    public void selectMenuItem(String menuItem){
        new AfishaPage().selectMenuItem(menuItem);
    }
}
