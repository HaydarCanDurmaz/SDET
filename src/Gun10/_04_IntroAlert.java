package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {
    /*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?
        driver.switchTo().alert()     -> alerte geçerim
        komutları:
        1- accept : OK, TAMAM botunan basmamızı sağlar.
        2- dismiss : CANCEL, HAYIR, yani olumsuz butonuna basmamızı sağlıyor.
        3- sendKeys : yazı gönderme
        4- getText : uyarı yazısını alma

 */
    @Test
    public void Test1(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickme1 = driver.findElement(By.xpath(" (//*[@class='panel panel-primary'][2]/..//button)[1]"));
        clickme1.click();
        //  (//*[@class='panel panel-primary'][2]/..//button)[1]

        MyFunc.Bekle(2);
        //alert acılıyor
        driver.switchTo().alert().accept();// alert kutusu OK yine bas , böylece kapandı





        BekleKapat();
    }
}
