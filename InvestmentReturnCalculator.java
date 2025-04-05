public class InvestmentReturnCalculator {

    final double monthlyReturn = 1.011715;
    final double yearlyReturn = 1.15;
    double monthlyInvestment;
    double yearlyInvestment;

    public static void main(String[] args) {
        fetchInfo();
    }

    private static void fetchInfo() {
        System.out.println("What type of investment do you want to calculate?\n" + //
                "1. Monthly Investment\n" + //
                "2. Yearly Investment");

    }
}
