package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);




        WebElement element = driver.findElement(By.id("alerttest"));
       // WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();// yeni sayfaya gittik
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());// o anda bulundugun url yi veriri

        driver.navigate().back();// tarayıcı history isiden geri geldim
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());// o anda bulundugun url yi veriri


        driver.navigate().forward();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());// o anda bulundugun url yi veriri



        BekleKapat();
    }
}
