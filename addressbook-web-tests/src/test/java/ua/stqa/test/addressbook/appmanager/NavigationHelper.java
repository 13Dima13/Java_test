package ua.stqa.test.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
  FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    private FirefoxDriver wd;
  }

  public void gotoGroupPage() {wd.findElement(By.linkText("groups")).click();
  }
}
