package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_WaitGiris extends BaseDriver {


/*
     Selenium Bekletme Komutları

      pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.

     ImplicitlyWait:
     Tüm sayfadaki elemanlar için, elemanın locatorı sayfa içinde bulanabilir hale getirene kadar verilen bekleme süresi.
     Bütün elemanlar için geçerli ve eleman bulunduğunda kalan süreyi beklemez.NoSuchElement hatasını için verilen süre
     kadar beler.

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

     Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
 */

    @Test
    public void Wait1(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);



        //        MyFunc.Bekle(30); // bu programı durduruyor // sayfaylada bir ilgisi olmadığı için sonuna kadra bekler.
        // interviewlrda bekletme olarak kesinlikle söylenmiyor

        WebElement mesaj= driver.findElement(By.xpath("//p[text()='WebDriver']"));














    }
}
