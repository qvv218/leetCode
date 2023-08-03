package target;

import java.util.Arrays;

public class Sort {

    public void bumble() {
        int[] numbers = new int[]{0,10,2,1,3,4,5,7,4,6,8};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int number = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = number;
                }
            }
        }
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
