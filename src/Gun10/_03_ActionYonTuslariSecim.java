package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionYonTuslariSecim extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));
        // element git , içine tıklat , b tuuna bas
        Actions aksitonlar = new Actions(driver);

        Action aksiton = aksitonlar
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build();
        aksiton.perform();

        MyFunc.Bekle(2);

        Action aksiyon = aksitonlar
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        aksiyon.perform();

        BekleKapat();


    }
}
