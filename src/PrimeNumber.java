import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrimeNumber = true;

        if(number<2)
            isPrimeNumber = false;
        else {
            for (int i = 2; i *i < number+1; i++) {
                if (number % i == 0) {
                    //count++
                    isPrimeNumber = false;
                    break; 
                }
            }
        }
        if (isPrimeNumber)
            System.out.println(number+" is a prime number!");
        else
            System.out.println(number+" is NOT a prime number!");
    }
}
