package test.work;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class alkaAudit extends ExplorerAudit {

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new InternetExplorerDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void testAlkaAudit() {
        login("alka_admin", "4r3e2w1q!");
        explorerSite();
        logoff();
    }

    private void logoff() {
        wd.findElement(By.linkText("Log Off")).click();
    }

    private void login(String login, String password) {
        wd.get("http://eca-dev01.spcph.local/Audit_dgv/");
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys(login);
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("password")).sendKeys(password);
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys("alka_admin");
        wd.findElement(By.xpath("//div[@id='content']/center/fieldset/table/tbody/tr[6]/td[2]/input")).click();
        wd.findElement(By.id("content")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
