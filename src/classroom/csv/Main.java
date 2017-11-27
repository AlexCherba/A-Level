package classroom.csv;

public class Main {
    public static void main(String[] args) {
        String inFile = "D:\\Workspace\\Java\\IDEA\\a-level\\src\\classroom\\csv\\input.csv";
        String outFile = "D:\\Workspace\\Java\\IDEA\\a-level\\src\\classroom\\csv\\output.csv";

        //FileUtils.read(inFile);
        FileUtils.print(FileUtils.read(inFile));
    }
}
