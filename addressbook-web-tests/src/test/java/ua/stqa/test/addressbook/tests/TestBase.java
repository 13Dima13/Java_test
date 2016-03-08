package ua.stqa.test.addressbook.tests;


import ua.stqa.test.addressbook.model.InfoContact;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.stqa.test.addressbook.appmanager.ApplicationManager;

import java.util.concurrent.TimeUnit;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();
  FirefoxDriver wd;

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
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    login("http://localhost/addressbook/index.php", "secret", "admin");
  }

  private void login(String url, String password, String username) {
    wd.get(url);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  protected void fillinAllInfo(InfoContact infoContact) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(infoContact.getName());
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(infoContact.getMiddle());
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(infoContact.getLastname());
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(infoContact.getNickname());
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys(infoContact.getTitle());
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(infoContact.getCompany());
  }

  protected void addNewButton() {
    wd.findElement(By.linkText("add new")).click();
  }

  protected void addNew() {
    wd.findElement(By.name("submit")).click();
  }

  protected void openHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  protected void logOut() {
    wd.findElement(By.linkText("Logout")).click();
    wd.findElement(By.name("pass")).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }
}