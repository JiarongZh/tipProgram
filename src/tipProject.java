import java.util.Scanner;
import java.text.DecimalFormat;
public class tipProject {
    public static void main (String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Tip Calculator!!!!");
     System.out.print("How many people are in your group: ");
     int numPeople = scan.nextInt();
     System.out.print("What's the tip percentage (0-100) ");
     int tipPercentage = scan.nextInt();
     System.out.print("How many meals did you guys order? ");
     int numMeals = scan.nextInt();
     int n = 1;
     double totalCost = 0.0;
     while (n<numMeals){
         System.out.print("Enter the cost of a meal");
         double meal = scan.nextDouble();
         totalCost += meal;
         n++;
         meal = 0;
        }
     double tip = totalCost * (tipPercentage/100.0);
     double totalCostAftTip = totalCost + tip;
     System.out.println("Your Receipt: ");
     System.out.println("-------------------");
     System.out.println("Your total bill before tip is: " + totalCost);
     System.out.println("Tip: " + tip);

    }
}
