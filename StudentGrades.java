import java.util.HashMap;
import java.util.Map;

public class StudentGrades {

    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();


        grades.put("Ali", 15.5);
        grades.put("Sara", 18.0);
        grades.put("Omar", 12.0);


        grades.computeIfPresent("Ali", (k, v) -> v + 1);


        grades.remove("Omar");


        System.out.println("Size: " + grades.size());


        double avg = grades.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double max = grades.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);
        double min = grades.values().stream().mapToDouble(Double::doubleValue).min().orElse(0);

        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        System.out.println("Grade 20 exists? " + grades.containsValue(20.0));


        grades.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
