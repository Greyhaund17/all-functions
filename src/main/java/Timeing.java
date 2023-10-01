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
        //aknhayt voch aknhat spasumner
        // driver.navigate().to("http://next.privat24.ua/");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // WebElement wait=new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.
        //         presenceOfElementLocated(By.xpath("//button[@data-qa-node='login']")));
       /* elementi gortsoxutyunic hetoyva avart@
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
        Assert.assertTrue(wait.until(ExpectedConditions.stalenessOf(commentField)));*/
        //Clicki mas@ chi stacvum noric piti porcvi
        // codei imast@ naya vor haskanas te button@ erb vor erevuma grtsoxutyunic heto hiddena linum et shamanak
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/hidden");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame_examples");
        WebElement buttonOk = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.cssSelector("#okButton")));
        buttonOk.click();
        WebElement textWelcome = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("(//div[@class='panel']/h1)[2]")));
        Assert.assertEquals("Thanks!",textWelcome.getText());
    }
}
