package student_georgij_galin.lesson3.day_4;

public class Car {

    private final String model;
    private final String owner;

    public Car(String model, String owner) {
        //
        this.model = model;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }
    public String getOwner(){
        return owner;
    }
}