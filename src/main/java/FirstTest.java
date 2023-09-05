import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void testSearchGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get("http://google.com");
        driver.navigate().to("http://google.com");
        String window= driver.getWindowHandle();
        System.out.println("window -> " + window);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Call of Duty");
        searchBox.submit();
        driver.manage().window().maximize();
    }
}
