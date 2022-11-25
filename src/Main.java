
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {56 , 78, 89, 12};
        Double arr = Double.valueOf(Stream.of(ints).filter(c -> c % 2 == 0).map(c -> c * c)
                .max((x, y) -> Integer.compare(x, y)).get());
        System.out.println(arr);
    }
}