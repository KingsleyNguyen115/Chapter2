import java.util.Scanner;
public class Paint {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int window = 15;
        int door = 21;
        int A_GALLON_PAINT = 350;
        double quart = 0.25;
        System.out.println("Enter your room length: ");
        double length = input.nextDouble();

        System.out.println("Enter your room width: ");
        double width = input.nextDouble();

        System.out.println("Enter your room height: ");
        double height = input.nextDouble();

        System.out.println("Enter your room number of windows: ");
        int NUMBER_WINDOWS = input.nextInt();

        System.out.println("Enter your room number of door: ");
        int NUMBER_DOOR = input.nextInt();

        double AREA_WITHOUT_DOOR_WIN = 2 * ((length * height) + (width * height));
        double AREA_WITH_D_W = (length * width) - (NUMBER_WINDOWS * window) - (NUMBER_DOOR * door);

        double PAINTED_AREA = AREA_WITHOUT_DOOR_WIN + AREA_WITH_D_W;

        double PAINT_GALLON = PAINTED_AREA * A_GALLON_PAINT;
        double PAINT_QUART = PAINT_GALLON * quart;

        System.out.println("The gallons of paint needed for your room are: " + PAINT_GALLON);
        System.out.println("The quarts of paint needed for your room are: " + PAINT_QUART);




    }
}
