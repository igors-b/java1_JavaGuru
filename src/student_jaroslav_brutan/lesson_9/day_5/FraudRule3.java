package student_jaroslav_brutan.lesson_9.day_5;

class FraudRule3 extends FraudRule {

    public FraudRule3(String FraudRule3) {
        super(FraudRule3);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }
}
