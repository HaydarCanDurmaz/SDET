package Gun13;

import Utlity.BaseDriver1;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver1 {
    @Test
    public void Test1() {

        driver.manage().deleteAllCookies(); // TÜM coockieler silindi
        driver.get("https://www.copado.com/robotic-testing");

        MyFunc.Bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement element = driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element); //  elemente kadar kaydır


        // element.click(); tıklatma özlelligini kaybettiren elmentlerin altında oldugunda TIKLANAMAZ
        js.executeScript("arguments[0].click();", element); /// html de ulaşı ve kapatr


        MyFunc.Bekle(4);
        BekleKapat();
    }
}
