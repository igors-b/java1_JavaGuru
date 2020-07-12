package student_valerija_ionova.lesson_x_task_1_7;

/*Работа с enum TransactionType.

Создайте класс TransactionTypeDemo и в нём попробуйте выполнить следующие операции:

- объявление переменной типа enum:
    TransactionType deposit = TransactionType.DEPOSIT;
    TransactionType withdrawal = TransactionType.WITHDRAWAL;
    TransactionType transactionType = TransactionType.WITHDRAWAL;
- присвоение нового заначения переменной типа enum:
    TransactionType transactionType = TransactionType.WITHDRAWAL;
    transactionType = TransactionType.DEPOSIT;
- сравнение переменной типа enum:
    TransactionType transactionType = TransactionType.WITHDRAWAL;
    if (transactionType == TransactionType.WITHDRAWAL) {
        System.out.println("This transaction is withdrawal transaction!");
    }
    transactionType = TransactionType.DEPOSIT;
    if (transactionType == TransactionType.DEPOSIT) {
        System.out.println("This transaction is deposit transaction!");
    }
*/

public class TransactionTypeDemo {

    public static void main (String[] args) {
        TransactionType deposit = TransactionType.DEPOSIT;
        TransactionType withdrawal = TransactionType.WITHDRAWAL;
        TransactionType transactionType = TransactionType.WITHDRAWAL;

        transactionType = TransactionType.DEPOSIT;

        if (transactionType == TransactionType.DEPOSIT) {
            System.out.println("This transaction is deposit transaction!");
        }

        transactionType = TransactionType.WITHDRAWAL;
        if (transactionType == TransactionType.WITHDRAWAL) {
            System.out.println("This transaction is withdrawal transaction!");
        }

    }

}
