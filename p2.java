import java.io.*;
import java.util.*;
class p2
{
public static void problem8()throws IOException
{
        Scanner input = new Scanner(System.in);  
        System.out.println("Input odd number ");
        String number = input.nextLine();
        int n = Integer.parseInt(number);
        for (int i = 1; i < n+1; i +=2) {
            for (int j = 0; j < n-i / 2; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (int i = n-2; i > 0; i -= 2) {
            for (int j = 0; j < n - i/2; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}