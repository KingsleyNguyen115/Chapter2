import java.util.Scanner;
public class MyCylinder {
    public static void main(String [] args){

      Scanner input = new Scanner(System.in);

      double PI_VALUE = 3.1416;

      System.out.println("Enter your cylinder base radius: ");
      double radius = input.nextDouble();

      System.out.println("Enter your cylinder length value: ");
      double length = input.nextDouble();

      double base = radius * radius * PI_VALUE;
      double volume = base * length;

      System.out.println("the base area of your cylinder is: " + base);
      System.out.println("the volume of your cylinder is: " + volume);

    }
}
