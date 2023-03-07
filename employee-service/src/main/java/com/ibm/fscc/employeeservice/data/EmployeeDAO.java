package com.ibm.fscc.employeeservice.data;

import com.ibm.fscc.employeeservice.data.EmployeeStorage;

import org.springframework.stereotype.Repository;
// Importing the employees class to
// use the defined properties
// in this class

@Repository

// Class to create a list
// of employees

public class EmployeeDAO {

    private static EmployeeStorage list = new EmployeeStorage();

    // This static block is executed
    // before executing the main
    // block

    static {

        // Creating a few employees
        // and adding them to the list
        list.getEmployeeList().add(
                new EmployeeEntity(28573833, "Burnhard", "Damara", "Pocatello", "Idaho", "613 Kings Terrace", 83206,
                        04072000, 4181233456L));

    }

    // Method to return the list
    public EmployeeStorage getAllEmployees() {

        return list;
    }

    // Method to add an employee
    // to the employees list
    public void addEmployee(EmployeeEntity employee) {
        list.getEmployeeList()
                .add(employee);

    }

}