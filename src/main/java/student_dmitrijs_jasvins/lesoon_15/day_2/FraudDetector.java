package student_dmitrijs_jasvins.lesoon_15.day_2;

public class FraudDetector {
    public boolean isFraud(Trader trader) {
        return compareTraderName(trader) || (compareCity(trader));
    }

    private boolean compareTraderName (Trader trader) {
        return trader.getFullName().equals("Pokemon");

    }

    private boolean compareCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }
}
