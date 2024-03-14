import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for(int i=1; i<=number; i++){
            if(number%i==0)
                count++;
        }
        if (count==2)
            System.out.println(number+" is a prime number!");
        else
            System.out.println(number+" is NOT a prime number!");
    }
}
