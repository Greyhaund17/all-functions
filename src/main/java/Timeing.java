import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Timeing {
    @Test
    public void testSearchGoogle() {
        WebDriver driver = new ChromeDriver();
        // driver.navigate().to("http://next.privat24.ua/");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // WebElement wait=new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.
        //         presenceOfElementLocated(By.xpath("//button[@data-qa-node='login']")));
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://next.privat24.ua/money-transfer/card?lang=en");
        WebElement addComment = wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//span[@class='commentToggler_Jy6hnlSrFB']")));
        addComment.click();
        WebElement commentField = wait.until(ExpectedConditions.
                presenceOfElementLocated(By.xpath("//textarea[@data-qa-node='comment']")));
        WebElement closeElement = wait.until(ExpectedConditions.
                presenceOfElementLocated(By.xpath("//div[@title='Close']")));
        closeElement.click();
        Assert.assertTrue(wait.until(ExpectedConditions.stalenessOf(commentField)));
    }
}
