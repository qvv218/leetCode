package target;

import java.util.List;
import java.util.stream.Collectors;

public class PalindromeNumber {

    public boolean solution(int x) {
        List<Character> number = Integer.toString(x).chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        if (number.size() == 1) {
            return true;
        } else if (number.get(0).equals('-')) {
            return false;
        }

        for (int i = 0, j = number.size() - 1; i < j; i++, j--) {
            if (number.get(i).equals(number.get(j))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
