
public class Phone {

    private Contact[] contacts = new Contact[10];

    public void addContact (String name, String value) {

        Contact contact = new Contact(name, value);
        int size = 0;

        for (var i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                size++;
            }
        }

        if (size <= 10) {
            contacts[size] = contact;
            displayContacts();
        } else {
            System.out.println("В телефонной книге не хватает места, " +
                    "удалите контакт чтобы добавить новый");
        }
    }
    public void updateContact(int index, String value) {
        if (contacts[index] == null) {
            System.out.println("Контакта по заданному индексу " +
                    "не существует в телефонной книжке");
        } else {
            contacts[index].setValue(value);
            displayContacts();
        }
    }

    public void deleteContact(int index) {
        if (contacts[index] == null) {
            System.out.println("Контакта по заданному индексу " +
                    "не существует в телефонной книжке");
        } else {
            if (index < 10) {
                Contact[] newArray = new Contact[10];
                for (var i = 0; i < contacts.length; i++) {
                    if (i != index) { // Копируем все кроме index
                        // Элементы стоящие дальше index смещаются влево
                        var newIndex = i < index ? i : i - 1;
                        newArray[newIndex] = contacts[i];
                    }
                }
                contacts = newArray;
                displayContacts();
            } else {
                System.out.println("Индекс должен быть больше или равным 0 и не больше 9");
            }
        }
    }

    public void displayContacts() {
        System.out.println("-------------------------");
        System.out.println("Список контактов");
        System.out.println("-------------------------");

        for (var i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(i+1 + " " + contacts[i].getName() +" " + contacts[i].getValue());
                System.out.println("-------------------------");
            }
        }
    }
}