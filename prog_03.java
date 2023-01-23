// Реализовать простой калькулятор 
// Scanner sc = ... int a = sc.nextLine int b = sc.nextLine
import java.util.Scanner;

public class prog_03 {
    public static void main(String[] args) {
        System.out.printf("Вас приветствует калькулятор!\n\n");
        
        Scanner iScanner = new Scanner(System.in, "CP866");
        while(true){  
            
            
            System.out.printf("Введите пример в формате X a Y (не забывайте пробелы!), где X и Y - числа, a - операция +,-,*,/ и нажмите Enter. q - выход\n"); 
            
            String eq = iScanner.nextLine();

            if (eq.equalsIgnoreCase("q")){
                System.out.println("Выход из программы\n");
                break;
            }
            
            String[] eqElements = eq.split(" ", -1);

            float X =  Float.parseFloat(eqElements[0]);
            float Y =  Float.parseFloat(eqElements[2]);

            float res = 0;
            
            if (eqElements[1].charAt(0) == '+') {
                res =  X+Y;
            } else if (eqElements[1].charAt(0) == '-') {
                res =  X-Y;
            } else if (eqElements[1].charAt(0) == '/') {
                res =  X/Y;
            } else if (eqElements[1].charAt(0) == '*') {
                res =  X*Y;
            } else{
                System.out.println("Some error\n");
                continue;
            }

            System.out.printf("%s %s %s = %.2f\n",eqElements[0],eqElements[1],eqElements[2],res);
        
        }  
        iScanner.close();   
    }
}
