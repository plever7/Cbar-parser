package az.cbar.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EntityManagerImpl {
    private final EntityManager  entityManager;
    private final EntityTransaction  entityTransaction;

    private static final EntityManagerImpl ENTITY_MANAGER = new EntityManagerImpl();

    private EntityManagerImpl() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CbarPersistenceUnit");
        this.entityManager = entityManagerFactory.createEntityManager();
        this.entityTransaction = entityManager.getTransaction();

    }

    public static EntityManager getEntityManager() {
        return ENTITY_MANAGER.entityManager;
    }

    public static EntityTransaction getTransaction() {
        return ENTITY_MANAGER.entityTransaction;
    }


}
