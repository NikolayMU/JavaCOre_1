package JavaCore_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test{

public static void main(String args[]){

    // создание  тестового csv файла
    try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

        StringBuilder sb = new StringBuilder();
        sb.append("Value_1");
        sb.append(';');
        sb.append("Value_2");
        sb.append(';');
        sb.append("Value_3");
        sb.append('\n');

        sb.append("100");
        sb.append(';');
        sb.append("200");
        sb.append(';');
        sb.append("123");
        sb.append('\n');

        sb.append("300");
        sb.append(';');
        sb.append("400");
        sb.append(';');
        sb.append("500");
        sb.append('\n');

        writer.write(sb.toString()); //записываем тексовое содержимое в поток
        writer.close();              // close навсегда закрывает поток
        System.out.println();

        } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
        }
        Test testCSV =  new Test();
        testCSV.readCSVFile();
        }
    // созданный метод для чтения содержимого файла
public void readCSVFile(){
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("test.csv"));) {
        while (scanner.hasNextLine()) {
        records.add(getRecordFromLine(scanner.nextLine()));
        }
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
        System.out.println(records.toString());
        }
private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
        rowScanner.useDelimiter(",");
        while (rowScanner.hasNext()) {
        values.add(rowScanner.next());
        }
        }
        return values;
        }

        }