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
    default void delete(T model){
        et.begin();
        em.remove(model);
        et.commit();

    }
    default boolean isExists(T model){
        return em.contains(model);
    }

}
