import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    public List<String[]> readCSV(String filename) {
        List<String[]> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                lines.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
