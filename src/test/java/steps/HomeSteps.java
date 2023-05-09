package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePage;

public class HomeSteps {

    private HomePage homePage;

    public HomeSteps(HomePage homePage) {
        this.homePage = homePage;
    }


    @Then("The homepage is opened")
    public void theHomepageIsOpened() {
        Assert.assertTrue(homePage.haveIcon(), "This is not the home page");
    }

    @When("User click on the user icon")
    public void userClickOnTheUserIcon() {
        homePage.clickOnIcon();
    }

    @And("click on disconnection button")
    public void clickOnDisconnectionButton() {
        homePage.logout();
    }

    @And("Click on accept cookies button")
    public void clickOnAcceptCookiesButton() {
        homePage.acceptCookies();
    }
    @Then("The user is disconnected successfully")
    public void theUserIsDisconnectedSuccessfully() {
    }

    @When("User click on the cart button")
    public void userClickOnTheCartButton() {
        homePage.goToCart();
    }

    @And("Click on the empty cart button")
    public void clickOnTheEmptyCartButton() {
        homePage.emptyTheCart();
    }

    @And("Click on the empty button to confirm")
    public void clickOnTheEmptyButtonToConfirm() {
        homePage.emptyConfirm();
    }
    @Then("All the items are deleted successfully")
    public void allTheItemsAreDeletedSuccessfully() {
        Assert.assertTrue(homePage.haveText(), "The cart is not empty");
    }

    @Then("The account is successfully created")
    public void theAccountIsSuccessfullyCreated() {
        Assert.assertTrue(homePage.confirmText(),"The account is not create");
    }


//    @When("User click on a product")
//    public void userClickOnAProduct() {
//        homePage.clickOnProduct();
//    }

//    @When("Click on the button to add in the cart")
//    public void clickOnTheButtonToAddInTheCart() {
//        homePage.addToCart();
//    }
//
//    @Then("The product is added in the cart")
//    public void theProductIsAddInTheCart() {
//        Assert.assertTrue(homePage.haveElementInCart(),"There is no item in the cart");
//    }
}
