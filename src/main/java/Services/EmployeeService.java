package Services;

import Model.Employee;
import Repository.EmployeeRepository;

public class EmployeeService extends ServiceInterfaceImpl<Employee> {
    public EmployeeService(){
        super(new EmployeeRepository());
    }
}
