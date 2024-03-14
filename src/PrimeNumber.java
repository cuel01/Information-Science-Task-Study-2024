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
            isPrimeNumber = true;
            if(k<2)
                isPrimeNumber = false;
            else {
                for (int i = 2; i *i < k+1; i++) {
                    if (k % i == 0) {
                        //count++
                        isPrimeNumber = false;
                        break;
                    }
                }
            }
            if (isPrimeNumber)
                System.out.print(k+" ");
        }
    }
}
