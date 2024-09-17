/**
 * Написать класс Калькулятор (необобщенный),
 * который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract(). Параметры этих методов
 * – два числа разного типа, над которыми должна быть произведена
 * операция. Методы должны возвращать результат своей работы.
 */

public class Calculator {
    public static <T extends Number> Number sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> Number multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> Number divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number> Number subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}
