package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> Linkler = driver.findElements(By.tagName("a"));
        // verilen taglerdeki  tüm elemanları aldık
        for (WebElement e : Linkler) {
            if (e.getText().isEmpty()) {
                System.out.println("e (href)= " + e.getAttribute("href"));
                System.out.println("(title) = " + e.getAttribute("title"));
                System.out.println("e (rel) = " + e.getAttribute("rel"));
            }
        }


            BekleKapat();
        }
    }

