package zadanie1;

import java.math.BigDecimal;
import java.util.List;

public class Adder {

    // Metoda add przyjmująca dwa parametry typu int
    public int add(int a, int b) {
        return a + b;
    }

    // Metoda add przyjmująca listę obiektów klasy BigDecimal
    public BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal number : numbers) {
            sum = sum.add(number);
        }
        return sum;
    }
}
