import java.util.Scanner;

public class lab2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of line:"); // // Prompt the user to enter an integer from 1 to 15
   int num_line = input.nextInt(); 

   //display pyramid
 for (int row = 1;row<=num_line;row++){
     for(int blank = num_line-row; blank>=1;blank--){   // Create spaces in each row
     System.out.print("  ");
     }
  for(int j = row; j>=2;j--){ //Create decending numbers in each row
    System.out.print(j+" ");
 }
 for(int r =1; r<=row;r++){ // // Create ascending number in each row
     System.out.print(r+" ");
 }
System.out.println(); //end line
 }
 }
}
    

