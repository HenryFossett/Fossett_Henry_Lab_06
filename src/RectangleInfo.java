import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double hypotenuse = 0;
        double hypotenuseSquared = 0;
        double area = 0;
        double perimeter = 0;
        boolean done = false;
        String trash;
        do{
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("Only enter a valid width not " + trash);
            }
        }while(!done);
        done = false;
        do{
            System.out.print("Enter the length of the rectangle: ");
            if (in.hasNextDouble()){
                length = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("Only enter a valid length not " + trash);
            }
        }while(!done);
        area = width * length;
        perimeter = (width * 2) + (length * 2);
        hypotenuseSquared = ((width * width) + (length * length));
        hypotenuse = Math.sqrt(hypotenuseSquared);
        System.out.println("The area is " + area + ", the perimeter is " + perimeter + ", and the hypotenuse is " +hypotenuse);
    }
}
