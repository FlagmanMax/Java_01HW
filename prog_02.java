// Вывести все простые числа от 1 до 1000
import java.util.Scanner;

public class prog_02 {
    public static void main(String[] args) {
        System.out.printf("Введите число n: ");
        
        Scanner iScanner = new Scanner(System.in, "CP866");
        int n = iScanner.nextInt();

        int count = 0;

        for (int i=2;i<=n;i++)
        {
            for (int j = 2; j<=i; j++)
            {
                if (i%j == 0)
                {
                    if (i == j)
                    {
                        System.out.printf("%d ",i);
                        count++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
        System.out.printf("\nВсего %d простых чисел ",count);
        iScanner.close();
    }    
}
