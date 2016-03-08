package ua.stqa.test.addressbook.appmanager;


import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseHelper {
  protected FirefoxDriver wd;

  public BaseHelper(FirefoxDriver wd) {
    this.wd = wd;
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
