import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Newest {
    @Test
    public void main() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://vega.am/am/aowdio-video-tekhnika/herhowstatsowytsner/");
        driver.manage().window().maximize();
        // WebElement main = driver.findElement(By.id("mfilter-opts-attribs-45-manufacturers-15"));
        // main.click();
        if (!driver.findElement(By.id("mfilter-opts-attribs-45-manufacturers-1491")).isSelected())
            driver.findElement(By.id("mfilter-opts-attribs-45-manufacturers-1491")).click();


        //  WebElement main3 = driver.findElement(By.id("mfilter-opts-attribs-45-manufacturers-80"));
        //  main3.click();
        // System.out.println(driver.findElement(By.id("mfilter-opts-attribs-45-manufacturers-80")).isSelected());
        // boolean b = driver.findElement(By.id("mfilter-opts-attribs-45-manufacturers-1491")).isSelected();
        // System.out.println(b);

    }
}

