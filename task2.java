import java.util.*; 
import java.util.stream.Collectors;

public class task2 {
  public static void main(String[] args) {
    String[] employees = {"Ivan Ivanov", "Petr Petrov", "Ivan Ivanov", "Alexey Alexeev", "Petr Petrov"};
    System.out.println("Original list: " + Arrays.toString(employees));
    System.out.println("Duplicates: " + findDuplicates(employees));
  }

  public static List<String> findDuplicates(String[] employees){
    Map<String, Long> duplicatesMap = Arrays.stream(employees)
            .collect(Collectors.groupingBy(
                    s -> s, Collectors.counting()
            ));
    List<Map.Entry<String, Long>> sortedDuplicates = duplicatesMap.entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toList());

    return sortedDuplicates.stream()
            .map(e -> e.getKey() + " (" + e.getValue() + ")")
            .collect(Collectors.toList());
  }
}
