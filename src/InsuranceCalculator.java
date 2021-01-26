public class InsuranceCalculator {

    private InsuranceStratagy strategy;

    public double calculateInsurance(double income) {


        if (income <= 10000) {
            strategy = new InsuranceStratagylow();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStratagymedium();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStratagyHigh();
            return strategy.calculateInsuranceVeryHigh(income);
        } else {
            strategy = new InsuranceStrategyVeryHigh(this);
            return strategy.calculateInsuranceVeryHigh(income);
        }

    }




}
