import java.util.Scanner;



// José Rivera
// A sweet program to show what what I have learned in COP 2006 with a Pizzaria Theme
// downloaded java-google-style and Cntrl+Shift+F automatically formatts the project.
public class first {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello, How can I help?");
    /*
     * int num1; // Person john = new Person(); // john.height = 72; // System.out.println();
     */
    // Integer saves a number/integer with no fraction number to a stated variable.
    System.out.println("How large is your party?");
    // final makes the variable immutable. Casting allows me to make a number into another value.
    final int party = scan.nextInt();

    /*
     * Here I am using an if/else statement with conditional operators to create conditions of how
     * large the party is
     */
    if (party < 5) {
      System.out.println("Come Right this way please.");
    } else if (party >= 5 && party < 10) {
      int timewait = party * 2;
      System.out.println("The wait is going to be " + timewait);
    } else {
      int timewait = party * 3;
      System.out.println("The wait time will be " + timewait);
    }

    // String saves a series of characters to a declared variable.
    String str1 = "So we have ";
    String str2 = "six different pizzas for you today.";

    System.out.println(str1 + str2);

    // Double saves numbers with decimals/fractional numbers to a stated variable.
    double doub1 = 4.2;
    double doub2 = 7.8;
    double doub3 = doub1 + doub2 + party;

    // Boolean is an expression that can type a distinguish between a true or false statement.
    if (doub3 > 22) {
      System.out.println("We have a special for parties of 10 and above.");
    }

    // final makes the variable immutable. Casting allows me to make a number into another value.
    final int num3 = 10;
    int num4 = 2;
    double result = (double) num3 / num4;
    System.out.println(result);

    // these are string methods
    String str3 = "It has eight slices. Plus ";

    System.out.println(str3 + str3.length() + " toppings.");

    String str4;
    str4 =
        "So if you look at the menu please select a number from 1 through 5 to select your pizza.";

    System.out.println(str4.toUpperCase());


    /* Here I am using a switch statement to get a selection of pizza from a single customer */
    int selection = scan.nextInt();
    String statement;

    switch (selection) {
      case 1:
        statement = "Pina-apple";
        break;
      case 2:
        statement = "Cheese";
        break;
      case 3:
        statement = "Pepporonie";
        break;
      case 4:
        statement = "Meat-Lover";
        break;
      case 5:
        statement = "Hawaiin";
        break;
      case 6:
        statement = "Cheese-stuffed";
        break;
      default:
        statement = "Sorry we don't Have it.";
        break;
    }
    System.out.println(statement);

    System.out.println("Enter pizza diameter:");
    double pizzaDiameter = scan.nextInt();
    System.out.println("Enter pizza price:");
    double pizzaPrice = scan.nextInt();

    /*
     * Here I'm calling the method calculatePricePerinch using pizzaDiameter and pizzaPrice as
     * arguments
     */
    double pricePerInch = calculatePricePerInch(pizzaDiameter, pizzaPrice);
    System.out.println("Pizza price per inch = " + pricePerInch);

    System.out.println("Heres the random Number of the day! ");
    System.out.println(Math.random());

    System.out.println("*Time passes and everyone finishes their meal*");

    System.out.println("Alright and how many checks are we splitting this into?");

    int check = scan.nextInt();
    String statement2;

    switch (check) {
      case 1:
        statement2 = "Aren't you all a happy family.";
        break;
      case 2:
        statement2 = "Half and half";
        break;
      case 3:
        statement2 = "Three is a party in my book ;)";
        break;
      case 4:
        statement2 = "Alright no problem.";
        break;
      case 5:
      case 6:
        statement2 = "Sir, yes sir";
        break;
      default:
        statement2 = "Alright, I'll be right back.";
        break;
    }

    System.out.println(statement2);

    /*
     * Here is another if/else conditional statement with other operators to find the total of the
     * check
     */
    int tip;
    if (check <= 2) {
      check = check++;
      tip = check + 40;
    } else if (check > 2 && check <= 6) {
      check += check;
      tip = check + 25;
    } else if (check > 6 && check <= 10) {
      check = check--;
      tip = check + 15;
    } else {
      tip = check + 10; 
    }
    System.out.println("Alright here is the equal total for each check $" + tip);

    String foodString1 = "";
    String foodString2 = "";

    /*
     * Evaluates to true because the two previous variables are equal but here I'm using it for a
     * cheesy quote
     */
    System.out.println("Stay " + foodString1.equals(foodString2) + " to youreslf!");

    scan.close();
  }


  // In this method we are accepting diameter and price as parameters and returning a double value
  public static double calculatePricePerInch(double diameter, double price) {

    double ppi;
    double radius = diameter / 2.0;
    double area = Math.PI * Math.pow(radius, 2);
    ppi = price / area;
    return ppi;

  }



}

