package az.cbar;

import az.cbar.model.ValType;
import az.cbar.model.Valute;
import az.cbar.service.parser.BaseParser;
import az.cbar.service.parser.JaxBParser;
import az.cbar.service.writer.BaseWriter;
import az.cbar.service.writer.DatabaseWriter;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        BaseParser<ValType> baseParser = new JaxBParser();
        List<ValType> valTypes = baseParser.parse();
        ValType valType = valTypes.stream()
                .filter(valType1 -> valType1.getType().equals("Xarici valyutalar"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Specified currency not found!"));

        BaseWriter<Valute> baseWriter = new DatabaseWriter();
        baseWriter.write(valType.getValute());

    }


}
