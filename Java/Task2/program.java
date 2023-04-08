package Task2;

public class program {
    public static void main(String[] args) {
        System.out.printf("Простые числа: 1, ");
        for(int i=2; i!=1000; i++)
        {
            boolean res = true;
            for(int j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    res = false;
                    break;
                }
            }
            if (res == true)
            {
                System.out.printf("%d, ", i);
            }
        }
    }
}

