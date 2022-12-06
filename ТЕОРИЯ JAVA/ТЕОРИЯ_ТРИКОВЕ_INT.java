import java.util.Scanner;

public class ТЕОРИЯ_ТРИКОВЕ_INT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 15;
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
       
/*.................ОБХОЖДАНЕ НА ЧИСЛО И СУМИРАНЕ НА ЦИФРИТЕ МУ......................

        int sumOfDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
                                                                                 */
/*.................ОБХОЖДАНЕ НА ЧИСЛО И ОБРЪЩАНЕ НА ЦИФРИТЕ МУ......................

        int number= Integer.parseInt(scanner.nextLine());
        int sum=0;
        while (number > 0) {
            int digit = number % 10;
            sum = (sum * 10) + digit;
            number /= 10;
        }
        System.out.println(sum);
                                                                                 */
/*.................РАЗМЯНА НА СТОЙНОСТИ НА Две променливи......................

        int a = 5;
        int b = 15;
        int c=a;
        a=b;
        b=c;                                                                       */






    }
}
