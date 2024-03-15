import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        boolean isPrimeNumber = true;
        Scanner scanner = new Scanner(System.in);
        int numberStart = scanner.nextInt();
        int numberEnd = scanner.nextInt();

        if(numberStart > numberEnd){
            int temp = numberStart;
            numberStart = numberEnd;
            numberEnd = temp;
        }

        for(int k = numberStart; k <= numberEnd; k++){
            isPrimeNumber = true;
            if(k < 2){
                isPrimeNumber = false;
            }else {
                for(int i=2; i*i <= k; i=i+1){
                    if(k % i == 0){
                        isPrimeNumber = false;
                        break;
                    }
                }
                if(isPrimeNumber) System.out.print(k + " ");
            }
        }
    }
}