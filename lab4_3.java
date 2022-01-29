/**
 * lab4_3
 */
public class lab4_3 {
    public static void selectionSort(double[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < c.length; j++) {
                if (c[index] > c[j]) {
                    index = j;
                }
            }

            double temp = c[index];
            c[index] = c[i];
            c[i] = temp;
        }
    }

    static boolean isPrime(int n) {
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        return (n == reverse(n));
    }

    static int reverse(int n) {
        int number = 0;
        while (n > 0) {
            number *= 10;
            number += n % 10;
            n /= 10;

        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("Creating a list containing 1000 elements,");
        double[] c = new double[1000];
        for (int i = 0; i < 1000; i++) {
            c[i] = Math.random() * 1000;
            System.out.printf("\t%.2f", c[i]);
            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(c);
        stopWatch.stop();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("\t%.2f", c[i]);
            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.", stopWatch.getElapsedTime());
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        stopWatch.start();
        int i = 0 ; int n = 2 ;
        while (i<1000){
            if(isPalindrome(n)){
                if(isPrime(n)){
                    System.out.print(n+" ");
                    i++ ;
                    if (i%5==0&&i>0) {
                        System.out.printf("\n");
                    }
                }
            }
            n++;
        }
        stopWatch.stop();
        System.out.printf("PalindromePrime created.\nThe palindromPrime stopwatch stoped.\nThe palindromPrime time is %.1f milliseconds.",stopWatch.getElapsedTime());
    }

}