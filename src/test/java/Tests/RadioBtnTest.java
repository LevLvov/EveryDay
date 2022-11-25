package Tests;

import BaseClasses.TestInit;
import Pages.ElementsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioBtnTest extends TestInit {

    @Test
    public void radioBtnYes(){
        ElementsPage elementsPage = new ElementsPage(driver);

        getUrl("https://demoqa.com/radio-button");

        elementsPage.getYesBtn().click();
        Assert.assertEquals(elementsPage.actualYes().getText(),"Yes");
    }
    @Test
    public void radioBtnImpressive(){
        ElementsPage elementsPage = new ElementsPage(driver);

        getUrl("https://demoqa.com/radio-button");

        elementsPage.getImpressiveBtn().click();
        Assert.assertEquals(elementsPage.actualImpressive().getText(),"Impressive");
    }
    @Test
    public void radioBtnNo(){
        ElementsPage elementsPage = new ElementsPage(driver);

        getUrl("https://demoqa.com/radio-button");

        Assert.assertTrue(elementsPage.actualNo().isEnabled());
    }
}

