package Gun08;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectClassGiris extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.amazon.com.tr/");


        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        // Bu elemennt select ile başlıyorsa sen bunu Select cast yap ve öyle kullan

        Select ddMenu = new Select(webMenu);// elementi daha rahat kullanılabilir SELECT nesnesi haline dnüştürdü
       // ddMenu.selectByIndex(4);// ister bu şekilde kullan
       // ddMenu.selectByValue("search-alias=electronics");//ister bu şekilde
        ddMenu.selectByVisibleText("Elektronik");//istersen bu şekilde

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        BekleKapat();

    }
}
