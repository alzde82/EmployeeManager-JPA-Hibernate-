import jakarta.persistence.*;
import Model.*;
import Services.*;
import Repository.*;

import java.util.List;

public class Main {
public static void main(String [] args){
    DepartmentService ds = new DepartmentService();
    EmployeeService es= new EmployeeService();
    ProjectService ps = new ProjectService();
    Department d= new Department("dep1");
    Employee e= new Employee("nima");
    Project p = new Project("area51");
    e.setDepartment(d);
    d.setEmployee(List.of(e));
    e.setProject(List.of(p));
    p.setEmployee(List.of(e));
    es.create(e);
    es.delete(Employee.class,12);


    System.out.println("TestinAround");

}
}
