package student_igors_bartkevics.lesson_12.homework.level_2_intern;

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // созжайте конструктор класса, в котором вы получите значения указанных свойств
    BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    // создайте get() методы для каждого из свойств


    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
