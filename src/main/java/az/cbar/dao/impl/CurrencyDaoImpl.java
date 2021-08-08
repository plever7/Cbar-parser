package az.cbar.dao.impl;


import az.cbar.dao.CurrencyDao;
import az.cbar.entity.Currency;


import java.util.List;

import static az.cbar.dao.impl.EntityManagerImpl.*;


public class CurrencyDaoImpl implements CurrencyDao {

    @Override
    public List<az.cbar.entity.Currency> findAll() {
//        try {
//            List list = new ArrayList();
//            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
//            EntityManager entityManager = entityManagerFactory.createEntityManager();
//            return entityManager.createQuery("select e from EmployeeEntity e").getResultList();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        return null;

    }

    @Override
    public Currency findById(Integer id) {
        return getEntityManager().find(Currency.class, id);
    }
}
