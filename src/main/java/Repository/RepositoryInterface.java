package Repository;
import jakarta.persistence.*;
import Model.ModelInterface;

public interface RepositoryInterface<T extends ModelInterface> {
     EntityManagerFactory emf=Persistence.createEntityManagerFactory("default");
     EntityManager em= emf.createEntityManager();
    EntityTransaction et= em.getTransaction();

    default void create(T model){
        et.begin();
        em.persist(model);
        et.commit();
    }
    default T read(Class<T> clazz,int id){

        return em.find(clazz,id);
    }
    default boolean update(T newModel){
        et.begin();
        em.merge(newModel);
        et.commit();
        return em.contains(newModel);
    }
    default void delete(Class<T> clazz, int id){
        T model= em.find(clazz,id);
        et.begin();
        em.remove(model);
        et.commit();

    }
    default boolean isExists(Class<T> clazz, int id){
        T model = em.find(clazz,id);
        if (model!=null)
            return true;
        else
            return false;

    }

}
