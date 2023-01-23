// Дополнительно*
//  Задано уравнение вида x + y = z. И (x, y, z) >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
// Вывод 24 + 45 = 69
import java.util.Scanner;

public class prog_04 {
    public static void main(String[] args) {
 
        Scanner iScanner = new Scanner(System.in, "CP866");

        boolean result;

        while(true)
        {
            System.out.printf("--- \n");
            System.out.printf("   Введите уравнение вида x + y = z. И (x, y, z) >= 0.\n");
            System.out.printf("   q - выход из программы.\n"); 
            System.out.printf("   Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.\n"); 
            System.out.printf("--- \n");
            
            result = false;

            String eqString1 = iScanner.nextLine();

            if (eqString1.equalsIgnoreCase("q")){
                System.out.println("Выход из программы\n");
                break;
            }

            if (eqString1.indexOf('?')<0){
                System.out.printf("В уравнении нет ?\n"); 
                continue;
            }
            
            String eqString2;
            Integer x = 0;
            Integer y = 0;
            Integer z = 0;
            char cResult = '?';

            for (char i='0';i<='9';i++)
            {
                eqString2 = eqString1.replace('?',i);
                // System.out.printf("----> %s\n",eqString2);

                String[] arr_eqString = eqString2.split(" ",-1);

                x =  Integer.parseInt(arr_eqString[0]);
                y =  Integer.parseInt(arr_eqString[2]);
                z =  Integer.parseInt(arr_eqString[4]);

                if (x+y == z)
                {
                    cResult = i;
                    result = true;
                    break;
                }
            } 

            if (result)
            {
                System.out.printf("\n%d + %d = %d\n",x,y,z);
                System.out.printf("? = %c\n",cResult);
            }
            else
            {
                System.out.printf("\nРешения нет!\n");
            }
        }
        iScanner.close();

    }
}
