package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusControlSendKeys extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));
        //element.sendKeys("Ahmet");

        // shift a shift i bıraktım hmet -> Ahmet
        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar
                .moveToElement(element)//kutucuga gel
                .click()       //içine tıklat
                .keyDown(Keys.SHIFT)    // shifte Bas
                .sendKeys("a")          //shift +a -> A
                .keyUp(Keys.SHIFT)      // shiti bırak
                .sendKeys("hmet")       // yazıyı gönder
                .build();
        // Aksiyon hazırlandı

        MyFunc.Bekle(2);
        aksiyon.perform(); // İŞLEM Gerçekleşti


        BekleKapat();
    }
}
