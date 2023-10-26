public class RewardValue {
    private double cashValue;
    private int milesValue;

    //constructor to accept cashValue
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    //constructor to accept milesValue
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    //method to return cashValue
    public double getCashValue() {
        return cashValue;
    }

    //method to return milesValue
    public double getMilesValue() {
        milesValue = (int) (cashValue / 0.0035);
        return milesValue;
    }


}
