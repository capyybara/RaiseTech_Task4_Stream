
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> names = List.of("Tama", "Hachi", "suzuki", "Goro", "Nana");

        long count = names.stream().filter(name -> name.contains("a")).count();
        System.out.println(count);


        System.out.println("[複数条件で表示]");
        names = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
