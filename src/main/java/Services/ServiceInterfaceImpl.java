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

    public boolean create(T model){
        if(db.isExists(model))
            return false;
        else db.create(model);
        return true;
    }

    public T find (Class<T> clazz , int id){
        return db.read(clazz,id);
    }
//                -->ItDoesntHaveSpecificValueSoItDeclaredInRepoService(_:SORRYBOILERPLATE:_)
    public boolean update(T newModel){
        return db.update(newModel);
    }
    public boolean delete(T model){
        db.delete(model);
        if(db.isExists(model))
            return false;
        else
            return true;
    }

}
