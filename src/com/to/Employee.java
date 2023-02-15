package com.to;

/**
 *
 * @author udithal
 */
public class Employee {
    private int empId;
    private String empName;

    public Employee() {
        System.out.println("Default Con Called");
    }

    public Employee(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
        System.out.println("Para Con Called");
    }
    
    

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + '}';
    }
    
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        System.out.println("Setting EmpId called");
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        System.out.println("Setting Empname called");
        this.empName = empName;
    }
    
}
