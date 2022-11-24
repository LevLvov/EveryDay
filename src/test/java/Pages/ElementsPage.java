package Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BasePage {
    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getYesBtn() {
        return waitClickableElement("(//label[@class='custom-control-label'])[1]");
    }

    public WebElement getImpressiveBtn() {
        return waitClickableElement("//label[@class='custom-control-label' and @for='impressiveRadio']");
    }

    public WebElement getNoBtn() {
        return waitClickableElement("//label[@class='custom-control-label disabled' and @for='noRadio']");
    }

    public WebElement actualYes() {
        return findElement("//span[contains(text(),'Yes')]");
    }

    public WebElement actualImpressive() {
        return findElement("//span[contains(text(),'Impressive')]");
    }
    public WebElement actualNo() {
        return findElement("//label[@class='custom-control-label disabled' and @for='noRadio']");
    }
}

