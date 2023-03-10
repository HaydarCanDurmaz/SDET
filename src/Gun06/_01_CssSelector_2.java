package Gun06;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import  org.junit.Assert;

public class _01_CssSelector_2 extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="HaydarCanDurmaz";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesajim);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue(("aranılan mesaj bulunamadı"),msg.getText().equals(mesajim));// Verilen deger TRUE mu
        // Hata yok ise yani içindeki deger .TRUE ise hiç bilgi vermez





      //  if (msg.getText().equals(mesajim))
      //      System.out.println("Test passed");
      //  else
      //      System.out.println("test fail");


        BekleKapat();
    }
}
