package classroom.csv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String csvFile = "D:\\Workspace\\Java\\IDEA\\a-level\\src\\classroom\\csv\\input.csv";
        String firstName;
        String lastName;
        String age;
        String cellNumber;

        ExcelTable.initial(csvFile);

        Scanner scanner01 = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Что вы планируете делать?\n" +
                            "1. Добавить нового пользователя\n" +
                            "2. Изменить существующего пользователя\n" +
                            "3. Сохранить изменения в файл\n" +
                            "4. Выход");
            if (!ExcelTable.isEmptyStack()) {
                System.out.println(
                        "-------------------------------\n" +
                        "5. Отмена последнего изменения");
            }

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
                    FileUtils.write(csvFile, ExcelTable.get());
                    continue;
                case 4:
                    break;
                case 5:
                    if (ExcelTable.isEmptyStack()) continue;
                    ExcelTable.popStack();
                    ExcelTable.print(ExcelTable.get());
                    ExcelTable.printStack();
                    continue;
                default:
                    System.out.println("Не катит, 1 или 2 плиз!");
                    continue;
            }
            break;
        }
    }
}
