import java.util.Scanner;
public class Calculator {

    public void menu(){

        Scanner answerInput = new Scanner(System.in);


        System.out.println("What do you want to calculate my friend?");
        System.out.println("add " + "+");
        System.out.println("subtract " + "-");
        System.out.println("multiply " + "*");
        System.out.println("divide " + "-");
        System.out.println("EXIT");
        
    String choiceOfStyle = answerInput.nextLine();
switch (choiceOfStyle) {
    case "add":
    case "+":
    Add add = new Add();
    add.addingNr();
    break;
        
    case "subtract":
    case "-":
        Subtract subtract = new Subtract();
        subtract.subtractNr();
        break;

    case "multiply":
    case "*":
        Multiply multiply = new Multiply();
        multiply.multiplyNr();
        break;
    case "divide":
    case "/":
        Divide divide = new Divide();
        divide.divideNr();
        break;
    case "EXIT":
        System.out.println("EXIT");
        System.exit(0);
        break;
    default:
    System.out.println("Invalid brother");
        break;
}

    }   
}
