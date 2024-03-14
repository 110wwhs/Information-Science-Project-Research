import java.util.Scanner;

class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isPrime = true; // 4byte == 1byte

        if(number < 2) {
            isPrime = false;
        } else
            for (int i =2; i*i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false; // remove add operation.
                    break;
                }
            }

        if (isPrime) { // remove == operation.
            System.out.println("당신이 입력한 " + number + "는(은) 소수입니다.");
        } else {
            System.out.println("당신이 입력한 " + number + "는(은) 소수가 아닙니다.");
        }
    }
}
