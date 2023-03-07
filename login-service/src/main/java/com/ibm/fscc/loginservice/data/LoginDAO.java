package com.ibm.fscc.loginservice.data;

import com.ibm.fscc.loginservice.data.LoginStorage;
import org.springframework.stereotype.Repository;
// Importing the LoginStorage class to
// use the defined properties
// in this class

@Repository

// Class to create a list
// of login credentials for employees

public class LoginDAO {
    private static LoginStorage list = new LoginStorage();

    // This static block is executed
    // before executing the main
    // block

    static {

        // Creating a few login credentials of employees
        // and adding them to the list
        list.getLoginList().add(
                new LoginEntity("bmatsell7@marriott.com", "yIsZtjCr", "aswindley"));

        list.getLoginList().add(new LoginEntity("ccaitlin5@mapquest.com", "Smz1Ty", "bchastand5"));

        list.getLoginList().add(new LoginEntity("cdewane4@nydailynews.com", "41bLkmTMvM", "cdelaperrelle4"));
        list.getLoginList().add(new LoginEntity("jdowers9@pbs.org", "AXuOOJQWjFB8", "gkondratowicz9"));
        list.getLoginList().add(new LoginEntity("kcawdronk@ed.gov", "PAkJSfz", "ctadronker85"));
    }

    // Method to return the list of logins
    public LoginStorage getAllLogins() {

        return list;
    }

    // Method to add an login
    // to the login credential list
    public void addLogin(LoginEntity login) {
        list.getLoginList()
                .add(login);

    }

}
