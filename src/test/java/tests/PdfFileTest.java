package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;


public class PdfFileTest {

    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/pdf-test.pdf";
        String expectedData = "Как скачать файл с помощью Selenide";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }
}
