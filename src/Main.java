import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberValidator numberValidator = new NumberValidator();
        int givenNumber;
        do {
            System.out.println("Please give me a number between 2 and 2_000_000_000!");
            givenNumber = scanner.nextInt();
        } while (!numberValidator.isValid(givenNumber));
        PrimeNumbers.primeLister(givenNumber);
        scanner.close();
    }

}