import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] number1 = {1.57, 7.654, 9.986};

        int[] number2 = {5, 6, 7, 8, 9, 10};

        // Задача 2

        System.out.print(number[0] + ", ");
        System.out.print(number[1] + ", ");
        System.out.print(number[2]);

        System.out.println(" ");

        for (double i = 0; i < 2; i++) {
            System.out.print(number1[(int) i] + ", ");
        }
        System.out.print(number1[2]);

        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            System.out.print(number2[i] + ", ");
        }
        System.out.print(number2[5]);

        System.out.println(" ");

        // Задача 3

        System.out.print(number[2] + ", ");
        System.out.print(number[1] + ", ");
        System.out.print(number[0]);

        System.out.println(" ");

        for (double i = 2; i > 0; i--) {
            System.out.print(number1[(int) i] + ", ");
        }
        System.out.print(number1[0]);

        System.out.println(" ");

        for (int i = 5; i > 0; i--) {
            System.out.print(number2[i] + ", ");
        }
        System.out.print(number2[0]);

        System.out.println(" ");

        // Задача 4

        int[] number3 = new int[3];
        number3[0] = 1;
        number3[1] = 2;
        number3[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (number3[i] % 2 == 1) {
                number3[i] = number3[i] + 1;
            }
        }
        System.out.println(Arrays.toString(number3));


    }
}