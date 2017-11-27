package classroom.csv;

import java.io.*;
import java.util.ArrayList;

public abstract class FileUtils {

    public static ArrayList<ArrayList> read(String fileName) {
        ArrayList<ArrayList> array = new ArrayList<>();
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                ArrayList<String> splitArrayList = new ArrayList<>();
                String[] splitArray = line.split(cvsSplitBy);
                for (String s : splitArray) {
                    splitArrayList.add(s);
                }
                array.add(splitArrayList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    public static void write(String fileName, String textToFile) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }
            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                //Записываем текст у файл
                out.print(textToFile);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void print(ArrayList<ArrayList> array) {
        ArrayList<String> arrayList;

        for (int i = 0; i < array.size(); i++) {
            arrayList = array.get(i);
            for (int j = 0; j < arrayList.size(); j++) {
                System.out.print("("+i+":"+j+")" + arrayList.get(j) + "\t");
            }
            System.out.println();
        }
    }

}
