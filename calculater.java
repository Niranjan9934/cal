import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float num1, num2;
        System.out.println(" Enter first number");
        Scanner scan= new Scanner(System.in);
        num1= scan.nextFloat();
        System.out.println("Enter second number");
        num2 = scan.nextFloat();
        System.out.print(" Entered number are ");
        System.out.print( num1 );
        System.out.print("and");
        System.out.print(num2);
        String massage = "Enter 1 for additon , 2 for substracgion ,3 for muntinplication and 4 for division";
        System.out.println(massage);
        int value = scan.nextInt();
        switch (value) {
            case 1:
                System.out.print(" the resunt after the additin of the numbers is :");
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.print(" the resunt of substracint ");
                System.out.print(num1-num2);
                break;
            case 3:
                System.out.print(" the multiplicatin of the two number");
                System.out.println( num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println(" invialid input");



        }

//                System.out.println("sum of " + s);
    }
}