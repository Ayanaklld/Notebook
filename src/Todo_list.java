import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo_list {
    public static void main(String[] args) {
        List<String> to_do_List = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n Выберите действие:\n" +
                               "1. Добавить задачу\n" +
                               "2. Вывести список задач\n" +
                               "3. Удалить задачу\n" +
                               "0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите задачу для планирования: ");
                    String newTask = scanner.nextLine();
                    to_do_List.add(newTask);
                    System.out.println("Задача добавлена");
                    break;
                case 2:
                    System.out.println("Список задач: ");
                    for (int i = 0; i < to_do_List.size(); i++){
                        System.out.println((i+1) + "." + to_do_List.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Введите номер задачи для удаления: ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber >= 1 && taskNumber <= to_do_List.size()){
                        to_do_List.remove(taskNumber-1);
                        System.out.println("Задача удалена");
                    } else {
                        System.out.println("Вы ввели неверный номер задачи");
                    }
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    System.exit(0);
                default:
                    System.out.println("Попробуйте еще раз");
            }
        }
    }
}
