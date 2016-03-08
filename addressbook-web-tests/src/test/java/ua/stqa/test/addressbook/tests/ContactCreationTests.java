package ua.stqa.test.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.test.addressbook.model.InfoContacts;

public class ContactCreationTests extends TestBase {

    @Test
    public void newContactCreation() {
        app.addNewButton();
        app.fillinAllInfo(new InfoContacts("Name", "aka", "LastName", "SDA", "MMM", "HOME"));
        app.addNew();
        app.openHomePage();
    }
}