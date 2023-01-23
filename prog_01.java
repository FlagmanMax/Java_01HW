// Вычислить:
//  n-ое треугольного число (сумма чисел от 1 до n),
//  n! (произведение чисел от 1 до n) 
// Пример: n = 5 
// 5 тр = 1+2+3+4+5 = 
// 5! = 1*2*3*4*5 = 
import java.util.Scanner;

public class prog_01{
    public static void main(String[] args) {
        
        System.out.printf("Введите число n: ");

        Scanner iScanner = new Scanner(System.in, "CP866");
        int n = iScanner.nextInt();
        
        int sum = Sum(n);
        System.out.printf("Сумма %d элементов ряда = %d\n",n,sum);

        int prod = Prod(n);
        System.out.printf("Произведение %d элементов ряда = %d\n",n,prod);

        iScanner.close();

    }

    static int Sum(int n){
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum += i;
            if (i != n){
                System.out.printf("%d + ",i);
            }
            else{
                System.out.printf("%d",i);
            }
        }
        System.out.printf(" = %d\n",sum);

        return sum;
    } 

    static int Prod(int n){
        int prod = 1;
        for (int i=1;i<=n;i++){
            prod *= i;
            if (i != n){
                System.out.printf("%d * ",i);
            }
            else{
                System.out.printf("%d",i);
            }
        }
        System.out.printf(" = %d\n",prod);

        return prod;
    } 
}