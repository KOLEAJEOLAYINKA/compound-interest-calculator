package CompoundInterestCalculator;

public class CompoundInterest {
    private double FinalAmount;
    private double Principal;
    private double InterestRate;
    private double NumberOfTimeInterestApplied;
    private double Time;

    public void Principal(double principal) {
        this.Principal = principal;
    }

    public void InterestRate(double InterestRate) {
        this.InterestRate = InterestRate;
    }

    public void NumberOfTimeInterestApplied(double number) {
        this.NumberOfTimeInterestApplied = number;
    }

    public void Time(double time) {
        this.Time = time;
    }

    public void FinalAmount(double amount) {
        this.FinalAmount = amount;
    }

    public double getFinalAmount() {
        return FinalAmount;

    }

    public double getPrincipal() {
        return Principal;

    }

    public double getInterestRate() {
        return InterestRate;
    }

    public double getNumberOfTimeInterestApplied() {
        return NumberOfTimeInterestApplied;
    }

    public double getTime() {
        return Time;
    }

    public double getA() {
        double Rate = InterestRate / 100;
            double cal0 = (1 + Rate/NumberOfTimeInterestApplied);
        double cal1 = Principal * cal0;
        double cal2 = NumberOfTimeInterestApplied * Time;
        return Math.pow(cal1, cal2);
    }

    public double getP() {
        double cal0 = FinalAmount * (1 + InterestRate / NumberOfTimeInterestApplied);
        double cal1 = NumberOfTimeInterestApplied * Time;
        return Math.pow(cal0, cal1);

    }

    public double getR() {
        double cal0 = (FinalAmount / Principal);
        double cal1 = (1 / NumberOfTimeInterestApplied * Time);
        double cal2 = Math.pow(cal0, cal1);
        double cal3 = (cal2 - 1);
        return (NumberOfTimeInterestApplied * cal3);
    }

    public double I() {
        return Time * Principal * InterestRate;
    }

    public double T() {
        return I() / (Principal *InterestRate);
    }
}
