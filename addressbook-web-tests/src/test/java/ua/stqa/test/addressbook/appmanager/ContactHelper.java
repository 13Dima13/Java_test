package ua.stqa.test.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.stqa.test.addressbook.model.InfoContacts;

public class ContactHelper {

  FirefoxDriver wd;

  public ContactHelper (FirefoxDriver wd) {

    this.wd = wd;
  }

  public void addNewButton() {
      wd.findElement(By.linkText("add new")).click();
  }

  public void addNew() {
      wd.findElement(By.name("submit")).click();
  }

  public void openHomePage() {
      wd.findElement(By.linkText("home page")).click();
  }

  public void fillinAllInfo(InfoContacts infoContact) {
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
}
