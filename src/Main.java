import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        int WRISTBAND = 21;
        String trash = "";

        System.out.println("Enter your age: ");
        if (in.hasNextInt())
        { age = in.nextInt();
            in.nextLine();
            if (age >= WRISTBAND)
            {
                System.out.println("You are " + age + " years old, you get a wristband");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("RUN THE PROGRAM AGAIN");
        }
    }
}