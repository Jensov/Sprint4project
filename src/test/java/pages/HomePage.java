package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class HomePage {

    // локаторы раздела "Вопросы о важном"
    private WebDriver driver;

    private By howMuchIsIt = By.id("accordion__heading-0"); // локатор кнопки "Сколько это стоит? И как оплатить?"
    private By iWantSeveralScooters = By.id("accordion__heading-1"); // локатор кнопки "Хочу сразу несколько самокатов! Так можно?"
    private By howIsTheRentalTimeCalculated = By.id("accordion__heading-2"); // локатор кнопки "Как рассчитывается время аренды?"
    private By isItPossibleToOrderAScooterRightForToday = By.id("accordion__heading-3"); // локатор кнопки "Можно ли заказать самокат прямо на сегодня?"
    private By canIExtendTheOrderOrReturnTheScooterEarlier = By.id("accordion__heading-4"); // локатор кнопки "Можно ли продлить заказ или вернуть самокат раньше?"
    private By doYouBringChargersWithTheScooter = By.id("accordion__heading-5"); // локатор кнопки "Вы привозите зарядку вместе с самокатом?"
    private By canICancelAnOrder = By.id("accordion__heading-6"); // локатор кнопки "Можно ли отменить заказ?"
    private By iLiveOutsideTheMoscowRingRoadWillYouBringIt = By.id("accordion__heading-7"); // локатор кнопки "Я жизу за МКАДом, привезёте?"
    private By firstButtonText = By.id("accordion__panel-0"); // локатор текста первой кнопки "Сколько это стоит? И как оплатить?"
    private By secondButtonText = By.id("accordion__panel-1"); // локатор текста второй кнопки "Хочу сразу несколько самокатов! Так можно?"
    private By thirdButtonText = By.id("accordion__panel-2"); // локатор текста третей кнопки "Как рассчитывается время аренды?"
    private By fourthButtonText = By.id("accordion__panel-3"); // локатор текста четвертой кнопки "Можно ли заказать самокат прямо на сегодня?"
    private By fifthButtonText = By.id("accordion__panel-4"); // локатор текста пятой кнопки "Можно ли продлить заказ или вернуть самокат раньше?"
    private By sixthButtonText = By.id("accordion__panel-5"); // локатор текста шестой кнопки "Вы привозите зарядку вместе с самокатом?"
    private By seventhButtonText = By.id("accordion__panel-6"); // локатор текста седьмой кнопки "Можно ли отменить заказ?"
    private By eighthButtonText = By.id("accordion__panel-7"); // локатор текста восьмой кнопки "Я жизу за МКАДом, привезёте?"
    private By cookieButton = By.id("rcc-confirm-button"); // локатор кнопки закрытия поп-апа с куками "Да все привыкли"

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    // методы нажатия кнопок на домашней странице

    // метод нажатия 1 кнопки
    public void clickHowMuchIsIt() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(howMuchIsIt));
        driver.findElement(howMuchIsIt).click();
    }

    // метод сравнения ожидаемого текста с текстом 1 кнопки
    public void checkFirstText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(firstButtonText));
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", driver.findElement(firstButtonText).getText());
    }

    // метод нажатия 2 кнопки
    public void clickIWantSeveralScooters() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(iWantSeveralScooters));
        driver.findElement(iWantSeveralScooters).click();
    }

    // метод сравнения ожидаемого текста с текстом 2 кнопки
    public void checkSecondText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(secondButtonText));
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", driver.findElement(secondButtonText).getText());
    }

    // метод нажатия 3 кнопки
    public void clickHowIsTheRentalTimeCalculated() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(howIsTheRentalTimeCalculated));
        driver.findElement(howIsTheRentalTimeCalculated).click();
    }

    // метод сравнения ожидаемого текста с текстом 3 кнопки
    public void checkThirdText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(thirdButtonText));
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", driver.findElement(thirdButtonText).getText());
    }

    // метод нажатия 4 кнопки
    public void clickIsItPossibleToOrderAScooterRightForToday() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(isItPossibleToOrderAScooterRightForToday));
        driver.findElement(isItPossibleToOrderAScooterRightForToday).click();
    }

    // метод сравнения ожидаемого текста с текстом 4 кнопки
    public void checkFourthText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(fourthButtonText));
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", driver.findElement(fourthButtonText).getText());
    }

    // метод нажатия 5 кнопки
    public void clickCanIExtendTheOrderOrReturnTheScooterEarlier() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(canIExtendTheOrderOrReturnTheScooterEarlier));
        driver.findElement(canIExtendTheOrderOrReturnTheScooterEarlier).click();
    }

    // метод сравнения ожидаемого текста с текстом 5 кнопки
    public void checkFifthText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(fifthButtonText));
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", driver.findElement(fifthButtonText).getText());
    }

    // метод нажатия 6 кнопки
    public void clickDoYouBringChargersWithTheScooter() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(doYouBringChargersWithTheScooter));
        driver.findElement(doYouBringChargersWithTheScooter).click();
    }

    // метод сравнения ожидаемого текста с текстом 6 кнопки
    public void checkSixthText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(sixthButtonText));
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", driver.findElement(sixthButtonText).getText());
    }


    // метод нажатия 7 кнопки
    public void clickCanICancelAnOrder() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(canICancelAnOrder));
        driver.findElement(canICancelAnOrder).click();
    }

    // метод сравнения ожидаемого текста с текстом 7 кнопки
    public void checkSeventhText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(seventhButtonText));
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", driver.findElement(seventhButtonText).getText());
    }

    // метод нажатия 8 кнопки
    public void clickILiveOutsideTheMoscowRingRoadWillYouBringIt() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(iLiveOutsideTheMoscowRingRoadWillYouBringIt));
        driver.findElement(iLiveOutsideTheMoscowRingRoadWillYouBringIt).click();
    }

    // метод сравнения ожидаемого текста с текстом 8 кнопки
    public void checkEighthText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(eighthButtonText));
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", driver.findElement(eighthButtonText).getText());
    }

    // метод скролла до конца страницы
    public void scroll() {
        WebElement element = driver.findElement((iLiveOutsideTheMoscowRingRoadWillYouBringIt));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // метод закрытия поп-апа с куками
    public void closePopupCookie() {
        driver.findElement(cookieButton).click();
    }
}
