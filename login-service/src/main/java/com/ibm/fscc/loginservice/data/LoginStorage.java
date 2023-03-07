package com.ibm.fscc.loginservice.data;
import java.util.ArrayList;
import java.util.List;
  
// Class to store the list of
// all the login credentials of the employees in an
// Array List

public class LoginStorage {
    private List<LoginEntity> loginList;
  
    // Method to return the list
    // of employees
    public List<LoginEntity> getLoginList()
    {
  
        if (loginList == null) {
  
            loginList
                = new ArrayList<>();
  
                   
        }
  
        return loginList;
  
           
    }
  
    public void
    setEmployeeList(
        List<LoginEntity> loginList)
    {
        this.loginList
            = loginList;
    }

}
