// Practical 3 - String Operations
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int length = sentence.length();
        System.out.println("Total number of characters: " + length);

        String replacedSentence = sentence.replace(" ", "-");
        System.out.println("Sentence after replacing spaces with dashes: " + replacedSentence);

        if (sentence.length() >= 5) {
            String firstFive = sentence.substring(0, 5);
            System.out.println("First 5 characters: " + firstFive);
        } else {
            System.out.println("Sentence has less than 5 characters.");
        }

        String lowerCase = sentence.toLowerCase();
        System.out.println("Sentence in lowercase: " + lowerCase);

        String upperCase = sentence.toUpperCase();
        System.out.println("Sentence in uppercase: " + upperCase);

        sc.close();
    }
}
