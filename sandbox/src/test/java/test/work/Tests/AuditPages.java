package test.work.Tests;

import org.testng.annotations.Test;
import test.work.Steps.TestBase;

public class AuditPages extends TestBase {


    @Test
    public void testCheckPages() {
        login("alka_admin", "4r3e2w1q!", "username", "password");
        explorerSite();
        logoff();
    }

}
