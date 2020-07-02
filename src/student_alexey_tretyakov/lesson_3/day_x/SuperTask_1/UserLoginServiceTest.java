package student_alexey_tretyakov.lesson_3.day_x.SuperTask_1;

public class UserLoginServiceTest {
    public static void main(String[] args) {

        User userOne = new User("Alex", "alex123");
        //User userLastState = userOne;
        //userLastState.userCondition();
        //System.out.println("User condition BEFORE tests:");
        userOne.userCondition();
        UserLoginService service = new UserLoginService ();
        boolean loginTest = service.login( userOne ,"alex123" );
        if ( loginTest ) {
            System.out.println("Test OK, user not blocked");
        } else {
            System.out.println("Test FAIL, user is blocked");
        }
        //userOne = userLastState;

        System.out.println("Change input password.");
        loginTest = service.login( userOne ,"Alex123" );
        if ( !loginTest ) {
            System.out.println("Test OK. Logon password not equals to user password.");
        } else {
            System.out.println("Test FAIL !!! Wrong comparing logon password and user password .");
        }
        //userOne = userLastState; //

        System.out.println("Change number of attempts.");
        int i = userOne.userTimes;
        //userOne.userTimes = 3;
        System.out.println(" Now attempt number set is = " + userOne.userTimes);
        do {
            loginTest = service.login( userOne, "alex123" );
            if ( loginTest ) {
                System.out.println("Test OK. Attempt number after good logon = " + userOne.userTimes );
                break;
            } else {
                System.out.println("Test FAIL !!! Attempt number = " + userOne.userTimes );
            }
            i++;
        } while ( ( 0<=i )&&( i <= 3 ) );

    }

}


