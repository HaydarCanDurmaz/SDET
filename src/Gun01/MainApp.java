package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = (WebDriver) new EdgeDriver();
        //WebDriver driver = new SafariDriver();

        driver.get("https://www.google.com");
    }
}
