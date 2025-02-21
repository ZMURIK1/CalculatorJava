import java.util.Scanner;

public class Main {

    private static String action;
    private static int firstNum;
    private static int secondNum;

    public static void main(String[] args) {
        // Создали объект для ввода
        Scanner scanner = new Scanner(System.in);

        // Ввели пример
        System.out.print("Введите пример: ");
        String task = scanner.nextLine();

        // Вызвали функцию для разделения строки
        splitString(task);

        // Перебор действий
        switch (action){
            case "+":
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;
            case "-":
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;
            case "*":
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                break;
            case "/":
                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                break;
            case "^":
                System.out.println(degree(firstNum, secondNum));
                break;
            case "!":
                System.out.println(factorial(firstNum));
                break;
            case "`":
                numFibonachi(firstNum);
                break;
        }
    }

    static void splitString(String task){
        String[] taskArray = task.split(" ");
        int countElement = taskArray.length;

        if (countElement == 2){
            firstNum = Integer.parseInt(taskArray[0]);
            action = taskArray[1];
        } else if(countElement == 3){
            firstNum = Integer.parseInt(taskArray[0]);
            action = taskArray[1];
            secondNum = Integer.parseInt(taskArray[2]);
        }
    }

    static int degree(int firstNum, int secondNum){
        int degreeNum = 1;
        for (int i = 0; i < secondNum; i++){
            degreeNum *= firstNum;
        }
        return  degreeNum;
    }

    static int factorial(int firstNum){
        int factorialNum = 1;
        for (int i = 1; i <= firstNum; i++){
            factorialNum *= i;
        }
        return factorialNum;
    }

    static void numFibonachi(int firstNum){
        int a = 1;
        int b = 0;
        int count = 0;

        System.out.print(a + " ");

        while (a + b <= firstNum){
            System.out.print(a+b + " ");
            if (count % 2 == 0) {
                b += a;
                count++;
            } else {
                a += b;
                count++;
            }
        }
    }
}