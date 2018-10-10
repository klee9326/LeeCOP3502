import java.util.Scanner;

public class SciCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double RESULT = 0;
        int input1 = 1;
        double sum = 0;//sum of results
        int numCal = 0;//number of calculation
        double fInput2;
        double fInput3;

        while(input1 != 0)//until input1 is 0
        {
            if(input1 < 7)
            {
                if (input1 > 0)
                {
                    System.out.println("Current Result: " + RESULT);
                    System.out.println();
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2.Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average");
                    System.out.println();
                }
            }
            System.out.print("Enter Menu Selection: ");
            input1 = input.nextInt();

            if(input1 == 7)
            {
                if (numCal == 0)//if it doesn't have sum and number of calculation
                {
                    System.out.println();
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println();
                    System.out.print("Enter Menu Selection: ");
                    input1 = input.nextInt();
                }
            }
            switch(input1)//different calculation according to input1
            {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter first operand: ");
                    String input2 = input.next();
                    if(input2.equals("RESULT"))//if input "RESULT"
                    {
                        fInput2 = RESULT;
                    }
                    else//if input just numbers
                    {
                        fInput2 = Double.parseDouble(input2);//String to double
                    }
                    System.out.print("Enter second operand: ");
                    String input3 = input.next();
                    System.out.println();
                    if(input3.equals("RESULT"))
                    {
                        fInput3 = RESULT;
                    }
                    else
                    {
                        fInput3 = Double.parseDouble(input3);
                    }
                    RESULT  =fInput2 + fInput3;
                    numCal += 1;
                    sum += RESULT;
                    break;
                case 2:
                    System.out.print("Enter first operand: ");
                    input2 = input.next();
                    if(input2.equals("RESULT"))
                    {
                        fInput2 = RESULT;
                    }
                    else
                    {
                        fInput2 = Double.parseDouble(input2);
                    }
                    System.out.print("Enter second operand: ");
                    input3 = input.next();
                    System.out.println();
                    if(input3.equals("RESULT"))
                    {
                        fInput3 = RESULT;
                    }
                    else
                    {
                        fInput3 = Double.parseDouble(input3);
                    }
                    RESULT = fInput2 - fInput3;
                    numCal += 1;
                    sum += RESULT;
                    break;
                case 3:
                    System.out.print("Enter first operand: ");
                    input2 = input.next();
                    if(input2.equals("RESULT"))
                    {
                        fInput2 = RESULT;
                    }
                    else
                    {
                        fInput2 = Double.parseDouble(input2);
                    }
                    System.out.print("Enter second operand: ");
                    input3 = input.next();
                    System.out.println();
                    if(input3.equals("RESULT"))
                    {
                        fInput3 = RESULT;
                    }
                    else
                    {
                        fInput3 = Double.parseDouble(input3);
                    }
                    RESULT = fInput2 * fInput3;
                    numCal += 1;
                    sum += RESULT;
                    break;
                case 4:
                    System.out.print("Enter first operand: ");
                    input2 = input.next();
                    if(input2.equals("RESULT"))
                    {
                        fInput2 = RESULT;
                    }
                    else
                    {
                        fInput2 = Double.parseDouble(input2);
                    }
                    System.out.print("Enter second operand: ");
                    input3 = input.next();
                    System.out.println();
                    if(input3.equals("RESULT"))
                    {
                        fInput3 = RESULT;
                    }
                    else
                    {
                        fInput3 = Double.parseDouble(input3);
                    }
                    RESULT = fInput2 / fInput3;
                    numCal += 1;
                    sum += RESULT;
                    break;
                case 5:
                    System.out.print("Enter first operand: ");
                    input2 = input.next();
                    if(input2.equals("RESULT"))
                    {
                        fInput2 = RESULT;
                    }
                    else
                    {
                        fInput2 = Double.parseDouble(input2);
                    }
                    System.out.print("Enter second operand: ");
                    input3 = input.next();
                    System.out.println();
                    if(input3.equals("RESULT"))
                    {
                        fInput3 = RESULT;
                    }
                    else
                    {
                        fInput3 = Double.parseDouble(input3);
                    }
                    RESULT = Math.pow(fInput2, fInput3);
                    numCal += 1;
                    sum += RESULT;
                    break;
                case 6:
                    System.out.print("Enter first operand: ");
                    input2 = input.next();
                    if(input2.equals("RESULT"))
                    {
                        fInput2 = RESULT;
                    }
                    else
                    {
                        fInput2 = Double.parseDouble(input2);
                    }
                    System.out.print("Enter second operand: ");
                    input3 = input.next();
                    System.out.println();
                    if(input3.equals("RESULT"))
                    {
                        fInput3 = RESULT;
                    }
                    else
                    {
                        fInput3 = Double.parseDouble(input3);
                    }
                    RESULT = Math.log10(fInput3) / Math.log10(fInput2);
                    numCal += 1;
                    sum += RESULT;
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Sum of calculations: " + sum);
                    System.out.println("Number of calculations: " + numCal);
                    double average = Math.round((sum / numCal) * 100.0) / 100.0;//round the number to two decimal places 
                    System.out.println("Average of calculations: " + average);
                    System.out.println();

                    break;
                default://when input 1 is not 0 to 7
                    System.out.println();
                    System.out.println("Error: Invalid selection!");
                    System.out.println();
                    break;
            }
        }
        System.out.println();
        System.out.println("Thanks for using this calculator. Goodbye!");
    }
}




