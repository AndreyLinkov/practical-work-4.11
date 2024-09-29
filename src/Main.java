import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        Arithmetic numbers = new Arithmetic(input.nextInt(), input.nextInt());

        System.out.println("Сумма заданных чисел = " + numbers.sum());
        System.out.println("Произведение заданных чисел = " + numbers.multiplication());
        System.out.println("Меньшее число: " + numbers.minNumber());
        System.out.println("Большее число: " + numbers.maxNumber());
    }
}
