public class InsuranceStratagymedium extends InsuranceStratagy {
    @Override
    public int getConstant() {
        return 35600;
    }

    @Override
    public double getWeight() {
        return 0.2;
    }

    @Override
    public int getAdjustment() {
        return 10000;
    }
}
