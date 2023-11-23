import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsValid object = new IsValid();
        int given_Number;
        do {
            System.out.println("Please give me a number between 2 and 2_000_000_000!");
            given_Number = scanner.nextInt();
        } while( !object.isValid(given_Number));
        PrimeNumbers.prime_Lister (given_Number);

    }

}