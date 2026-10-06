package Services;

import Model.Department;
import Model.ModelInterface;
import Repository.DepartmentRepository;
import Repository.RepositoryInterface;

public class DepartmentService extends ServiceInterfaceImpl<Department>{
    public DepartmentService(){
        super(new DepartmentRepository());
    }

}
