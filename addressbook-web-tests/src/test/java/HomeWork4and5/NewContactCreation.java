package HomeWork4and5;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ua.stqa.test.addressbook.tests.TestBase;

public class NewContactCreation extends TestBase{

  @Test
  public void newContactCreation() {
    addNewButton();
    fillinAllInfo(new InfoContact("Name", "aka", "LastName", "SDA", "MMM", "HOME"));
    addNew();
    openHomePage();
    logOut();
  }

}
