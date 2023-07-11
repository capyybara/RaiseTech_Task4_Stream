import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> names = List.of("Tama", "Hachi", "suzuki", "Goro", "Nana");

        long count1 = names.stream().filter(name -> name.contains("a")).count();
        System.out.println(count1);

        System.out.println("[複数条件で表示]");
        names = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        for (String catname : names){
            System.out.println(catname);
        }

    }
}
