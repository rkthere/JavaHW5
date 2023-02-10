
import java.util.HashMap;

public class task1 {

    private HashMap<String, String[]> phonebook;

    public task4() {
        this.phonebook = new HashMap<>();
    }


    public void addPerson(String name, String[] numbers) {
        this.phonebook.put(name, numbers);
    }


    public String[] lookup(String name) {
        return this.phonebook.get(name);
    }

    public static void main(String[] args) {
        task4 book = new task4();

        book.addPerson("John Doe", new String[] {"123-456-7890", "234-567-8901"});
        book.addPerson("Jane Doe", new String[] {"345-678-9012", "456-789-0123"});


        String[] numbers = book.lookup("John Doe");
        System.out.println("Phone numbers for John Doe:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
