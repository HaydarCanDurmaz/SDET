package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickme2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        clickme2.click();

        MyFunc.Bekle(2);
        //alert acılıyor
        driver.switchTo().alert().dismiss();// alert kutusu OK yine bas , böylece kapandı


        BekleKapat();
    }
}
