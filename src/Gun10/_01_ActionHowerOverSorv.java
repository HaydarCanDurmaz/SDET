package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

//     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.
public class _01_ActionHowerOverSorv extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://www.etsy.com/");
        //List<WebElement> cookiesAccept= driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        //if (cookiesAccept.size() > 0) // varsa
        //   cookiesAccept.get(0).click();


        WebElement mucevher = driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));
        WebElement kolye = driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));
        WebElement bykolye = driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));


        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(mucevher).build().perform();
        MyFunc.Bekle(2);
        // Yarın için Gözükene kadar bekle çalış
        aksiyonlar.moveToElement(kolye).build().perform();
        MyFunc.Bekle(2);

        aksiyonlar.moveToElement(bykolye).click().build().perform();// bib kolye clcik
        MyFunc.Bekle(2);
        System.out.println(" = " + driver.getCurrentUrl());
        Assert.assertTrue("Urlde bib kolye varmı ", driver.getCurrentUrl().contains("bib-necklaces"));

        //bekletiyi yazıyorumm hata varsaa benirahatsız etme

        MyFunc.Bekle(2);
        BekleKapat();
    }
}
