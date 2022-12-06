import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;

public class ТЕОРИЯ_FunctionalProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BiFunction<Integer,Integer,Integer> sum = (a,b)-> a+b;
        System.out.println(sum.apply(2,3));

        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply
/*...................Function...........................
Приема един входен параметър и връща резултат
Function<Integer, Double> myFunction = e -> e / 2.0;
    ПРИЕМА ЕДИН АРГУМЕНТ ВРЪЩА ЕДНА СТОЙНОСТ
    приема Integer връща Double

        System.out.println(myFunction.apply(10));
 */
/*...................Consumer...........................

 ПРИЕМА ЕДИН АРГУМЕНТ НЕ ВРЪЩА РЕЗУЛТАТ

Не връща резултат, работи като void метод, приема един входен параметър

Consumer<Integer> printNumber = e -> System.out.println(e);
printNumber.accept(5);

 */
/*...................Supplier...........................

Няма входен параметър - единствено връща резултат

 */
/*...................Predicate...........................

Приема един входен параметър, на изхода се връща boolean

 Predicate<Integer> isGreater = e -> e > 10;
        System.out.println(isGreater.test(50));
        връща true или false

........Oбединяване на два Predicate.............

    Predicate<Integer> isGreater = e -> e > 10;
    Predicate<Integer> isSmaller = e -> e < 20;
    boolean result = isGreater.and(isSmaller).test(16);

 */
/*...................BiFunction...........................

Работи с два входни параметъра и връща резултат

BiFunction<Integer,Integer,Integer> sum = (a,b)-> a+b;
        System.out.println(sum.apply(2,3));

 */
    }
}
