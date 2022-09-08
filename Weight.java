import java.util.Scanner;
public class Weight {
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter your weight in lbs: ");
       int weight = input.nextInt();

       System.out.println("Enter your height in inches: ");
       int height = input.nextInt();

       double weightInLbs = weight / 2.2;
       double heightInMeter = height * 0.0254;

       double BMI = weightInLbs / (heightInMeter * heightInMeter);

       System.out.printf(" Your BIM is: %.2f", BMI);
    }
}
