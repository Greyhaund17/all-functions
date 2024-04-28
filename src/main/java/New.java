import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class New {

    @Test
    public void serachSomething() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        WebElement find=driver.findElement(By.name("q"));
        find.sendKeys("https://stage.beachbodyondemand.com/");
        find.submit();
        WebElement click=driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > " +
                "div > div > div.yuRUbf > div > span > a"));
        click.click();
        driver.manage().window().maximize();
        WebElement login=driver.findElement(By.cssSelector("#unification-topNav > div > div > " +
                "header > div.topNavAccountStyled__MenuOptions-sc-1oihx9h-0.lodnEd > " +
                "div.navLinkStyled__Container-sc-1e44kdy-2.brumlx > a"));
        login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        boolean display=driver.findElement(By.cssSelector("#unification-topNav > div > div > " +
//                "header > div.topNavAccountStyled__MenuOptions-sc-1oihx9h-0.lodnEd > " +
//                "div.navLinkStyled__Container-sc-1e44kdy-2.brumlx > a")).isDisplayed();
//        System.out.println("display " + display);
        WebElement email=driver.findElement(By.id("capture_signIn_signInEmailAddress"));
        email.sendKeys("chesterfild@yopmail.com");
        WebElement pass=driver.findElement(By.id("capture_signIn_currentPassword"));
        pass.sendKeys("Beach1234");
        WebElement signin=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        signin.submit();
        WebElement x=driver.findElement(By.xpath("(//div[@class='ReactModalPortal'])[2]"));
        x.click();

    }
}
