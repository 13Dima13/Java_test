package ua.stqa.test.addressbook.tests;

import ua.stqa.test.addressbook.model.InfoContact;
import org.testng.annotations.Test;

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
