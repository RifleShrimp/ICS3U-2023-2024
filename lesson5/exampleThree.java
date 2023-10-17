package lesson5;

import java.util.Scanner;

public class exampleThree {
 public static void main(String[] args) {

    System.out.print("Enter CAD: ");

 Scanner input = new Scanner(System.in);
 double cad = input.nextInt();
 double usd = cad * 1.25;

    System.out.println();
    System.out.print("CAD converted to USD: ");
 System.out.print(usd);

input.close();
 }
}
