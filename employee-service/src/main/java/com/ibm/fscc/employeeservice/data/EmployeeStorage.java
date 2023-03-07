package com.ibm.fscc.employeeservice.data;
import java.util.ArrayList;
import java.util.List;
  
// Class to store the list of
// all the employees in an
// Array List
public class EmployeeStorage {
    
    private List<EmployeeEntity> employeeList;
  
    // Method to return the list
    // of employees
    public List<EmployeeEntity> getEmployeeList()
    {
  
        if (employeeList == null) {
  
            employeeList
                = new ArrayList<>();
  
                   
        }
  
        return employeeList;
  
           
    }
  
    public void
    setEmployeeList(
        List<EmployeeEntity> employeeList)
    {
        this.employeeList
            = employeeList;
    }
}
