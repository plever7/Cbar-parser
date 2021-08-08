package az.cbar;

import az.cbar.dao.CurrencyDao;
import az.cbar.dao.impl.CurrencyDaoImpl;
import az.cbar.entity.Currency;
import az.cbar.model.ValType;
import az.cbar.service.parser.BaseParser;
import az.cbar.service.parser.JaxBParser;
import az.cbar.service.writer.BaseWriter;
import az.cbar.service.writer.DatabaseWriter;


import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

import static az.cbar.dao.impl.EntityManagerImpl.getEntityManager;
import static az.cbar.dao.impl.EntityManagerImpl.getTransaction;

public class Main {
    @Transactional
    public static void main(String[] args) {
        BaseParser<ValType> baseParser = new JaxBParser();
        List<ValType> valTypes = baseParser.parse();
        ValType valType = valTypes.stream()
                .filter(valType1 -> valType1.getType().equals("Xarici valyutalar"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Specified currency not found!"));
        CurrencyDao currencyDao = new CurrencyDaoImpl();

        BaseWriter baseWriter = new DatabaseWriter();
        baseWriter.write(valType.getValute());


    }


}
