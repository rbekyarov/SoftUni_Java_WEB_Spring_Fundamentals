import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ТЕОРИЯ_ObjectsAndClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        LocalTime day = LocalTime.now();
        System.out.println(day);
/********************************************************************   */
/*             / КЛАС ОБЕКТ МЕТОД /
 пример -> Scanner myScanner = new Scanner(System.in);
             Scanner - КЛАС
             myScanner - ОБЕКТ
             new - създаваме нов обект в класа Scanner
             myScanner.nextLine() - МЕТОД на класа Scanner

                                                             */
/********************************************************************   */
/*             / Случайно разбъркване с клас Random и метод .nextInt  /
Random random = new Random(); - инициализирaне на класа
int randomIndex = random.nextInt(textArray.length);
random.nextInt  - метод на random - генерира случайно число


                                                             */
/********************************************************************   */
    }
}
