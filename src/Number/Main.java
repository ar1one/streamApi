package Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        list.removeIf(x -> x <= 0 || x % 2 != 0);
        list.sort(Integer::compareTo);
        System.out.println(list);
    }
}
