package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    // локаторы раздела "Вопросы о важном"
    private WebDriver driver;

    private By allAboutImportant = By.className("Home_SubHeader__zwi_E"); // локатор "Все о важном"
    //private By orderButton = By.className("Button_Button__ra12g"); // локатор кнопки "Заказать"
    private By howMuchIsIt = By.id("accordion__heading-0"); // локатор кнопки "Сколько это стоит? И как оплатить?"
    private By iWantSeveralScooters = By.id("accordion__heading-1"); // локатор кнопки "Хочу сразу несколько самокатов! Так можно?"
    private By howIsTheRentalTimeCalculated = By.id("accordion__heading-2"); // локатор кнопки "Как рассчитывается время аренды?"
    private By isItPossibleToOrderAScooterRightForToday = By.id("accordion__heading-3"); // локатор кнопки "Можно ли заказать самокат прямо на сегодня?"
    private By canIExtendTheOrderOrReturnTheScooterEarlier = By.id("accordion__heading-4"); // локатор кнопки "Можно ли продлить заказ или вернуть самокат раньше?"
    private By doYouBringChargersWithTheScooter = By.id("accordion__heading-5"); // локатор кнопки "Вы привозите зарядку вместе с самокатом?"
    private By canICancelAnOrder = By.id("accordion__heading-6"); // локатор кнопки "Можно ли отменить заказ?"
    private By iLiveOutsideTheMoscowRingRoadWillYouBringIt = By.id("accordion__heading-7"); // локатор кнопки "Я жизу за МКАДом, привезёте?"


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // методы нажатия кнопок на домашней странице

    // метод нажатия 1 кнопки и поиска текста
    public void clickHowMuchIsIt() {
        driver.findElement(howMuchIsIt).click();
        driver.findElement(By.id("accordion__panel-0"));
    }

    // метод нажатия 2 кнопки и поиска текста
    public void clickIWantSeveralScooters() {
        driver.findElement(iWantSeveralScooters).click();
        driver.findElement(By.id("accordion__panel-1"));
    }

    // метод нажатия 3 кнопки и поиска текста
    public void clickHowIsTheRentalTimeCalculated() {
        driver.findElement(howIsTheRentalTimeCalculated).click();
        driver.findElement(By.id("accordion__panel-2"));
    }

    // метод нажатия 4 кнопки и поиска текста
    public void clickIsItPossibleToOrderAScooterRightForToday() {
        driver.findElement(isItPossibleToOrderAScooterRightForToday).click();
        driver.findElement(By.id("accordion__panel-3"));
    }

    // метод нажатия 5 кнопки и поиска текста
    public void clickCanIExtendTheOrderOrReturnTheScooterEarlier() {
        driver.findElement(canIExtendTheOrderOrReturnTheScooterEarlier).click();
        driver.findElement(By.id("accordion__panel-4"));
    }

    // метод нажатия 6 кнопки и поиска текста
    public void clickDoYouBringChargersWithTheScooter() {
        driver.findElement(doYouBringChargersWithTheScooter).click();
        driver.findElement(By.id("accordion__panel-5"));
    }

    // метод нажатия 7 кнопки и поиска текста
    public void clickCanICancelAnOrder() {
        driver.findElement(canICancelAnOrder).click();
        driver.findElement(By.id("accordion__panel-6"));
    }

    // метод нажатия 8 кнопки и поиска текста
    public void clickILiveOutsideTheMoscowRingRoadWillYouBringIt() {
        driver.findElement(iLiveOutsideTheMoscowRingRoadWillYouBringIt).click();
        driver.findElement(By.id("accordion__panel-7"));
    }

    // метод ожидания загрузки
    public void waitForLoadImportant() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(allAboutImportant).getText() != null
                && !driver.findElement(allAboutImportant).getText().isEmpty()
        ));
    }

    // метод скролла до конца страницы
    public void scroll() {
        WebElement element = driver.findElement((iLiveOutsideTheMoscowRingRoadWillYouBringIt));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // метод закрытия поп-апа с куками
    public void closePopupCookie() {
        driver.findElement(By.id("rcc-confirm-button")).click();
    }
}
