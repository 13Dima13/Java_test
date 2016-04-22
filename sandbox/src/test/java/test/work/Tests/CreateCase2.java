package test.work.Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateCase2 {
        FirefoxDriver wd;

        @BeforeMethod
        public void setUp() throws Exception {
            wd = new FirefoxDriver();
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

        @Test
        public void caseCreate() {
            wd.get("https://eca-temp01.spcph.local/EasyclaimsVBI/login/login.aspx?ReturnUrl=%2fEasyclaimsVBI");
            wd.findElement(By.id("txtUser")).click();
            wd.findElement(By.id("txtUser")).clear();
            wd.findElement(By.id("txtUser")).sendKeys("tchc");
            wd.findElement(By.id("txtPass")).click();
            wd.findElement(By.id("txtPass")).clear();
            wd.findElement(By.id("txtPass")).sendKeys("1");
            wd.findElement(By.id("Button1")).click();
            wd.findElement(By.linkText("Cases")).click();
            wd.findElement(By.id("postalCode")).click();
            wd.findElement(By.id("postalCode")).clear();
            wd.findElement(By.id("postalCode")).sendKeys("2605");
            wd.findElement(By.cssSelector("button.btn.btn-info")).click();
            wd.findElement(By.linkText("Claim details")).click();
            wd.findElement(By.id("claimNo")).click();
            wd.findElement(By.id("claimNo")).clear();
            wd.findElement(By.id("claimNo")).sendKeys("12345");
            wd.findElement(By.id("policyNo")).click();
            wd.findElement(By.id("policyNo")).clear();
            wd.findElement(By.id("policyNo")).sendKeys("4321");
            wd.findElement(By.xpath("//span[@class='input-group-btn']/button")).click();
            wd.findElement(By.xpath("//td[@id='datepicker-00R-1834-25']//button[.='21']")).click();
            if (!wd.findElement(By.xpath("//div[@class='transclude-container']/div/div[2]/div/div/div[5]/div/select//option[1]")).isSelected()) {
                wd.findElement(By.xpath("//div[@class='transclude-container']/div/div[2]/div/div/div[5]/div/select//option[1]")).click();
            }
            if (!wd.findElement(By.id("damageZone1")).isSelected()) {
                wd.findElement(By.id("damageZone1")).click();
            }
            if (!wd.findElement(By.id("damageZone3")).isSelected()) {
                wd.findElement(By.id("damageZone3")).click();
            }
            if (!wd.findElement(By.id("damageZone5")).isSelected()) {
                wd.findElement(By.id("damageZone5")).click();
            }
            wd.findElement(By.id("courseOfEvents")).click();
            wd.findElement(By.id("courseOfEvents")).clear();
            wd.findElement(By.id("courseOfEvents")).sendKeys("events");
            wd.findElement(By.linkText("Customer information")).click();
            wd.findElement(By.id("customerNo")).click();
            wd.findElement(By.id("customerNo")).clear();
            wd.findElement(By.id("customerNo")).sendKeys("1234567");
            wd.findElement(By.id("firstName")).click();
            wd.findElement(By.id("firstName")).clear();
            wd.findElement(By.id("firstName")).sendKeys("Hello");
            wd.findElement(By.id("lastName")).click();
            wd.findElement(By.id("lastName")).clear();
            wd.findElement(By.id("lastName")).sendKeys("Moto");
            wd.findElement(By.id("street1")).click();
            wd.findElement(By.id("street1")).clear();
            wd.findElement(By.id("street1")).sendKeys("Street");
            wd.findElement(By.id("street2")).click();
            wd.findElement(By.id("street2")).clear();
            wd.findElement(By.id("street2")).sendKeys("2");
            wd.findElement(By.name("zipCode")).click();
            wd.findElement(By.name("zipCode")).clear();
            wd.findElement(By.name("zipCode")).sendKeys("2605");
            wd.findElement(By.id("city")).click();
            wd.findElement(By.id("city")).sendKeys("\\9");
            wd.findElement(By.id("city")).click();
            wd.findElement(By.id("city")).clear();
            wd.findElement(By.id("city")).sendKeys("Moscow");
            wd.findElement(By.id("phone")).click();
            wd.findElement(By.id("phone")).clear();
            wd.findElement(By.id("phone")).sendKeys("12332111");
            wd.findElement(By.id("email")).click();
            wd.findElement(By.id("email")).clear();
            wd.findElement(By.id("email")).sendKeys("test@t.com");
            wd.findElement(By.id("serviceLevel")).click();
            wd.findElement(By.id("serviceLevel")).clear();
            wd.findElement(By.id("serviceLevel")).sendKeys("A");
            wd.findElement(By.id("comments")).click();
            wd.findElement(By.id("comments")).clear();
            wd.findElement(By.id("comments")).sendKeys("comments");
            wd.findElement(By.linkText("Vehicle details")).click();
            wd.findElement(By.id("regNo")).click();
            wd.findElement(By.id("regNo")).clear();
            wd.findElement(By.id("regNo")).sendKeys("Java123");
            if (!wd.findElement(By.xpath("//div[@class='transclude-container']/div/div[4]/div/div/div[2]/div[1]/select//option[61]")).isSelected()) {
                wd.findElement(By.xpath("//div[@class='transclude-container']/div/div[4]/div/div/div[2]/div[1]/select//option[61]")).click();
            }
            wd.findElement(By.name("model")).click();
            wd.findElement(By.name("model")).clear();
            wd.findElement(By.name("model")).sendKeys("Citigo");
            wd.findElement(By.id("year")).click();
            wd.findElement(By.id("year")).clear();
            wd.findElement(By.id("year")).sendKeys("2009");
            wd.findElement(By.linkText("Select repair shop")).click();
            wd.findElement(By.id("btnFinish")).click();
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


