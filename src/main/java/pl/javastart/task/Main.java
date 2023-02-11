package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int number = 21;
        double radius = 2.5;
        System.out.println("Czy liczba " + number + " jest parzysta? " + calc.isEven(number));
        System.out.println("Czy liczba " + number + " jest nieparzysta? " + calc.isOdd(number));
        System.out.printf("Pole koła o promieniu %.2f wynosi: %.2f\n", radius, calc.circleField(radius));
        System.out.println("Kwadrat liczby " + number + " równy jest " + calc.power(number));
    }
}
