package ua.stqa.test.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.stqa.test.addressbook.model.InfoContacts;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  FirefoxDriver wd;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }

  public void fillinAllInfo(InfoContacts infoContact) {
      groupHelper.wd.findElement(By.name("firstname")).click();
      groupHelper.wd.findElement(By.name("firstname")).clear();
      groupHelper.wd.findElement(By.name("firstname")).sendKeys(infoContact.getName());
      groupHelper.wd.findElement(By.name("middlename")).click();
      groupHelper.wd.findElement(By.name("middlename")).clear();
      groupHelper.wd.findElement(By.name("middlename")).sendKeys(infoContact.getMiddle());
      groupHelper.wd.findElement(By.name("lastname")).click();
      groupHelper.wd.findElement(By.name("lastname")).clear();
      groupHelper.wd.findElement(By.name("lastname")).sendKeys(infoContact.getLastname());
      groupHelper.wd.findElement(By.name("nickname")).click();
      groupHelper.wd.findElement(By.name("nickname")).clear();
      groupHelper.wd.findElement(By.name("nickname")).sendKeys(infoContact.getNickname());
      groupHelper.wd.findElement(By.name("title")).click();
      groupHelper.wd.findElement(By.name("title")).clear();
      groupHelper.wd.findElement(By.name("title")).sendKeys(infoContact.getTitle());
      groupHelper.wd.findElement(By.name("company")).click();
      groupHelper.wd.findElement(By.name("company")).clear();
      groupHelper.wd.findElement(By.name("company")).sendKeys(infoContact.getCompany());
  }

  public void addNewButton() {
      groupHelper.wd.findElement(By.linkText("add new")).click();
  }

  public void addNew() {
      groupHelper.wd.findElement(By.name("submit")).click();
  }

  public void openHomePage() {
      groupHelper.wd.findElement(By.linkText("home page")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
