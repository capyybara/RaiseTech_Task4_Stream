import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {
        List<String> names = List.of("Tama", "Hachi", "suzuki", "Goro", "Nana");

        System.out.println("[複数条件で表示したい]");
        names = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
        for (String catname : names){
            System.out.println(catname);    
        }
        


        System.out.println("「リストを昇順に表示」");
        List<String> result = names.stream().sorted().toList();

        for (String name : result) {
            System.out.println(name);
        }


        System.out.println("「大文字で表示」");
        names.stream().map(String::toUpperCase).forEach(System.out::println);


        long c1 = names.stream().filter(name -> name.contains("a")).count();
        System.out.println(c1);


    }
}
