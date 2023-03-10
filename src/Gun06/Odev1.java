package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    @Test
    public void Test1() {
        // 1- https://formsmarts.com/form/yu?made=h5 sitesini acın
        // 2- Business i çekleyin
        // 3- discover XVZ ye tıklatın ve online Advertising i secin
        // 4- Everyday i ecin
        // 5- Good secin
        // 6- using XYZ yi tıklatın ve 3. secenegi secin
        // CSS selector

        driver.get("https://formsmarts.com/form/yu?made=h5");

        MyFunc.Bekle(2);
        WebElement business = driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        business.click();


        MyFunc.Bekle(2);
        WebElement dropDownDiscover = driver.findElement(By.cssSelector("[id$='_4588']"));
        dropDownDiscover.click();


        MyFunc.Bekle(2);
        WebElement optisionOnlineAdvertising = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optisionOnlineAdvertising.click();


        MyFunc.Bekle(2);
        WebElement buttonEveryDay = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryDay.click();


        MyFunc.Bekle(2);
        WebElement goodRadio = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();


        MyFunc.Bekle(2);
        WebElement howlongDropdown = driver.findElement(By.cssSelector("select[id$='_4597']"));
        howlongDropdown.click();


        MyFunc.Bekle(2);
        WebElement secenek4 = driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        secenek4.click();

        MyFunc.Bekle(2);
        goodRadio.click();


        BekleKapat();


    }
}
