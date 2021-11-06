package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.getXls;

public class XlsFileTest {

    @Test
    void xlsCellTest() throws IOException {
        String xlsFilePath = "./src/test/resources/xls-test.xlsx";
        String expectedData = "Александрова Ксения Евгеньевна";

        XLS xls = getXls(xlsFilePath);
        System.out.println("");
        String actualData = xls.excel.getSheetAt(1).getRow(2).getCell(1).toString();
        assertThat(actualData, containsString(expectedData));
    }
}
