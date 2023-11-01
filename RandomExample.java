/*  //program that generate array of random numbers
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class RandomExample {
    public static void main(String[] args) throws IOException {
        double x[] = new double[20];
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            x[i] = r.nextInt(100);
            System.out.println(x[i]);
        }
        double[] arr = new double[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Math.random();
            // to copy on another variable
            double[] b = new double[4];
            for (int j = 0; j < 4; j++) {
                b[j] = arr[j];
                // to print the value of the array
                for (int k = 0; k < 4; k++) {
                    System.out.println(arr[k]);
                }
            }
        }
    }
} 


// write a program that display sum of 100 integers
public class RandomExample {
    public static void main(string[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}


//program to display number of between two numbers
import java.util.Scanner;
public class RandomExample {
    public static void main(string[] args) 
    {
        Scanner input = new scanner(System.in);
        int num1= input.nextInt();
        int num2=input.nextInt();
        int count=0;
        for(int i=num1; i<num2; i++)
        {
            count++;
        } 
        System.out.println("The nummber of integers betwee"+num1+" and "+num2+ "="+ count);
    }
}
*/

//sumof even integers between 2 and the given number
import java.util.Scanner;

public class RandomExample {
    public static void main(string[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer umber: ");
        int num = input.nextInt();
        int sum = 0;
        if (num < 2) {
            System.out.println("You entered Invalid number");
        } else {
            for (int i = 2; i < num; i += 2) {
                sum += i;
            }
            System.out.println("The sum of integers is: " + sum);
        }

    }
}
