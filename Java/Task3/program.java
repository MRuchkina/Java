package Task3;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        Integer n1 = iScanner.nextInt();

        System.out.printf("Введите знак: ");
        String sign = iScanner.next();

        System.out.printf("Введите число: ");
        Integer n2 = iScanner.nextInt();
        iScanner.close();

        switch(sign)
        { 
            case "+":
                System.out.printf("Результат: %d", n1+n2);
                break;
            case "-":
                System.out.printf("Результат: %d", n1-n2);
                break;
            case "/":
                System.out.printf("Результат: %d", n1/n2);
                break;
            case "*":
                System.out.printf("Результат: %d", n1*n2);
                break;
            default:
            System.out.printf("Неверно заданы условия");
        }
    }
}
