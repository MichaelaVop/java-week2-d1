import java.util.Scanner;


public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter: ");
        char l = input.nextLine().toCharArray()[0];

        boolean checkL = Character.isLetter(l);

        if (checkL) {
            char lFormated = Character.toLowerCase(l);
            if (lFormated == 'a' || lFormated == 'e' || lFormated == 'i' || lFormated == 'o' || lFormated == 'u') {
                System.out.println(l + " is a vowel");
            } else {
                System.out.println(l + " is a consonant");
            }
        } else {
            System.out.println(l + " is an invalid input");
        }
                

    }
}