package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_Soru extends BaseDriver {
    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.
    @Test
    public void Test1(){

        driver.get("https://www.facebook.com/");

        List<WebElement> cookiesAccept= driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click(); // kapat, tıklat

        MyFunc.Bekle(1);
        WebElement yeniHsp=driver.findElement(By.linkText("Yeni hesap oluştur"));
        yeniHsp.click();


        MyFunc.Bekle(1);
        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("Haydar Can");

        MyFunc.Bekle(1);
        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("Durmaz");

        MyFunc.Bekle(1);
        WebElement email1= driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(email1.isDisplayed());// Beklenen görünmemesi FALSE
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());


        MyFunc.Bekle(1);
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("canhydr12@hotmail.com");


        MyFunc.Bekle(1);
        Assert.assertTrue(email1.isDisplayed());// Beklenen görünmesi TRUE
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());




        // WebElement email1= driver.findElement(By.name("reg_email_confirmation__"));
        //email1.sendKeys("canhydr12@hotmail.com");


       // MyFunc.Bekle(1);
       // WebElement password= driver.findElement(By.name("      reg_passwd__"));
       // email1.sendKeys("1234_Hydr");

        MyFunc.Bekle(1);
        WebElement webDay=driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("21");


        MyFunc.Bekle(1);
        WebElement webMount=driver.findElement(By.id("month"));
        Select mounht=new Select(webMount);
        mounht.selectByVisibleText("Mar");


        MyFunc.Bekle(1);
        WebElement webYears=driver.findElement(By.id("year"));
        Select years=new Select(webYears);
        years.selectByVisibleText("1998");



        BekleKapat();







    }
}
