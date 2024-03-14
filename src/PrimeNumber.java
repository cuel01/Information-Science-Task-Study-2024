import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //int count = 0;
        boolean isPrimeNumber = true;

        if(number<2)
            //count=-1;
            isPrimeNumber = false;
        else {
            for (int i = 2; i *i < number+1; i++) {
                if (number % i == 0) {
                    //count++
                    isPrimeNumber = false;
                    break;  // Improved performance by escaping for loop on first divisor found
                }
            }
        }
        //if (count==0)
        if (isPrimeNumber)
            System.out.println(number+" is a prime number!");
        else
            System.out.println(number+" is NOT a prime number!");
    }
}
