package test.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExplorerAudit {
    WebDriver wd;

    protected void explorerSite() {
        wd.findElement(By.id("lnkTechnicalModel")).click();
        wd.findElement(By.linkText("Guiding Groups")).click();
        wd.findElement(By.id("lnkAreaMapping")).click();
        wd.findElement(By.id("lnkCompanyUsers")).click();
        wd.findElement(By.id("lnkSampling")).click();
        wd.findElement(By.id("lnkRepairshopGroup")).click();
        wd.findElement(By.id("lnkReporting")).click();
        wd.findElement(By.id("lnkAdministration")).click();
    }
}
