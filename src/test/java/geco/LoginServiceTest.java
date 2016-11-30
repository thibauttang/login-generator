package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thibauttang on 30/11/2016.
 */

public class LoginServiceTest {

    LoginService loginService;

    @Before
    public void setUp() {
        String [] loginsExistants = {"Choupie", "Titoune"};
        loginService = new LoginService(loginsExistants);
    }

    @Test
    public void testLoginExists() {
        Assert.assertTrue(loginService.loginExists("Choupie"));
    }

    @Test
    public void testAddLogin() {
        loginService.addLogin("Zazoue");
        Assert.assertTrue(loginService.loginExists("Zazoue"));
    }

    @Test
    public void testfindAllLoginsStartingWith() {
        List<String> allLoginStartingWith = loginService.findAllLoginsStartingWith("C");
        Assert.assertEquals("Choupie", allLoginStartingWith.get(0));
    }

    @Test
    public void testFindAllLogins() {
        List<String> allLoginsExpected = new ArrayList<String>();
        allLoginsExpected.add("Choupie");
        allLoginsExpected.add("Titoune");
        Assert.assertEquals(allLoginsExpected, loginService.findAllLogins());
    }

}