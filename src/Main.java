import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FiReader fr = new FiReader();

        Stream<String> ss = fr.WordReaderToStream();
        System.out.println(ss.map(line -> line.replaceAll("[^ 'a-zA-Z]", "")).map(line -> line.toLowerCase()).flatMap(line -> Arrays.stream(line.split(" "))).filter(x -> x.length() > 0).count());
        Stream<String> ss4 = fr.WordReaderToStream();
        System.out.println(ss4.map(line -> line.replaceAll("[^ 'a-zA-Z]", "")).map(line -> line.toLowerCase()).flatMap(line -> Arrays.stream(line.split(" "))).filter(x -> x.length() > 0).distinct().count());
        Stream<String> ss2 = fr.WordReaderToStream();
        Stream<String> tt1 = Pattern.compile("[^ 'a-zA-Z]").splitAsStream("Мама мыла раму");

        Stream<String> ss3 = fr.WordReaderToStream();
        Map<String, Long> collect = ss3
                .map(line -> line.replaceAll("[^ 'a-zA-Z]", ""))
                .map(line -> line.toLowerCase())
                .filter(x -> x.length() > 0)
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .sorted()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       // System.out.println(collect);

        collect.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);

                        //collect(Collectors.toList());





    }
}
