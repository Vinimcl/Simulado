import java.util.List;

public class Main {

    public static void main(String[] args) {
        CSVFileReader reader = new CSVFileReader();
        CSVFileWriter writer = new CSVFileWriter();
        CSVProcessor processor = new CSVProcessor();

        // Ler arquivos A e B
        List<String[]> dataA = reader.readCSV("A.csv");
        List<String[]> dataB = reader.readCSV("B.csv");

        // Processar os dados para obter o resultado em C
        List<String[]> dataC = processor.processCSVFiles(dataA, dataB);

        // Escrever resultado em C.csv
        writer.writeCSV("C.csv", dataC);

        System.out.println("Arquivo C.csv gerado com sucesso.");
    }
}
