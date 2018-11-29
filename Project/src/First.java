import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;



// José Rivera
// A sweet program to show what what I have learned in COP 2006
// downloaded java-google-style and Cntrl+Shift+F automatically formatts the project.
public class First {



  public static void main(String[] args) throws InterruptedException {

    // Integer saves a number/integer with no fraction number to a stated variable.
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello World");

    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    System.out.println(num1 + num2);

    // Double saves numbers with decimals/fractional numbers to a stated variable.
    double doub1 = 4.5;
    double doub2 = 7.8;
    double doub3 = doub1 + doub2;

    System.out.println(doub3);

    // String saves a series of characters to a stated variable.
    String str1 = "This prints";
    String str2 = " my string variables.";

    System.out.println(str1 + str2);

    // Boolean is an expression that can type a distinguish between a true or false statement.
    if (doub3 > 10) {
      System.out.println("This is a nice looking number");
    }

    // final makes the variable immutable. Casting allows me to make a number into another value.
    final int num3 = 5;
    int num4 = 2;
    double result = (double) num3 / num4;
    System.out.println(result);

    // these are string methods
    String str3 = "Length shows the length of the String. ";

    System.out.println(str3 + str3.length());

    String str4 = "UpperCase changes the selected characters to upper case letters. ";
    String str5 = "And LowerCase does the opposite";

    System.out.println(str4.toUpperCase() + str5);



    int selection = scan.nextInt();
    String statement;
    // switch statement
    switch (selection) {
      case 1:
        statement = "Hello World";
        break;
      case 2:
        statement = "Hell Yeahhhh";
        break;
      case 3:
        statement = "Peanut";
        break;
      case 4:
        statement = "Butter";
        break;
      case 5:
        statement = "Jelly";
        break;
      case 6:
        statement = "Time";
        break;
      default:
        statement = "Way Yeah";
        break;
    }
    System.out.println(statement);

    System.out.println("Enter pizza diameter:");
    double cakeDiameter = scan.nextInt();
    System.out.println("Enter pizza price:");
    double cakePrice = scan.nextInt();

    // method call
    double pricePerInch = calculatePricePerInch(cakeDiameter, cakePrice);
    System.out.println("Pizza price per inch = " + pricePerInch);

    System.out.println("Heres a random Number! ");
    System.out.println(Math.random());

    System.out.println();
    Character char1 = new Character("Arbiter", 500);
    System.out.println(char1.getName());
    System.out.println(char1.getHealth());

    Character char2 = new Character();
    System.out.println(char2.getName());
    System.out.println(char2.getHealth());

    // random number generator
    Random randomGen = new Random();

    System.out.println(randomGen.nextInt(53) + 1);

    int n = scan.nextInt();

    for (int i = 1; i <= 10; i++) {
      int num = n * i;
      System.out.println(n + " x " + i + " = " + num);
    }

    int testCases = scan.nextInt();
    String str = scan.nextLine();

    // while loop
    while (testCases >= 0) {
      str = scan.nextLine();

      char[] charArray = str.toCharArray();

      for (int j = 0; j < str.length(); j++) {
        if (j % 2 == 0) {
          System.out.print(charArray[j]);
        }
      }
      System.out.print(" ");

      // enhanced for loop
      for (int j = 1; j < str.length(); j++) {
        // even though it says a problem it's not it works correctly
        if (j % 2 == 1) {
          System.out.print(charArray[j]);
        }
      }
      System.out.println();

      testCases--;
    }

    // 2D integer array using a for loop
    int[][] board = new int[3][3];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = i + j;
      }
    }

  }

  // new method declirations
  public static double calculatePricePerInch(double diameter, double price) {

    double cpi;
    double radius = diameter / 2.0;
    double area = Math.PI * Math.pow(radius, 2);
    cpi = price / area;
    return cpi;

  }

  // sum of array
  static int simpleArraySum(int[] ar) {
    int sum = 0;
    for (int i = 0; i < ar.length; i++) {
      sum += ar[i];
    }
    return sum;
  }


}

