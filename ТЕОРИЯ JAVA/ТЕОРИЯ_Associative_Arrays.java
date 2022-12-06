import java.util.*;
import java.util.stream.Collectors;

public class ТЕОРИЯ_Associative_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(1)
                .collect(Collectors.toList());
        for (int num : nums) {
            System.out.print(num + " ");
        }




/*******************************************************************************************    */
/*             /Асоциативен масив, Map-ве/
        приема два типа данни, първия е ключа, втория е стойност
          key   Value
    Map<String,Double> myFirstMap = new HashMap<>();
        myFirstMap.put("Pesho",4.7);
        myFirstMap.put("Gosho",4.7);
        myFirstMap.put("Sasho",4.7);
                         KEY, VALUE -> Entry
       key - трябва да е уникален

*//*******************************************************************************************    */
/*             / Видове Map-ве /
    HashMap - KV стойностите не се пазят в определен ред
    LinkedHashMap - работи като списъка - елементите се пазят в реда на създаване
    TreeMap - елементите ще бъдат подредени според техния ключ във възходящ ред

                                                             *
*//*******************************************************************************************    */
/*             / МЕТОДИ /
   .put(key,value) - добавя елемент- ако елемента вече го има - то то ще го промени/ще я презапише
   .remove(key) - премахва елемент, като се ориантира по ключ
   .containsKey() - проверява дали  масива съдържа искания ключ , boolean
   .containsValue() - проверява дали  масива съдържа исканата стойност,boolean
   .entrySet() - взема всички ентрита на Мап-а, връща всички записи
   entry.getKey - взема ключа на обекта entry
   entry.getValue - взема стойността на обекта entry
   .values() - връща списък със стойностите на нашия Мап
   .keySet() - връща списък с ключовете на нашия Мап
   map.get(Key) - връща Value-то на ключа Key
   putIfAbsent() - сложи този запис ако ключа го няма в мапа

                                                             *
*//*******************************************************************************************    */
        /*             / Итериране в Мапове /

        Map<String, Double> fruits = new LinkedHashMap<>();
        fruits.put("banana", 2.20);
        fruits.put("kiwi", 4.50);
        // Чрез фориич минаваме през ентритата  и ентритаата ги вземаме с помоща на .entrySet() метода
        for (Map.Entry<String,Double> entry : fruits.entrySet()) {// entry - вътрешен клас на Map
            System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue());
                              //banana -> 2,20 // kiwi -> 4,50
        }
     принтиране -  мап.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
         *
*//*******************************************************************************************    */
        /*             / LAMBDA ИЗРАЗИ /
           Lamda изразите са функции.
           (а-> а>5) - от лявата страна са аргументите, а от лявата изразите, аргумети ->израз
     пример - static int func (int x){return x/2;} - x->x/2

         *
*//*******************************************************************************************    */
        /*             / Stream API /
           - примитивни - > IntStream, DoubleStream
           - стриймови -> Stream<String>, Stream<Integer
        Методи:
        .sum() - int sum = Arrays.stream(new int[]{15, 25, 35}).sum();
        .min().getAsInt - връща най малкото число

пример: int min = Arrays.stream(new int[]{15, 25, 35}).min().getAsInt();
        System.out.println(min);


        .max().getAsInt - връща най голямото число
        .average().getAsDouble() - връща средна стойност/винаги е double

 пример: double avg = Arrays.stream(new int[]{15, 25, 35})
                .average().getAsDouble();
              System.out.println(avg);

        .mapToInt() ->IntStream - конвертираме до примитивни данни
        .mapToDouble() -> DoubleStream - конвертираме до примитивни данни
        .map()
        .filter()

пример: int[] nums = Arrays.stream(sc.nextLine().split(" "))
                 .mapToInt(e -> Integer.parseInt(e))
                 .filter(n -> n > 0)
                 .toArray();


 пример: String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        .limit()

       Largest 3 Numbers:

       List<Integer> nums = Arrays
                .stream(sc.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .collect(Collectors.toList());
        for (int num : nums) {
            System.out.print(num + " ");
        }
*/

    }
}
