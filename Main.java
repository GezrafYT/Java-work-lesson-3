import java.util.Scanner;

public class Main
{
    public static void problemOne()
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num >= 0)
        {
            System.out.println("Positive.");
        }
        else
        {
            System.out.println("Negative.");
        }
    }

    public static void problemTwo()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        float x = scan.nextFloat();
        System.out.println("Enter y: ");
        float y = scan.nextFloat();
        System.out.println(Math.min(x,y));
    }

    public static void problemThree()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter of the 1st rider: ");
        String letter1 = scan.nextLine();
        System.out.println("Enter the letter of the 2nd rider: ");
        String letter2 = scan.nextLine();
        System.out.println("Enter the distance of the 1st rider: ");
        float x1 = scan.nextFloat();
        System.out.println("Enter the distance of the 2nd rider: ");
        float x2 = scan.nextFloat();
        System.out.println("Enter the velocity of the 1st rider: ");
        float v1 = scan.nextFloat();
        System.out.println("Enter the velocity of the 2nd rider: ");
        float v2 = scan.nextFloat();

        double t1 = x1 / v1, t2 = x2 / v2;
        double min_time = Math.min(t1,t2);
        if (t1 == min_time)
        {
            System.out.println("Rider " + letter1 + " has the minimum time of " + t1);
        }
        
        else if (t2 == min_time)
        {
            System.out.println("Rider " + letter2 + " has the minimum time of " + t2);
        }
        
        else
        {
            System.out.println("Both riders' time arrivals are equal.");
        }
        

    }

    public static void problemFour()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade 1: ");
        float grade1 = scan.nextFloat();
        System.out.println("Enter grade 2: ");
        float grade2 = scan.nextFloat();
        System.out.println("Enter grade 3: ");
        float grade3 = scan.nextFloat();

        double avg = (double)(grade1 + grade2 + grade3) / 3;

        System.out.println(avg);
    }
            
    
    public static void problemFive()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scan.nextInt();
        System.out.println("Enter num3: ");
        int num3 = scan.nextInt();

        System.out.println(Math.min(num1, Math.min(num2, num3)));
    }
    
    public static void problemSix()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = scan.nextInt();
        System.out.println("Enter x2: ");
        int x2 = scan.nextInt();
        System.out.println("Enter y1: ");
        int y1 = scan.nextInt();
        System.out.println("Enter y2: ");
        int y2 = scan.nextInt();
        
        
        float distance = (float) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        
        System.out.println("The distance is: " + distance);
    }

    public static void main(String[] args) {
//        problemOne();
        // problemTwo();
        // problemThree();
        // problemFour();
        // problemFive();
        // problemSix();
    }
}
