package Testing;

import Pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class HomePageTests {

    private WebDriver driver;

    @Test
    public void allAboutTheImportantTest() {
        // драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitForLoadImportant(); // выполняем метод ожидания загрузки
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы

        // кликаем по первой кнопке и сравниваем текст
        objHomePage.clickHowMuchIsIt();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", driver.findElement(By.id("accordion__panel-0")).getText());

        // кликаем по второй кнопке и сравниваем текст
        objHomePage.clickIWantSeveralScooters();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", driver.findElement(By.id("accordion__panel-1")).getText());

        // кликаем по третьей кнопке и сравниваем текст
        objHomePage.clickHowIsTheRentalTimeCalculated();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", driver.findElement(By.id("accordion__panel-2")).getText());

        // кликаем по четвертой кнопке и сравниваем текст
        objHomePage.clickIsItPossibleToOrderAScooterRightForToday();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", driver.findElement(By.id("accordion__panel-3")).getText());

        // кликаем по пятой кнопке и сравниваем текст
        objHomePage.clickCanIExtendTheOrderOrReturnTheScooterEarlier();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", driver.findElement(By.id("accordion__panel-4")).getText());

        // кликаем по шестой кнопке и сравниваем текст
        objHomePage.clickDoYouBringChargersWithTheScooter();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", driver.findElement(By.id("accordion__panel-5")).getText());

        // кликаем по седьмой кнопке и сравниваем текст
        objHomePage.clickCanICancelAnOrder();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", driver.findElement(By.id("accordion__panel-6")).getText());

        // кликаем по восьмой кнопке и сравниваем текст
        objHomePage.clickILiveOutsideTheMoscowRingRoadWillYouBringIt();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", driver.findElement(By.id("accordion__panel-7")).getText());

    }

    @After
    public void tearDown() {
        driver.quit(); // закрываем браузер
    }

}
