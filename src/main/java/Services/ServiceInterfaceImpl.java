package Services;

import Model.ModelInterface;
import Repository.RepositoryInterface;
import jakarta.persistence.*;

public class ServiceInterfaceImpl<T extends ModelInterface>{
    private final RepositoryInterface<T>db;
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
    private EntityManager em = emf.createEntityManager();


    public ServiceInterfaceImpl(RepositoryInterface<T> repository){
        this.db= repository;
    }

    public void create(T model){
    db.create(model);
    }

    public T find (Class<T> clazz , int id){
        return db.read(clazz,id);
    }
//                -->ItDoesntHaveSpecificValueSoItDeclaredInRepoService(_:SORRYBOILERPLATE:_)
    public boolean update(T newModel){
        return db.update(newModel);
    }


    public boolean delete(Class<T> clazz, int id){
        db.delete(clazz,id);
        if(db.isExists(clazz,id))
            return false;
        else
            return true;
    }

}
