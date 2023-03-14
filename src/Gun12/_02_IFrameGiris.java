package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFrameGiris extends BaseDriver {
    /*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */
    @Test
    public void Test1() {
        driver.get(" https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        // driver.switchTo().parentFrame(); // ana sayfaya geri döndüm
        driver.switchTo().defaultContent(); // aynı işlemi yapar

        // //b[@id='topic']/following-sibling::input
        // b[id='topic']~input
        // #topic+input


        driver.switchTo().frame(1); // 2.frma geçtim
        WebElement webSelect = driver.findElement(By.id("animals")); // select le başlıyor
        Select nesneSelect = new Select(webSelect);
        nesneSelect.selectByVisibleText("Avatar");


        //driver.switchTo().frame(1);// 2 .ci frame geçtim
        //WebElement webSelect = driver.findElement(By.cssSelector("option[value='avatar']"));
        //Select nesneSelect=new Select(webSelect);
        //nesneSelect.selectByVisibleText("Avatar");


        BekleKapat();
    }
}
