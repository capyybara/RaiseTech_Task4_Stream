import java.util.List;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> names = List.of("Tama", "Hachi", "suzuki", "Goro", "Nana");
        List<String> sortedResult = names.stream().sorted().toList();

        for (String name : sortedResult) {
            System.out.println(name);
        }

        long c1 = names.stream().filter(name -> name.contains("a")).count();
        System.out.println(c1);

    }
}
