package az.cbar.dao.impl;


import az.cbar.dao.CurrencyDao;
import az.cbar.entity.Currency;


import java.util.List;

import static az.cbar.dao.impl.EntityManagerImpl.*;


public class CurrencyDaoImpl implements CurrencyDao {

    @Override
    public List<az.cbar.entity.Currency> findAll() {
        return null;
    }

    @Override
    public Currency findById(Integer id) {
        return getEntityManager().find(Currency.class, id);
    }
}
