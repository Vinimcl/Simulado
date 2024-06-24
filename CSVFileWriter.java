import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVFileWriter {

    public void writeCSV(String filename, List<String[]> lines) {
        try (FileWriter fw = new FileWriter(filename)) {
            for (String[] values : lines) {
                for (int i = 0; i < values.length; i++) {
                    fw.append(values[i]);
                    if (i < values.length - 1) {
                        fw.append(",");
                    }
                }
                fw.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
