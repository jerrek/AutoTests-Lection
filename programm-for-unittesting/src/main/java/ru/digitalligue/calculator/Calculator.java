package ru.digitalligue.calculator;

/**
 * Класс предназначаен, для проведения математических операций
 */
public class Calculator {

    /**
     * Метод реализует возвращение сложения 2х переданных в него цифр
     *
     * @param a - первое слагаемое
     * @param b - второе слагаемое
     * @return сумму переданных слагаемых
     */
    public static int plus(int a, int b) {
        return a + b;
    }

    /**
     * Метод реализует возвращение разницы 2х переданных в него параметров
     *
     * @param a - первое слагаемое
     * @param b - второе слагаемое
     * @return разницу переданных слагаемых
     */
    public static int minus(int a, int b) {
        return a - b;
    }

    /**
     * Метод реализует возвращение перемножения 2х переданных в него параметров
     *
     * @param a - первый множитель
     * @param b - второй множитель
     * @return произведение переданных множителей
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Метод реализует возвращение деления переданного в него 1го параметра, на второй
     *
     * @param a - делимое
     * @param b - делитель
     * @return результат деления переданных слагаемых
     */
    public static int divided(int a, int b) {
        return a / b;
    }

    /**
     * Метод реализует возведение числа а в степень b
     *
     * @param a - основание
     * @param b - степень
     * @return результат возведения в а, в степень b
     */
    public static int exponentiation(int a, int b) {
        for (int i = 0; i < b; i++) {
            a *= a;
        }
        return a;
    }

    /**
     * Метод реализует взятие квадратного корня из переданного в него числа
     *
     * @param a - число из котрого следует извлечь квадратный корень
     * @return результат взхятия квадратного корня
     */
    public static double takeSquareRoot(int a) {
        return Math.sqrt(a);
    }

    /**
     * Метод реализует округление числа
     *
     * @param a - число из котрого следует извлечь квадратный корень
     * @return результат взхятия квадратного корня
     */
    public static int round(double a) {
        double b = a - (int) a;
        if (b > 0) {
            if (b <= 0.5) {
                return (int) (a - b);
            } else {
                return (int) (a + b);
            }
        }
        return (int) (a - b);
    }

}
