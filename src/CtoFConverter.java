import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double tempC = 0;
        double tempF = 0;
        String trash = "";
        do{
            System.out.print("Please enter the temp in C you want converted to F: ");
            if(in.hasNextDouble()){
                tempC = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("Please only enter a valid temp in C");
            }
        } while (!done);
        tempF = ((tempC * (1.8))+ 32);
        System.out.println(tempC + " degrees C is " + tempF + " degrees F.");
    }
}
