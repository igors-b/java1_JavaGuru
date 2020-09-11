package student_aleksandra_maksimovic.lesson_9.level_6;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName){
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t){
        return(t.getTrader().getCountry().equals("Jamaica"));
    }
}
