import java.util.Scanner;
 class Pro4_64010936 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = in.nextDouble()*0.45359237; 
        System.out.print("Enter height in inches:");
        double height = in.nextDouble()*0.0254;
        System.out.println("BMI is"+weight/(height*height));
        
    }
}
