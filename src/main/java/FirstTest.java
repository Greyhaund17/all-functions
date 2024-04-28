import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FirstTest {
    @Test
    public void testSearchGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver.get("https://www.crazygames.com/");
        driver.navigate().to("https://www.crazygames.com/");
        driver.manage().window().maximize();
        Dimension d = new Dimension(1000, 1000);
        driver.manage().window().setSize(d);
        WebElement searchBox = driver.findElement(By.xpath("//li[@class='primeCarouselLi'][2]/div[@class='css-1ajq493']/a[@class='css-h13zhk'][1]"));
        WebElement searchBox1 = driver.findElement(By.cssSelector("#layoutMainWrapper > div > div:nth-child(2) > div.prime-carousel.css-1nehx92 > ul > li:nth-child(1) > a > img"));
        searchBox.click();
        sleep(3000);
        driver.get("https://www.crazygames.com/");
        WebElement searchBox3= driver.findElement(By.xpath("//li[@class='primeCarouselLi'][2]/div[@class='css-1ajq493']/a[@class='css-h13zhk'][2]"));
        searchBox3.click();
        sleep(3000);
        driver.manage().window().fullscreen();
        driver.get("https://www.crazygames.com/");
        WebElement searchBox4= driver.findElement(By.xpath("//li[@class='primeCarouselLi'][2]/div[@class='css-1ajq493']/a[@class='css-h13zhk'][3]"));
        searchBox4.click();
        sleep(3000);
        // driver.get("https://www.crazygames.com/");

    }
    }

