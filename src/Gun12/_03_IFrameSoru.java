package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseDriver {
    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
    @Test
    public void Test1() {
        driver.get(" https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input=driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0); //1.frame in içindeki tek frame dolayısıyla index i 0
        WebElement checkBox=driver.findElement(By.id("a"));
        checkBox.click();

//        driver.switchTo().parentFrame();  // bir önceki
//        driver.switchTo().parentFrame();  // bir önceki

        driver.switchTo().defaultContent();  // direk olarak ana sayfaya gider.

        driver.switchTo().frame(1);
        WebElement webSelect=driver.findElement(By.id("animals"));
        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByIndex(3); // 4.eleman

        BekleKapat();






        //driver.switchTo().frame(0);
        //WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        //input.sendKeys("Almanya");


        //driver.switchTo().frame(1);
        //WebElement btnchck= driver.findElement(By.id("a"));
        //btnchck.click();

        //driver.switchTo().defaultContent();

        //driver.switchTo().frame(1);
        //WebElement avatar= driver.findElement(By.id("animals"));
        //Select select = new Select(avatar);
        //select.selectByIndex(3);


        //BekleKapat();
    }
}
