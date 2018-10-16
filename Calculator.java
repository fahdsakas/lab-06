import java.util.Scanner;
public class Calculator
{
    public static void main(String[]args){
        //Partner name: Tuan Le
        Scanner input = new Scanner(System.in);
        double firstOperand;
        double secondOperand;//these will be the operands used for the calculations
        int menuChoice;// this will let the user choose his/her operation
        double answer;
        System.out.println("Enter first operand:");
        firstOperand=input.nextDouble();
        System.out.println("Enter second operand:");
        secondOperand=input.nextDouble();
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Which operation do you want to perform?");
        menuChoice=input.nextInt();
        switch(menuChoice)//to perform operation user chooses
        {
            case 1:
                answer= firstOperand + secondOperand;
                System.out.println("The result of the operation is " + answer + ". Goodbye!");
                break;
            case 2:
                answer= firstOperand - secondOperand;
                System.out.println("The result of the operation is " + answer + ". Goodbye!");
                break;
            case 3:
                answer= firstOperand*secondOperand;
                System.out.println("The result of the operation is " + answer + ". Goodbye!");
                break;
            case 4:
                answer=firstOperand/secondOperand;
                System.out.println("The result of the operation is " + answer + ". Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid selection! Terminating program."); // This is what will display if they don't pick a proper number
        }



    }
}
 // comment
