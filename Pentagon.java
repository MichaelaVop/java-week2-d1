import java.util.Scanner;

public class Pentagon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double side = 2 * r * Math.sin(Math.PI / 5.0);
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5.0));

        System.out.println("The area of the pentagon is " + String.format("%.2f", area));

    }
}