package pages;

import org.openqa.selenium.*;

public class OrderPage {

    private WebDriver driver;
    // локаторы страницы заказа
    private By orderUpperButton = By.className("Button_Button__ra12g"); // локатор кнопки "Заказать" вверху страницы
    private By orderMiddleButton = By.className("Button_Middle__1CSJM"); // локатор кнопки "Заказать" посередине страницы
    private By nextButton = By.xpath("//button[text()='Далее']"); // локатор кнопки "Далее"
    private By orderFinishButton = By.xpath("//div/div[2]/div[3]/button[2]"); // локатор кнопки "Заказать" после заполнения данных
    private By yesFromDialogOrder = By.xpath("//button[text()='Да']"); // локатор кнопки "Да" в диалоге оформления заказа
    private By nameString = By.xpath("//input[@placeholder='* Имя']"); // локатор поля ввода "Имя"
    private By surnameString = By.xpath(".//input[@placeholder='* Фамилия']"); // локатор поля ввода "Фамилия"
    private By addressString = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"); // локатор поля ввода "Адрес"
    private By metroStation = By.xpath(".//input[@placeholder='* Станция метро']"); // локатор поля ввода и выбора "Метро"
    private By phoneNumberString = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"); // локатор поля ввода "Телефон"
    private By whenToBringTheScooter = By.xpath(".//input[@placeholder='* Когда привезти самокат']"); // локатор поля выбора "Когда привезти самокат"
    private By rentalPeriod = By.className("Dropdown-placeholder"); // локатор поля срока аренды
    private By rentalPeriodTwoDays = By.xpath(".//div[text()='двое суток']"); // локатор выбора срока аренды на 2 суток
    private By colorScooter = By.className("Checkbox_Label__3wxSf"); // локатор чекбокса выбора цвета самоката
    private By orderComment = By.xpath("//input[@placeholder='Комментарий для курьера']"); // локатор поля ввода комментария
    private By orderDoneText = By.className("Order_ModalHeader__3FDaJ"); // локатор окна успешного оформления заказа с текстом "Заказ оформлен"
    private By cookieButton = By.id("rcc-confirm-button"); // локатор кнопки закрытия поп-апа с куками "Да все привыкли"

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    // методы нажатия кнопок на странице заказа

    // метод нажатия кнопки "Заказать" вверху на главной странице
    public void clickOrderUpperButton() {
        driver.findElement(orderUpperButton).click();
    }

    // метод скролла и нажатия кнопки "Заказать" посередине на главной странице
    public void scrollAndClickOrderMiddleButton() {
        WebElement element = driver.findElement(orderMiddleButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(orderMiddleButton).click();
    }

    // метод нажатия и ввода имени
    public void clickAndInputName(String name) {
        driver.findElement(nameString).sendKeys(name);
    }

    // метод нажатия и ввода фамилии
    public void clickAndInputSurname(String surname) {
        driver.findElement(surnameString).sendKeys(surname);
    }

    // метод нажатия и ввода адреса
    public void clickAndInputAddress(String address) {
        driver.findElement(addressString).sendKeys(address);
    }

    // метод нажатия, ввода, и выбора станции метро
    public void clickAndInputMetro(String station) {
        driver.findElement(metroStation).sendKeys(station);
        driver.findElement(metroStation).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    // метод нажатия и ввода номера телефона
    public void clickAndInputPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberString).sendKeys(phoneNumber);
    }

    // метод нажатия кнопки "Далее"
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    // метод нажатия и выбора даты доставки самоката
    public void clickWhenToBringTheScooterAndSetDate() {
        driver.findElement(whenToBringTheScooter).click();
        driver.findElement(whenToBringTheScooter).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    // метод нажатия и выбора срока аренды
    public void chooseRentalPeriod() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(rentalPeriodTwoDays).click();
    }

    // метод выбора цвета самоката
    public void chooseColorScooter() {
        driver.findElement(colorScooter).click();
    }

    // метод нажатия и ввода комментария
    public void clickAndInputComment(String comment) {
        driver.findElement(orderComment).sendKeys(comment);
    }

    // метод нажатия кнопки "Заказать" после заполнения всех параметров
    public void clickOrderFinishButton() {
        driver.findElement(orderFinishButton).click();
    }

    // метод нажатия кнопки "Да" в диалоге оформления заказа
    public void clickYesFromDialogOrder() {
        driver.findElement(yesFromDialogOrder).click();
    }

    // метод проверки появления сообщения, что заказ успешно оформлен
    public void checkOrderDone() {
        driver.findElement(orderDoneText).isDisplayed();
    }

    // метод закрытия поп-апа с куками
    public void closePopupCookie() {
        driver.findElement(cookieButton).click();
    }

    // метод ввода данных пользователя и перехода на следующий экран по кнопке "Далее"
    public void inputUserInfo(String name, String surname, String address, String station, String phoneNumber) {
        clickAndInputName(name);
        clickAndInputSurname(surname);
        clickAndInputAddress(address);
        clickAndInputMetro(station);
        clickAndInputPhoneNumber(phoneNumber);
        clickNextButton();
    }

    // метод ввода информации о заказе и оформление заказа
    public void inputDeliveryInfoAndOrderDone(String comment) {
        clickWhenToBringTheScooterAndSetDate();
        chooseRentalPeriod();
        chooseColorScooter();
        clickAndInputComment(comment);
        clickOrderFinishButton();
        clickYesFromDialogOrder();
        checkOrderDone();
    }
}
