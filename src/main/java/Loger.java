import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.Set;

public class Loger {
    @Test
    public void testSearchGoogle() {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.crazygames.com/2222222");
        Set<String> allLogs=driver.manage().logs().getAvailableLogTypes();
        LogEntries logs=driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry: logs)
            System.out.println(entry);
    }
}
