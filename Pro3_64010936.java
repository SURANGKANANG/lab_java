import java.util.Scanner;

class Pro3_64010936 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The sum of the  digits is "+(n%10+(n%100)/10+(n%1000)/100+n/1000));
    }
    
}
