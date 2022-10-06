

public class TipCalculator {

    int numPeople;
    int tipPercantage;
    double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercantage) {
        this.numPeople = numPeople;
        this.tipPercantage = tipPercantage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public double getTipPercentage() {
        return tipPercantage;
    }
    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }
    public double tipAmount() {
        return (tipPercantage/100.0)*getTotalBillBeforeTip();
    }
    public double totalBill() {
        return (1+(tipPercantage/100.0))*getTotalBillBeforeTip();
    }
    public double perPersonCostBeforeTip() {
        return getTotalBillBeforeTip()/numPeople;
    }
    public double perPersonTipAmount() {
        return tipAmount()/numPeople;
    }
    public double perPersonTotalCost() {
        return totalBill()/numPeople;
    }

    //DecimalFormat formatter = new DecimalFormat("#.##");




}
