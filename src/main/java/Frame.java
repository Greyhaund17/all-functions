import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Frame {
    @Test
    public void iFrame() {
        //iframei meji texti stugum
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://next.privat24.ua/?lang=en");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement loginButton = wait.until(ExpectedConditions.
        //         presenceOfElementLocated(By.xpath("//button[@data-qa-node='login']")));
        // loginButton.click();
        // WebElement authFrame = wait.until(ExpectedConditions.
        //         presenceOfElementLocated(By.xpath("//iframe[@src='https://login-widget.privat24.ua/']")));
        // driver.switchTo().frame(authFrame);
        // WebElement buttonContinue = wait.until(ExpectedConditions.
        //         presenceOfElementLocated(By.xpath("//button[@class='sc-kFCsca koEmTd']")));
        // buttonContinue.click();
        // boolean b = driver.findElement(By.xpath("//div[@class='sc-ldgPui fGaNhl']")).isDisplayed();
        // System.out.println(b);
        //iframei mej text avelacnel
        driver.navigate().to("https://jsbin.com/kepewumoha/edit?html,output");
        WebElement mainFrame = wait.until(ExpectedConditions.
                presenceOfElementLocated(By.xpath("//iframe[@class='stretch']")));
        driver.switchTo().frame(mainFrame);
        WebElement secondFrame=wait.until(ExpectedConditions.
                presenceOfElementLocated(By.xpath("//iframe[@name='JS Bin Output ']")));
        driver.switchTo().frame(secondFrame);
        WebElement inputField = wait.until(ExpectedConditions.
                presenceOfElementLocated(By.xpath("//input[@id='SeleniumId']")));
        inputField.sendKeys("99");
    }
}
