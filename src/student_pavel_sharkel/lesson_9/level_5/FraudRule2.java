package student_pavel_sharkel.lesson_9.level_5;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if ((t.getAmount() > 1000000) || (t.getAmount() <= 0)) {
            return false;
        } else {
            return true;
        }
    }
}
