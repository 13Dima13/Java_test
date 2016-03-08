package ua.stqa.test.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.stqa.test.addressbook.model.InfoContacts;

public class ContactHelper extends BaseHelper {
  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void addNewButton() {
    click(By.linkText("add new"));
  }

  public void addNew() {
    click(By.name("submit"));
  }

  public void openHomePage() {
    click(By.linkText("home page"));
  }

  public void fillinAllInfo(InfoContacts infoContact) {
    type(By.name("firstname"), infoContact.getName());
    type(By.name("middlename"), infoContact.getMiddle());
    type(By.name("lastname"), infoContact.getLastname());
    type(By.name("nickname"), infoContact.getNickname());
    type(By.name("title"), infoContact.getTitle());
    type(By.name("company"), infoContact.getCompany());
  }
}
