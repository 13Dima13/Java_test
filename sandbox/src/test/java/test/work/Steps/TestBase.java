package test.work.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeMethod
    public void setUp() throws Exception {
        browser();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    private void browser() {
        wd = new InternetExplorerDriver();
    }

    public void logoff() {
        logout();
    }

    private void logout() {
        wd.findElement(By.linkText("Log Off")).click();
    }

    public void login(String login, String password) {
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

    public void explorerSite() {
        gotoTechModel();
        gotoGuidingGroup();
        gotoAreaMapping();
        gotoCompanyUsers();
        gotoTestSample();
        gotoRepairshopGroup();
        gotoReportTab();
        gotoAdminTab();
    }

    private void gotoAdminTab() {
        wd.findElement(By.id("lnkAdministration")).click();
    }

    private void gotoReportTab() {
        wd.findElement(By.id("lnkReporting")).click();
    }

    private void gotoRepairshopGroup() {
        wd.findElement(By.id("lnkRepairshopGroup")).click();
    }

    private void gotoTestSample() {
        wd.findElement(By.id("lnkSampling")).click();
    }

    private void gotoCompanyUsers() {
        wd.findElement(By.id("lnkCompanyUsers")).click();
    }

    private void gotoAreaMapping() {
        wd.findElement(By.id("lnkAreaMapping")).click();
    }

    private void gotoGuidingGroup() {
        wd.findElement(By.linkText("Guiding Groups")).click();
    }

    private void gotoTechModel() {
        wd.findElement(By.id("lnkTechnicalModel")).click();
    }

    @AfterMethod
    public void tearDown() {
        stop();
    }

    private void stop() {
        wd.quit();
    }
}
