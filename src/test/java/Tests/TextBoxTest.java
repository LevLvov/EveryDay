package Tests;

import BaseClasses.TestInit;
import Pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends TestInit {
    @Test
    public void textBoxTestPositiv() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);

        getUrl("https://demoqa.com/text-box");

        textBoxPage.getFullName().sendKeys("Lev");
        textBoxPage.getEmail().sendKeys("12345@gmail.com");
        textBoxPage.getCurrentAddress().sendKeys("Kyiv");
        textBoxPage.getPermanentAddress().sendKeys("London");
        scrollToElement(textBoxPage.getSubmintBtn());
        textBoxPage.getSubmintBtn().click();

        Assert.assertEquals(textBoxPage.getActualRes().getText(), "Name:Lev\n" +
                "Email:12345@gmail.com\n" +
                "Current Address :Kyiv\n" +
                "Permananet Address :London");
    }
}

