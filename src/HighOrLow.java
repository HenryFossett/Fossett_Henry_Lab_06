import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int guess = 0;
        boolean done = false;
        String trash;
        do{
            System.out.print("Enter your guess [1 - 10]: ");
            if(in.hasNextInt()){
                guess = in.nextInt();
                in.nextLine();
                done = true;
            } else{
                trash = in.nextLine();
                System.out.println("Only enter a number between 1 and 10");
            }
        }while(!done);
        num = (int) (Math.random() * ((10 - 1) +1) +1);
        if (num > guess){
            System.out.println(num + ", is higher than your guess");
        }else if (num < guess){
            System.out.println(num + ", is lower than your guess");
        }else{
            System.out.println("You guessed the number!");
        }
    }
}
