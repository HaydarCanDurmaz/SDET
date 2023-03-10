package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_SenaryoCozum extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.saucedemo.com/");

        MyFunc.Bekle(2);
        WebElement login = driver.findElement(By.xpath("//*[@id='user-name']"));
        login.sendKeys("standard_user");


        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secret_sauce");


        MyFunc.Bekle(2);
        WebElement button = driver.findElement(By.xpath("//*[@id='login-button']"));
        button.click();



        MyFunc.Bekle(2);
        WebElement secim1 = driver.findElement(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory']"));
        secim1.click();


        MyFunc.Bekle(2);
        WebElement secim2 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        secim2.click();


        MyFunc.Bekle(2);
        WebElement sepet = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
        sepet.click();


        MyFunc.Bekle(2);
        WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
        checkout.click();


        MyFunc.Bekle(2);
        WebElement firstname = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstname.sendKeys("haydarcan");



        MyFunc.Bekle(2);
        WebElement lastname = driver.findElement(By.xpath("//*[@id='last-name']"));
        lastname.sendKeys("durmaz");



        MyFunc.Bekle(2);
        WebElement pstkod = driver.findElement(By.xpath("//*[@id='postal-code']"));
        pstkod.sendKeys("2534");


        MyFunc.Bekle(2);
        WebElement continu = driver.findElement(By.xpath("//*[@id='continue']"));
        continu.click();




        BekleKapat();


    }
}
