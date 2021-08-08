package az.cbar.service.parser;

import az.cbar.model.ValCurs;
import az.cbar.model.ValType;
import az.cbar.service.parser.BaseParser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class JaxBParser implements BaseParser<ValType> {
    public static final String URL = "https://www.cbar.az/currencies/"
            + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ".xml";

    @Override
    public List<ValType> parse() {
        ValCurs valCurs = new ValCurs();
        try {

            URL url = new URL(URL);
            JAXBContext context = JAXBContext.newInstance(ValCurs.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            valCurs = (ValCurs) unmarshaller.unmarshal(url);

        } catch (MalformedURLException | JAXBException e) {
            e.printStackTrace();
        }
        return valCurs.getValType();
    }
}
