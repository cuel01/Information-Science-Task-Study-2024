import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        if(number<2)
            count=-1;
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    count++;
            }
        }
        if (count==0)
            System.out.println(number+" is a prime number!");
        else
            System.out.println(number+" is NOT a prime number!");
    }
}
