import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int ppl = scan.nextInt();

        System.out.print("What's the tip precentage? (0 - 100): ");
        int tip = scan.nextInt();

        TipCalculator tipCalc = new TipCalculator(ppl, tip);


        double num   = 0.0;
        double total = 0.0;


        while (num != -1) {
            //total += num; //add previous number
            tipCalc.addMeal(num);
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            num = scan.nextDouble();

        }

        scan.close();


        System.out.println("------------------------------------");

        System.out.println("Total bill before Tip: "+ formatter.format(tipCalc.getTotalBillBeforeTip()));

        System.out.println("Tip Percentage: "+ formatter.format(tipCalc.getTipPercentage()));

        System.out.println("Total Tip: " + formatter.format(tipCalc.tipAmount()));

        System.out.println("Total Bill with Tip: "+ formatter.format(tipCalc.totalBill()));

        System.out.println("Per Person Cost Before Tip:  "+ formatter.format(tipCalc.perPersonCostBeforeTip()));

        System.out.println("Tip Per Person:  "+ formatter.format(tipCalc.perPersonTipAmount()));

        System.out.println("Total Cost Per Person: "+ formatter.format(tipCalc.perPersonTotalCost()));


    }
}
