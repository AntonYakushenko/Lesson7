package tests;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;

public class CsvFileTest {

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/csv-test.csv";
        String expectedData = "hello csv";

        String actualData = readTextFromPath(csvFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
