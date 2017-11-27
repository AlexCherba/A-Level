package classroom.csv;

import java.util.ArrayList;

public abstract class ExcelTable {
    private static ArrayList<ArrayList> arrayTable;

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
    public static ArrayList<ArrayList> get(){
        return arrayTable;
    }
}
