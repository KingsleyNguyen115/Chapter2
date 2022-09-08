
    import java.util.Scanner;
    public class Saving1 {
        public static void main(String [] args){
            Scanner input = new Scanner(System.in)   ;
            final double MONTHLY_RATE = 0.05/12;
            System.out.println("Enter your monthly saving amount: ");
            double monthlySaving = input.nextDouble();
            double month1Value = monthlySaving * ( 1 + MONTHLY_RATE);
            double month2Value = (month1Value + monthlySaving) * ( 1 + MONTHLY_RATE);
            double month3Value = (month2Value + monthlySaving) * ( 1 + MONTHLY_RATE);
            double month4Value = (month3Value + monthlySaving) * ( 1 + MONTHLY_RATE);
            double month5Value = (month4Value + monthlySaving) * ( 1 + MONTHLY_RATE);
            double month6value = (month5Value + monthlySaving) * ( 1 + MONTHLY_RATE);

            System.out.printf("The total amount of saving after 6 months is: %.2f",month6value);

        }
    }

