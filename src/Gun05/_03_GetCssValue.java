package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter =  driver.findElement(By.id("inputValEnter"));

        //  <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
        //  id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands"
        //  value="" strtindx=""endinx="">


        // elemanın parametrelerin eulaşmak için get.Attribute u kullanıyoruz
        System.out.println("inputValEnter = " + inputValEnter.getAttribute("class"));


        // Classın kArşılıgı olan Css-Şekilendirm degerini almak için getCssValue kullanılır
        System.out.println("inputValEnter(color) = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter(font-size) = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter(background) = " + inputValEnter.getCssValue("background"));






        BekleKapat();
    }
}
