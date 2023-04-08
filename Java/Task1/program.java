package Task1;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        Integer numb = iScanner.nextInt();
        iScanner.close();

        int tr_number=0;
        int n = 1;
        for (int i=1; i <= numb; i++) {
            tr_number = tr_number+i;
            n=n*i;
        }
        System.out.printf("Треугольное число: %d \n", tr_number);
        System.out.printf("n!: %d", n);
        iScanner.close();

    }
}
