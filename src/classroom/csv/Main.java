package classroom.csv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inFile = "D:\\Workspace\\Java\\IDEA\\a-level\\src\\classroom\\csv\\input.csv";
        String outFile = "D:\\Workspace\\Java\\IDEA\\a-level\\src\\classroom\\csv\\output.csv";
        String firstName;
        String lastName;
        String age;
        String cellNumber;

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
            if (!ExcelTable.isEmptyStack()) {
                System.out.println(
                        "4. Отмена последнего изменения\n" +
                        "5. Сохранить изменения в файл");
            }
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
                    ExcelTable.addUser(firstName, lastName, age);
                    ExcelTable.print(ExcelTable.get());
                    FileUtils.write(outFile, ExcelTable.get());
                    continue;
                case 2:
                    ExcelTable.print(ExcelTable.get());
                    System.out.print("Выберите ячейку для изменения (например 2:1):");
                    cellNumber = scanner01.next();

                    String[] cellNumArray = cellNumber.split(":");
                    int line = Integer.parseInt(cellNumArray[0]);
                    int column = Integer.parseInt(cellNumArray[1]);

                    System.out.print("Измените значение (" + ExcelTable.getValue(line, column) + "): ");
                    ExcelTable.setValue(line, column, scanner01.next());
                    ExcelTable.print(ExcelTable.get());
                    ExcelTable.printStack();
                    continue;
                case 3:
                    break;
                case 4:
                    if (ExcelTable.isEmptyStack()) continue;
                    ExcelTable.pollStack();
                    ExcelTable.print(ExcelTable.get());
                    ExcelTable.printStack();
                    continue;
                case 5:
                    if (ExcelTable.isEmptyStack()) continue;
                    continue;
                default:
                    System.out.println("Не катит, 1 или 2 плиз!");
                    continue;
            }
            break;
        }
    }
}
