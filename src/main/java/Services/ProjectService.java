package Services;

import Model.Project;
import Repository.ProjectRepository;

public class ProjectService extends ServiceInterfaceImpl<Project> {
    public ProjectService(){
        super(new ProjectRepository());
    }
}
