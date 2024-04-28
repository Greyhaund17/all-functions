import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopap {
    @Test
    public void Alter() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://javascript.info/alert-prompt-confirm");
        //alert
        WebElement alertRun = driver.findElement(By.xpath("(//a[@data-action='run'])[1]"));
        alertRun.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alertRun.click();
        System.out.println("alert text " + alert.getText());
        alert.accept();
        //confirm
        WebElement confirmRun = driver.findElement(By.xpath("(//a[@data-action='run'])[5]"));
        confirmRun.click();
        Alert confirm = driver.switchTo().alert();
        confirm.dismiss();
        confirm.accept();
 //prompt
        WebElement promptRun = driver.findElement(By.xpath("(//a[@data-action='run'])[2]"));
        promptRun.click();
        Alert prompt=driver.switchTo().alert();
        prompt.sendKeys("17");
        prompt.accept();
        prompt.accept();
    }
}
