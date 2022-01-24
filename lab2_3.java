import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter year:");
      int year = in.nextInt();
      System.out.print("Enter month1-12:");
      int month = in.nextInt();
      System.out.print("Enter day1-31:");
      int q = in.nextInt(); //q is day of the month
      String[] day_of_week = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
      if(month==1 || month==2){
        month+=12 ;
        year--;
      }
      int j = year/100 ;
      int k = year%100;
      int h = (q+26*(month+1)/10+k+k/4+j/4+5*j)%7;
      System.out.println (day_of_week[h]);
    }
    
}
