import java.util.Scanner;

public class Divide {
    public void divideNr(){
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Write two numbers you wanna divide");

        if (scanner1.hasNextInt()){

            
        int firstNumber = scanner1.nextInt();//bevarar användarens första siffra. 
        System.out.println("and?");
        int secondNumber = scanner1.nextInt();
        int sum = firstNumber / secondNumber;

        System.out.println("The total is " + sum);
    }
            else{
                System.out.println("You must use intergers!!!!!!mf");
            }
    }
    
}
