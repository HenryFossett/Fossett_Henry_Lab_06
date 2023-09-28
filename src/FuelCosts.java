import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double galPerTank = 0;
        double mpg = 0;
        double costPerGal = 0;
        double numGalPer100 = 0;
        double costPer100 = 0;
        double totalDistance = 0;
        String trash;
        boolean done = false;
        do{
            System.out.print("Enter the number of gallons that can fit in your cars tank: ");
            if (in.hasNextDouble()){
                galPerTank = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.next();
                System.out.println("Please only enter the number of gallons than can fit in your car's tank");
            }
        }while (!done);
        done = false;
        do{
            System.out.print("Enter the miles per gallon of your car: ");
            if (in.hasNextDouble()){
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.next();
                System.out.println("Please only enter the miles per gallon of your car");
            }
        }while (!done);
        done = false;
        do{
            System.out.print("Enter the price of a gallon of gas: ");
            if (in.hasNextDouble()){
                costPerGal = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("Please only enter the price of a gallon of gas");
            }
        }while (!done);
        numGalPer100 = 100/mpg;
        costPer100 = numGalPer100 * costPerGal;
        totalDistance = mpg * galPerTank;
        System.out.println("The cost per 100 miles is $" + costPer100 + ", and the total distance you can travel is " + totalDistance + " miles");
    }
}
