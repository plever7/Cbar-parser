package az.cbar.service.writer;

import az.cbar.dao.CurrencyDao;
import az.cbar.dao.impl.CurrencyDaoImpl;
import az.cbar.entity.Currency;
import az.cbar.model.Valute;

import java.math.BigDecimal;
import java.util.List;

public class DatabaseWriter implements BaseWriter<Valute> {

    @Override
    public List<Valute> write(List<Valute> valute) {
        CurrencyDao currencyDao = new CurrencyDaoImpl();
        valute.forEach(valute1 -> {
            Currency currency = new Currency();
            currency.setName(valute1.getName());
            currency.setNominal(valute1.getNominal());
            currency.setValue(new BigDecimal(String.valueOf(valute1.getValue())));
            currency.setCode(valute1.getCode());
            currencyDao.save(currency);
        });
        return valute;
    }

}
