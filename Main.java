public class Main {
    public static void main(String[] args) {
        double randomNum = Math.floor(Math.random()*100); // If u want to guess numbers between 1-1000, change it to 1000.
        // To turn double into int.
        int intRandomNum  = (int) randomNum;
        // We called constructors.
        GetValue getValue = new GetValue();

        boolean found = false;
        while(!found){
            int userGuess = getValue.getValueFromUser();
            if(userGuess == intRandomNum){
                System.out.println("You have found the number!");
                found = true;
            }
            else if(userGuess > intRandomNum){
                System.out.println("Try lower!");
            }
            else{
                System.out.println("Try higher!");
            }
        }
    }
}
