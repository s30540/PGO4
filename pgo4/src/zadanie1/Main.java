package zadanie1;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        Adder adder = new Adder();

        int result1 = multiplier.multiply(2, 3); // result1 = 6
        int result2 = multiplier.multiply(1, 2, 3, 4); // result2 = 48
        double result3 = multiplier.multiply(2.5, 3.2); // result3 = 8.0
        BigDecimal result4 = multiplier.multiply(new BigDecimal("10.5"), new BigDecimal("2.3")); // result4 = 24.15
        int result5 = multiplier.multiply(Arrays.asList(4, 6, 8)); // result5 = 192

        int sum1 = adder.add(5, 7); // sum1 = 12
        BigDecimal sum2 = adder.add(Arrays.asList(new BigDecimal("1.2"), new BigDecimal("3.4"), new BigDecimal("5.6"))); // sum2 = 10.2

    }
}