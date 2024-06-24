import java.util.ArrayList;
import java.util.List;

public class CSVProcessor {

    public List<String[]> processCSVFiles(List<String[]> dataA, List<String[]> dataB) {
        List<String[]> result = new ArrayList<>();

        // Exemplo de processamento simples: concatenar linhas correspondentes de A e B
        int size = Math.min(dataA.size(), dataB.size());
        for (int i = 0; i < size; i++) {
            String[] lineA = dataA.get(i);
            String[] lineB = dataB.get(i);
            String[] newLine = new String[lineA.length + lineB.length];
            
            System.arraycopy(lineA, 0, newLine, 0, lineA.length);
            System.arraycopy(lineB, 0, newLine, lineA.length, lineB.length);
            
            result.add(newLine);
        }

        return result;
    }
}
