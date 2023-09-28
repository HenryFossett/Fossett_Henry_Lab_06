import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash;
        boolean done = false;
        do{
            System.out.print("Enter the distance in meters: ");
            if(in.hasNextDouble()){
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            } else{
                trash = in.nextLine();
                System.out.println("Only input a valid distance in meters");
            }
        }while(!done);
        miles = meters / 1609.34;
        feet = meters * 3.2808;
        inches = meters * 39.37;
        System.out.println(meters + " meters is " + miles + " miles, and " + feet + " feet, and " + inches + " inches.");
    }
}
