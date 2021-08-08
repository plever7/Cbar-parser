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
        ValType valType = ((JaxBParser) baseParser).getValutes();
        BaseWriter<Valute> baseWriter = new DatabaseWriter();
        System.out.println(baseWriter.write(valType.getValute()));

    }

}
