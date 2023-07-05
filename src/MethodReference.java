import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");

        List<String> sortedResult = names.stream().sorted().toList();

        for(String name: sortedResult){
            System.out.println(name);
        }


        names.stream().map(String::toUpperCase).forEach(System.out::println);

        long c1 = names.stream().filter(name -> name.startsWith("y")).count();
        System.out.println(c1);


    }
}
