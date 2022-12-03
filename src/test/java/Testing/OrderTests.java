package Testing;

import Pages.OrderPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrderTests {

    private WebDriver driver;

    @Test
    public void orderPositiveTestUpperButton() {
        // драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);


        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickOrderUpperButton();
        orderPage.closePopupCookie();
        orderPage.inputUserInfo("Иван", "Иванов", "улица Пушкина, д.1", "Комсомольская", "79991112233");
        orderPage.inputDeliveryInfoAndOrderDone("Позвонить перед доставкой");

    }

    @After
    public void tearDownFirstTest() {
        driver.quit(); // закрываем браузер
    }

    @Test
    public void orderPositiveTestMiddleButton() {
        // драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);


        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        OrderPage orderPage = new OrderPage(driver);
        orderPage.scrollAndClickOrderMiddleButton();
        orderPage.closePopupCookie();
        orderPage.inputUserInfo("Михал", "Терентьев", "улица Ленина, д.1", "Лубянка", "79991234567");
        orderPage.inputDeliveryInfoAndOrderDone("Вход со двора");
    }

    @After
    public void tearDownSecondTest() {
        driver.quit(); // закрываем браузер
    }
}
