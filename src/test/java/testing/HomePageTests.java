package testing;

import org.junit.Before;
import pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HomePageTests {

    private WebDriver driver;

    @Before
    public void beforeTest() {
        // драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @After
    public void tearDown() {
        driver.quit(); // закрываем браузер
    }

    @Test
    public void allAboutTheImportantFirstTest()  {

        HomePage objHomePage = new HomePage(driver);
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы

        // кликаем по первой кнопке и сравниваем текст
        objHomePage.clickHowMuchIsIt();
        objHomePage.checkFirstText();
    }

    @Test
    public void allAboutTheImportantSecondTest() {

        HomePage objHomePage = new HomePage(driver);
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы

        // кликаем по второй кнопке и сравниваем текст
        objHomePage.clickIWantSeveralScooters();
        objHomePage.checkSecondText();
    }

    @Test
    public void allAboutTheImportantThirdTest() throws InterruptedException {

        HomePage objHomePage = new HomePage(driver);
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы

        // кликаем по третьей кнопке и сравниваем текст
        objHomePage.clickHowIsTheRentalTimeCalculated();
        objHomePage.checkThirdText();
    }

    @Test
    public void allAboutTheImportantFourthTest() {

        HomePage objHomePage = new HomePage(driver);
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы

        // кликаем по четвертой кнопке и сравниваем текст
        objHomePage.clickIsItPossibleToOrderAScooterRightForToday();
        objHomePage.checkFourthText();
    }

    @Test
    public void allAboutTheImportantFifthTest() {

        HomePage objHomePage = new HomePage(driver);
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы


        // кликаем по пятой кнопке и сравниваем текст
        objHomePage.clickCanIExtendTheOrderOrReturnTheScooterEarlier();
        objHomePage.checkFifthText();
    }

    @Test
    public void allAboutTheImportantSixthTest() {

        HomePage objHomePage = new HomePage(driver);
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы

        // кликаем по шестой кнопке и сравниваем текст
        objHomePage.clickDoYouBringChargersWithTheScooter();
        objHomePage.checkSixthText();
    }

    @Test
    public void allAboutTheImportantSeventhTest() {

        HomePage objHomePage = new HomePage(driver);
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы

        // кликаем по седьмой кнопке и сравниваем текст
        objHomePage.clickCanICancelAnOrder();
        objHomePage.checkSeventhText();
    }

    @Test
    public void allAboutTheImportantEighthTest() {

        HomePage objHomePage = new HomePage(driver);
        objHomePage.closePopupCookie(); // выполняем метод закрытия поп-апа с куками
        objHomePage.scroll(); // выполняем метод скролла до конца страницы

        // кликаем по восьмой кнопке и сравниваем текст
        objHomePage.clickILiveOutsideTheMoscowRingRoadWillYouBringIt();
        objHomePage.checkEighthText();
    }
}
