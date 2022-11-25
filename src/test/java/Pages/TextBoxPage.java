package Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFullName() {
        return waitClickableElement("//input[@id='userName']");
    }

    public WebElement getEmail() {
        return waitClickableElement("//input[@id='userEmail']");
    }

    public WebElement getCurrentAddress() {
        return waitClickableElement("//*[@id='currentAddress']");
    }

    public WebElement getPermanentAddress() {
        return waitClickableElement("//*[@id='permanentAddress']");
    }

    public WebElement getSubmintBtn() {
        return waitVisibleOfAllElements("//*[contains(text(),'Submit')]");
    }

    public WebElement getActualRes() {
        return waitClickableElement("//*[@id='output']");
    }
    public WebElement getErrorEmail(){
        return driver.findElement(By.className("mr-sm-2 field-error form-control"));
    }

}
