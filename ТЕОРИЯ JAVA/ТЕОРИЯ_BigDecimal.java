import java.math.BigDecimal;
import java.util.Scanner;

public class ТЕОРИЯ_BigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal number = new BigDecimal(0);
        //number = number.add(BigDecimal.valueOf(2.5));
        number = number.subtract(BigDecimal.valueOf(1.5));
        number = number.multiply(BigDecimal.valueOf(2));
        number = number.divide(BigDecimal.valueOf(2));
        System.out.println(number);



/*//........ ИНИЦИАЛИЗИРАНЕ НА BigDecimal - "new"...........
    BigDecimal number = new BigDecimal(0);
number = number.add(BigDecimal.valueOf(2.5));
number = number.subtract(BigDecimal.valueOf(1.5));
number = number.multiply(BigDecimal.valueOf(2));
number = number.divide(BigDecimal.valueOf(2));

задачка: събиране на n на брой големи числа
int n = Integer.parseInt(sc.nextLine());
BigDecimal sum = new BigDecimal(0);
for (int i = 0; i < n; i++) {
   BigDecimal number = new BigDecimal(sc.nextLine());
   sum = sum.add(number);
}
System.out.println(sum);


                                                                           * */

    }
}
