package Gun13;

import Utlity.BaseDriver1;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver1 {
    @Test
    public void Test1() {
        driver.get("https://p-del.co/");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // sayfaın sonuna kadar gider

        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0,0);"); // en başa sıfıra 0 git

//        js.executeScript("window.scrollBy(0,0);"); // bulundugun yerden sıfıra git




        BekleKapat();



    }

}
