package EndToEnd_AutomationFrameWork_SwagLabs;

import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest
{
	@Test
    public void testFullPurchaseFlow() throws InterruptedException 
	{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addItemToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillCheckoutForm();

        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();
    }
}
