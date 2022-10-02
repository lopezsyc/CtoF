import java.util.Scanner;

public class CtoF {

    public static void main(String[] args) {
        double celsius = 0;
        double fahrenheit;
        String trash;

        // fahrenheit = celsius x 1.8 + 32

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temperature in celsius");

        if (in.hasNextDouble()) {
            in.nextLine();

            fahrenheit = celsius * 1.8 + 32;

            System.out.printf("The temperature in fahrenheit is %.2f%n", fahrenheit);

        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid temperature value: " + trash);
        }

    }


}

