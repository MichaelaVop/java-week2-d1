import java.util.Scanner;
import java.util.Arrays;

public class Cities {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [] cities = {"", "", ""};

        System.out.println("Enter the first city: ");
        cities[0] = input.next();
        System.out.println("Enter the second city: ");
        cities[1] = input.next();
        System.out.println("Enter the third city: ");
        cities[2] = input.next();

        
        Arrays.sort(cities);

        System.out.println("The three cities in alphabetical order are " + String.join(" ", cities));

    }

}