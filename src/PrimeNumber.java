import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStart = scanner.nextInt();
        int numberEnd = scanner.nextInt();
        int temp=0;
        if (numberStart>numberEnd){
            temp=numberStart;
            numberStart=numberEnd;
            numberEnd=temp;
        }
        boolean isPrimeNumber = true;

        for (int k=numberStart; k<=numberEnd; k++){
            if (isPrimeNumber(k)) System.out.print(k+" ");
        }
    }
    private static boolean isPrimeNumber(int n){
        if(n<2)
            return false;
        else {
            for (int i = 2; i *i < n+1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
