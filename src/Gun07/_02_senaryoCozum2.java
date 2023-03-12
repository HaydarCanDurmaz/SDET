package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_senaryoCozum2 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.saucedemo.com/");


        MyFunc.Bekle(2);
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");


        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");


        MyFunc.Bekle(2);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();


        // 1. Ürün Ekleme
        MyFunc.Bekle(2);
        WebElement items1 = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        items1.click();


        MyFunc.Bekle(2);
        WebElement addTocard = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addTocard.click();


        MyFunc.Bekle(2);
        WebElement btnback = driver.findElement(By.xpath(" //button[@id='back-to-products']"));
        btnback.click();


        // 2. Ürün Ekleme
        MyFunc.Bekle(2);
        WebElement items2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        items2.click();


        MyFunc.Bekle(2);
        WebElement addTocard1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addTocard1.click();


        MyFunc.Bekle(2);
        WebElement btnback1 = driver.findElement(By.xpath(" //button[@id='back-to-products']"));
        btnback1.click();

        // sepet işlemleri,
        MyFunc.Bekle(2);
        WebElement sepet = driver.findElement(By.xpath(" //span[@class='shopping_cart_badge']"));
        sepet.click();


        MyFunc.Bekle(2);
        WebElement buttoncheckout = driver.findElement(By.xpath(" //button[@id='checkout']"));
        buttoncheckout.click();

        // Kullanıcı Bilgilerini Giriyorurzzz

        MyFunc.Bekle(1);
        WebElement firstname = driver.findElement(By.xpath(" //input[@id='first-name']"));
        firstname.sendKeys("Haydarrrrr");


        MyFunc.Bekle(1);
        WebElement lasttname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lasttname.sendKeys("durmazz");


        MyFunc.Bekle(1);
        WebElement pstkod = driver.findElement(By.xpath("//input[@id='postal-code']"));
        pstkod.sendKeys("252525");


        MyFunc.Bekle(1);
        WebElement continu = driver.findElement(By.xpath("//input[@id='continue']"));
        continu.click();


        // Üçretlerini Topla
        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam = 0;
        for (WebElement e : ucretler) {
            System.out.println("e.getText() = " + e.getText());//$29 -> e.getText().subsring().29.99
            //replaceAll ile [^0-9.,]

            toplam = toplam + Double.parseDouble(e.getText().substring(1));
        }

        System.out.println("toplam = " + toplam);

        WebElement webAltToplam=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));

        System.out.println("webAltToplam = " + webAltToplam.getText());
        System.out.println("webAltToplam = " + webAltToplam.getText().replaceAll("[^0-9,.]",""));

        Double altToplam=Double.parseDouble(webAltToplam.getText().replaceAll("[^0-9,.]",""));

        Assert.assertTrue("Değerler eşit değil",  (toplam==altToplam));


        // Double altToplam=Double.parseDouble(webAltToplam.getText().replaceAll("^0-9,.",""));

       // Assert.assertTrue("Degerler eşit degil", (toplam==altToplam));



        BekleKapat();


    }
}
