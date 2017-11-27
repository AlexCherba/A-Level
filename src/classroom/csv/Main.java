package classroom.csv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inFile = "D:\\Workspace\\Java\\IDEA\\a-level\\src\\classroom\\csv\\input.csv";
        String outFile = "D:\\Workspace\\Java\\IDEA\\a-level\\src\\classroom\\csv\\output.csv";
        String firstName;
        String lastName;
        String age;

        ExcelTable.initial(inFile);
        //FileUtils.print(FileUtils.read(inFile));
        //FileUtils.print(ExcelTable.get());

        Scanner scanner01 = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Что вы планируете делать?\n" +
                            "1. Добавить нового пользователя\n" +
                            "2. Изменить существующего пользователя\n" +
                            "3. Выход");

            //  View menu from select file or generate random Zoo

            switch (scanner01.nextInt()) {
                case 1:
                    System.out.print("Имя: ");
                    firstName = scanner01.next();
                    System.out.println();
                    System.out.print("Фамилия: ");
                    lastName = scanner01.next();
                    System.out.println();
                    System.out.print("Возраст: ");
                    age = scanner01.next();
                    System.out.println();
                    ExcelTable.addUser(firstName,lastName,age);
                    FileUtils.print(ExcelTable.get());
                    continue;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Не катит, 1 или 2 плиз!");
                    continue;
            }
            break;
        }
    }
}
