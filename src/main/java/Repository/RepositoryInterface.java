package Repository;

import Model.ModelInterface;

public interface RepositoryInterface<T extends ModelInterface> {
    default int create(T model){
        return 0;
    }
    default int read(T model){
    return 0;
    }
    default int update(T model){
        return 0;
    }
    default int delete(T model){
        return 0;
    }

}
