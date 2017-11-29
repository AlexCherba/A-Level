package classroom.csv;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class ExcelTable {
    private static List<ArrayList> arrayTable;
    private static LinkedList<ArrayList> arrayStack = new LinkedList<>();

    public static void addUser(String firstName, String lastName, String age) {
        ArrayList<String> newUser = new ArrayList<>();
        newUser.add(firstName);
        newUser.add(lastName);
        newUser.add(age);
        arrayTable.add(newUser);
    }

    public static void initial(String inFile) {
        arrayTable = FileUtils.read(inFile);
    }

    public static List<ArrayList> get() {
        return arrayTable;
    }

    public static String getValue(int line, int column) {
        List<String> arrayList = arrayTable.get(line);
        return arrayList.get(column);
    }

    public static void setValue(int line, int column, String value) {
        List<String> arrayList;
        arrayList = arrayTable.get(line);
        String oldValue = arrayList.get(column);
        pushStack(line, column, oldValue);
        arrayList.set(column, value);
    }

    public static void pushStack(int line, int column, String value) {
        ArrayList<Object> oldValue = new ArrayList(3);
        oldValue.add(0, line);
        oldValue.add(1, column);
        oldValue.add(2, value);
        arrayStack.push(oldValue);
    }
    public static void pollStack(){
        ArrayList<Object> lastValue = arrayStack.poll();
        List<String> arrayList;
        arrayList = arrayTable.get((int)lastValue.get(0));
        arrayList.set((int) lastValue.get(1), (String) lastValue.get(2));
    }

    public static boolean isEmptyStack() {
        return arrayStack.size() == 0 ? true : false;
    }

    public static void printStack() {
        for (ArrayList list : arrayStack) {
            System.out.println("[" + list.get(0) + ":" + list.get(1) + "] " + list.get(2));
        }
    }

    public static void print(List<ArrayList> array) {
        List<String> arrayList;

        for (int i = 0; i < array.size(); i++) {
            arrayList = array.get(i);
            for (int j = 0; j < arrayList.size(); j++) {
                System.out.print("(" + i + ":" + j + ")" + arrayList.get(j) + "\t");
            }
            System.out.println();
        }
    }

}
