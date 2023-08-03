package target;

import java.util.*;

public class LengthOfLongestSubstring {

    public int solution(String s) {
        List<Character> list = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (list.contains(s.charAt(i))) {
                Character currentChar = s.charAt(i);

                if (result < list.size()) {
                    result = list.size();
                }

                for (int j = 0; j < list.size();) {

                    if (list.get(j).equals(currentChar)) {
                        list.remove(j);
                        list.add(currentChar);
                        break;
                    } else {
                        list.remove(j);
                    }
                }

            } else {
                list.add(s.charAt(i));
            }
        }

        return result < list.size() ? list.size() : result;
    }
}