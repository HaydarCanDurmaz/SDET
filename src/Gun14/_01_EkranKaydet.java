package Gun14;

import Utlity.BaseDriver;
import Utlity.BaseDriver1;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {
    @Test
    public void Test1() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        MyFunc.Bekle(1);
        WebElement usename = driver.findElement(By.name("username"));
        usename.sendKeys("haydarcan");

        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("haydarcan");

        MyFunc.Bekle(1);
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // Hatalı mesaj var ise cıkan element
        List<WebElement> hatamesaji = driver.findElements(By.cssSelector("div[role='alert']"));
        if (hatamesaji.size()>0) {//hata varsa
            // ekranı kaydet
            System.out.println("Hata oluştu");



            TakesScreenshot ts=(TakesScreenshot) driver; //1.Aşama ekran görünütü alma değişkenini tanımladım
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE); ////2.Aşama ekran görüntüsü alındı, hafızada
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\2022_10_07_1319_20.png"));
            //3.Aşama hafızadaki bu bilgiyi dosya olarak verilen path e kaydet.


           // TakesScreenshot ts = (TakesScreenshot) driver;// 1. aşamadaki ekrn görüntüsünü alma degşkeni tanımladım
           // File hafizadakihalii=ts.getScreenshotAs(OutputType.FILE); // 2 . aşama ekran görüntüsü alındı hafızada
            // hafızadaki bu bilgiyi dosya olarak kaydet
           // FileUtils.copyFile(hafizadakihalii,new File("ekran görüntüleri\\screenshot.png"));
        }

        // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
        //        biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
        //        bunu nasıl yaparsınız
        //        LocalDateTime alıcaksın bilgileri
        //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png


        MyFunc.Bekle(2);
        BekleKapat();
    }
}
