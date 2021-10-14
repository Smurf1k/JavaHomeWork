import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getInt();
        char sign = getsign();
        int operand2 = getInt();
        int result = calc(operand1, operand2, sign);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt(){
        System.out.println("Введите число: ");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа.");
            scanner.next();
            operand = getInt();
        }
        return operand;
    }

    public static char getsign(){
        System.out.println("Введите операцию: ");
        char sign;
        if(scanner.hasNext()){
            sign = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции.");
            scanner.next();
            sign = getsign();
        }
        return sign;
    }

    public static int calc(int operand1, int operand2, char sign) {
        int result;
        switch (sign) {
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                if (operand2 != 0)
                    result = operand1/operand2;
                else
                    System.out.println("На ноль делить некрасиво :/");
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, operand2, getsign());
        }
        return result;
    }
}
