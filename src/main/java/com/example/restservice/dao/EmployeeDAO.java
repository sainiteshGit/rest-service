package com.example.restservice.dao;
import org.springframework.stereotype.Repository;
import com.example.restservice.model.Employees;
import com.example.restservice.model.Employee;
/*Employee DAO Class */
@Repository
public class EmployeeDAO {
    private static Employees list=new Employees();
    static{
        list.getEmployeeList().add(new Employee(1,"firstname1","lastname1","email123"));
        list.getEmployeeList().add(new Employee(1,"firstname12","lastname12","email1234"));
        list.getEmployeeList().add(new Employee(1,"firstname13","lastname13","email33"));
        list.getEmployeeList().add(new Employee(1,"firstname14","lastname14","email43"));
    }

    public Employees getAllEmployees(){
        return list;
    }
    public void addEmployee(Employee employee){
        list.getEmployeeList().add(employee);
    }
}
