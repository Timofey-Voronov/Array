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

        for (int i = 0; i < number.length; i++) {
        }
        System.out.print(Arrays.toString(number));

        System.out.println(" ");

        for (double i = 0; i < number1.length; i++) {
        }
        System.out.print(Arrays.toString(number1));

        System.out.println(" ");

        for (int i = 0; i < number2.length; i++) {
        }
        System.out.print(Arrays.toString(number2));

        System.out.println(" ");

        // Задача 3

        for (int i = number.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number[i] + ", ");
            } else {
                System.out.print(number[i]);
            }
        }

        System.out.println(" ");

        for (double i = number1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number1[(int) i] + ", ");
            } else {
                System.out.print(number1[(int) i]);
            }
        }

        System.out.println(" ");

        for (int i = number2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number2[i] + ", ");
            } else {
                System.out.print(number2[i]);
            }
        }

        System.out.println(" ");

        // Задача 4

        int[] number3 = new int[3];
        number3[0] = 1;
        number3[1] = 2;
        number3[2] = 3;
        for (int i = 0; i < number3.length; i++) {
            if (number3[i] % 2 == 1) {
                number3[i] = number3[i] + 1;
            }
        }
        System.out.println(Arrays.toString(number3));


    }
}