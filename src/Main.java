import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Новый контакт");
            System.out.println("2. Редактировать контакт");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Выйти");
            System.out.print("Выберите команду: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя контакта: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите значение контакта: ");
                    String value = scanner.nextLine();
                    phone.addContact(name, value);
                    break;
                case 2:
                    System.out.print("Выберите индекс контакта для редактирования: ");
                    int indexEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите новое значение контакта: ");
                    String newValue = scanner.nextLine();
                    phone.updateContact(indexEdit, newValue);
                    break;
                case 3:
                    System.out.print("Выберите индекс контакта для удаления: ");
                    int indexDelete = scanner.nextInt();
                    phone.deleteContact(indexDelete);
                    break;
                    case 4:
                        System.out.println("Выход из программы");
                        return;
                        default:
                            System.out.println("Некорректная команда");
            }
        }
    }
}