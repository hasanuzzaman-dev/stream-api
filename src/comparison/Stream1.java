package comparison;

import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(21, 52, 45, 1, 6, 32, 521, 75, 64, 99);

        List<Integer> list2 = list1.stream().filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(list2);
    }
}
