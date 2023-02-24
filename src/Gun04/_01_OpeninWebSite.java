package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeninWebSite {
    public static  void main(String[] args) {
        // 1- Hepsi burada .com sayfasına git
        // 2- arama kutusuna usb yaz
        // 3-çıkan ürünlarin açıklamsında USB kelimesi ni kontrol
        // 4-konrol et
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // driverdan işleyecegiz aşagıdaki kodları

        // eleman arama kutusu = aramakutusunubul;
        // aramakutusu.yazıGonder("usb")
        // elemanlar = urunListesiniAl;
        //
        // for döngüsü ile kontrol et

        MyFunc.Bekle(5);
        driver.quit();
    }
}
