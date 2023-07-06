import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {
        List<String> names = List.of("Tama", "Hachi", "suzuki", "Goro", "Nana");

        long c1 = names.stream().filter(name -> name.contains("a")).count();
        System.out.println(c1);

        System.out.println("[複数条件で表示したい]");
        names = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(names);


    }
}
