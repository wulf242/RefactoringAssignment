public class InsuranceStrategyVeryHigh extends InsuranceStratagy {


    public InsuranceStrategyVeryHigh(InsuranceCalculator insuranceCalculator) {
    }

    @Override
    public int getConstant() {
        return 105600;
    }

    @Override
    public double getWeight() {
        return 0.02;
    }

    @Override
    public int getAdjustment() {
        return 60000;
    }
}