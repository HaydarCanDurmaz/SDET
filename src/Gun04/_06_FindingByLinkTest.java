package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/"); // sayfaya gittim


        // LinkText yoluyla eleman bulma işlmei sadece a tag inde kullanılabilir
        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        // gözüken test i Siparişlerim olan a tag li webelement
        System.out.println("siparislerimLinki = " + siparislerimLinki.getText());

        System.out.println("siparislerimLinki (href) = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki (title) = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki (rel) = " + siparislerimLinki.getAttribute("rel"));


        //partialLinkText
        WebElement Link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("Link2 = " + Link2.getText());

        MyFunc.Bekle(3);
        driver.quit();
    }
}
