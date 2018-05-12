package steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by m.baykova on 13.09.2017.
 */

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    AfishaPageSteps afishaPageSteps = new AfishaPageSteps();
    MoviePageSteps moviePageSteps = new MoviePageSteps();
    FinalPageSteps finalPageSteps = new FinalPageSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItemMore(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }
    @When("^выбран пункт меню афиши \"(.+)\"$")
    public void selectMenuItemAfisha(String menuName){
        afishaPageSteps.selectMenuItem(menuName);
    }

    @Then("^заголовок страницы Афиши равен \"(.+)\"$")
    public void checkTitleAfishaPage(String title){
        moviePageSteps.checkPageTitle(title);
    }
    @When("^выбрана дата сеанса$")
    public void selectDateAfishaPage(){
        moviePageSteps.selectDate();
    }
    @Then("^запомнена информация о фильме$")
    public void getNameAndPlaces(){ moviePageSteps.getNameAndPlaces(); }

    @When("^выполнен переход на страницу фильма$")
    public void clickOnMovie(){ moviePageSteps.clickOnMovie(); }

    @Then("^Проверка названия фильмов и кол-ва кинотеатров$")
    public void checkNamesAndPlaces(){ finalPageSteps.checkNameAndPlaces(); }
}