import java.util.HashSet;

public class Groups {

    public static void main(String[] args) {
        HashSet<String> groupA = new HashSet<>();
        HashSet<String> groupB = new HashSet<>();

        groupA.add("Ali");
        groupA.add("Sara");
        groupA.add("Yassine");

        groupB.add("Sara");
        groupB.add("Omar");


        HashSet<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection: " + intersection);


        HashSet<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union: " + union);
    }
}
