package classroom.csv;

import java.util.ArrayList;
import java.util.List;

public abstract class ExcelTable {
    private static List<ArrayList> arrayTable;

    public static void addUser(String firstName, String lastName, String age){
        ArrayList<String> newUser = new ArrayList<>();
        newUser.add(firstName);
        newUser.add(lastName);
        newUser.add(age);
        arrayTable.add(newUser);
    }
    public static void initial(String inFile){
         arrayTable = FileUtils.read(inFile);
    }
    public static List<ArrayList> get(){
        return arrayTable;
    }
}
