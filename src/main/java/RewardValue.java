public class RewardValue {
    private double cashValue;
    private int milesValue;

    //constructor to accept cashValue
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }
    //constructor to accept milesValue
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    //method to return cashValue
    public double getCashValue() {

        return cashValue;
    }

    //method to return milesValue
    public double getMilesValue() {
        return milesValue;
    }


}
