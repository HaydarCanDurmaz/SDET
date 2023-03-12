package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");

        WebElement elenemt = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //elenemt.click();

        Actions aksiyonlar = new Actions(driver);// web sayfayı aksiyonları aacıklandı

        Action aksiyon = aksiyonlar.moveToElement(elenemt).click().build();
        //Elementin üzerindeki click için git orda bekle aksiyonu hazırla

        System.out.println(" Aksiyon hazrılandı ");


        MyFunc.Bekle(3);
        aksiyon.perform();// aksiyonu gerçekleştir . , işleme al uygula . içra et
        System.out.println("Aksiyon gerçekletir");

        BekleKapat();


    }
}
