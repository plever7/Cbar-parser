package az.cbar.dao;

import java.util.List;

import static az.cbar.dao.impl.EntityManagerImpl.*;

public interface CrudDao<T, ID> {

    List<T> findAll();

    T findById(ID id);

    default void save(T t) {
        getTransaction().begin();
        try {
            getEntityManager().persist(t);
        } catch (RuntimeException ex) {
            getTransaction().rollback();
        } finally {
            getTransaction().commit();
        }
    }

    default void update(T t) {
        getTransaction().begin();
        try {
            getEntityManager().merge(t);
        } catch (RuntimeException ex) {
            getTransaction().rollback();
        } finally {
            getTransaction().commit();
        }
    }

    default void delete(ID id) {

        getTransaction().begin();
        try {
            getEntityManager().remove(findById(id));
        } catch (RuntimeException ex) {
            getTransaction().rollback();
        } finally {
            getTransaction().commit();
        }
    }

}
