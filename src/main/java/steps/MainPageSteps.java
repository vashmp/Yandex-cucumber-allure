package steps;




import io.qameta.allure.Step;
import pages.MainPage;

/**
 * @author Nikita Blokhin
 */
public class MainPageSteps {



    @Step("выбран пункт меню {menuItem}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }


}