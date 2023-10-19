import java.util.Scanner;

public class GetValue {
    private Scanner myObj;

    public GetValue() {
        myObj = new Scanner(System.in);
    }

    public int getValueFromUser() {
        System.out.print("Guess a number: ");
        return myObj.nextInt();
    }
}
