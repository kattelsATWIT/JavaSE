import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int num2 = in.nextInt();


        System.out.println("Integer Entered is: "+ num);
        System.out.println("Integer Second is: " + num2);

        int num_total = (num + num2);

        System.out.printf("Summation of 2 integer is: " + num_total);


    }
    
}
