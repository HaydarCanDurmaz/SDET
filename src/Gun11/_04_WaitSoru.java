package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
    @Test
    public void Wait1() {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement link=driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepeteEklelinki=driver.findElement(By.linkText("Add to cart"));
        sepeteEklelinki.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent()); // alert çıkana kadar bekle

        driver.switchTo().alert().accept();

        WebElement anaSayfa=driver.findElement(By.id("nava"));
        anaSayfa.click();

        BekleKapat();





      //  WebElement samsung = driver.findElement(By.linkText("Samsung galaxy s6"));
      //  samsung.click();

      //  WebElement addTocard = driver.findElement(By.linkText("Add to cart"));
      //  addTocard.click();

      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)) ;
      //  wait.until(ExpectedConditions.alertIsPresent()); //  alert cıkana kdar bekle
      //  driver.switchTo().alert().accept();

      //  WebElement anasyfa = driver.findElement(By.id("nava"));
      //  anasyfa.click();




    }
}
