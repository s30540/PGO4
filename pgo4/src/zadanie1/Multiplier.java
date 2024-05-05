package zadanie1;

import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    // Metoda multiply przyjmująca dwa parametry typu int
    public int multiply(int a, int b) {
        return a * b;
    }

    // Metoda multiply przyjmująca cztery parametry typu int
    public int multiply(int a, int b, int c, int d) {
        return multiply(a, b) * multiply(c, d);
    }

    // Metoda multiply przyjmująca dwa parametry typu double
    public double multiply(double a, double b) {
        return a * b;
    }

    // Metoda multiply przyjmująca dwa obiekty typu BigDecimal
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    // Metoda multiply przyjmująca listę obiektów klasy Integer
    public int multiply(List<Integer> numbers) {
        int result = 1;
        for (Integer number : numbers) {
            result *= number;
        }
        return result;
    }
}
