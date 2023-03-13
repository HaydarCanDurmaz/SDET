package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickme3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickme3.click();

        MyFunc.Bekle(2);
        //alert acılıyor
        driver.switchTo().alert().sendKeys("haydar");// alert kutusu OK yine bas , böylece kapandı
        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);
        WebElement txtActual= driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Beklenen yazı geldimi",txtActual.getText().contains("haydar"));



        BekleKapat();
    }
}
