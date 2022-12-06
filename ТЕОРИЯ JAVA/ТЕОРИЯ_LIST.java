import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ТЕОРИЯ_LIST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> cardsPlayer1 = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int lowerLimit = 0;
        int upperLimit = 0;
        Integer [] arr = new Integer[] {1,2,3,4,5,6};
        List <Integer> list = Arrays.asList(arr);
        //lowerLimit = Arrays.stream(arr).max(e -> e).getAsint
        //upperLimit = Arrays.stream(arr).max().getAsInt();



/********************************************************************   */
/*             /СЪЗДАВАНЕ НА ЛИСТ/

         List<String> students = new ArrayList<>();
         List<Integer> nums = new ArrayList<>();
                                                             */
/********************************************************************   */
/*             /СЪЗДАВАНЕ НА ЛИСТ със готови стойности/

         List<Integer> nums = new ArrayList<>(
         Arrays.asList(10, 20, 50, 15));
                                                             */
/********************************************************************   */
/*        /СЪЗДАВАНЕ НА ЛИСТ OT КОНЗОЛАТА ЧРЕЗ FOR/
           /всяко число се подава на отделен ред/

       int n = Integer.parseInt(scanner.nextLine());
       List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int num =Integer.parseInt(scanner.nextLine());
            nums.add(num);
        }
                                                        */
/********************************************************************   */
/*        /СЪЗДАВАНЕ НА ЛИСТ OT КОНЗОЛАТА ЧРЕЗ Stream/
           /всяко число се подава на един ред -> 1 2 3 4 5/
      String value = scanner.nextLine();
      List<String> items = Arrays.stream(value.split(" "))
      .collect(Collectors.toList());

 Ако искаме списъка от Стрингове да го направим списък от Интове

      List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <items.size() ; i++) {
            nums.add(Integer.parseInt(items.get(i)));
        }
 Ако искаме директно да напълним списъка с Интове ->

 List<Integer> items = Arrays.stream(value.split(" "))
 .map(Integer::parseInt).collect(Collectors.toList());

                                                    */
/****************************************************************************************   */
/*    /МЕТОДИ - ДОБАВЯНЕ и ПРЕМАХВАНЕ НА ЕЛЕМЕНТИ В ЛИСТ/

      /String/  students.add("Gosho"); - добавя в края на списъка
      /String/  students.remove("Tosho");
      /String/  students.remove(1); ще премахне елемента със индекс 1
      /Integer/ nums.remove(1); ще премахне елемента със индекс 1
      /Integer/ nums.remove(Integer.valueOf(40)); ще премахне първия елемента със стойност 40
      /Integer/ nums.add(100) -добавя в края на списъка 100
      /Integer/ nums.add(0, -100) - добавя в index 0 стойност -100
      /Integer/ nums.contains(-100) - проверява и връща true/false ако в списъка имаме стойност -100
       МЕТОД    nums.set(0, -100)  - преазаписва индекс 0 със със стойност -100
       МЕТОД    nums.isEmpty - пита нашия списък дали е празен. -> true / false
       МЕТОД    nums.size() - взема дължината на листа
       МЕТОД    int pos =arr.indexOf(3); - НАМИРА ИНДЕКСА НА ЕЛЕМЕНТ СЪС СТОЙНОСТ 3
       МЕТОД    arr.lastIndexOf(3); - НАМИРА ИНДЕКСА НА ПОСЛЕДНИЯ ЕЛЕМЕНТ СЪС СТОЙНОСТ 3
       МЕТОД    arr.isEmpty(); - връща true - ако списъка е празен
       МЕТОД    nums.removeIf(n -> n>0); - намира свички отрицателни и ги премахва / премахва елементи в зависимост от условието
       МЕТОД    nums.sublist(startIndex,endIndex) - като последния индекс не се включва
       МЕТОД    nums.removeAll(Arrays.asList(element) - ще обходи всички елементи и ще премахне всички със стойност element
*/
/**************************************************************************************************   */
/*        /Обикновенно принтиране /

     List<Integer> nums = new ArrayList<>(Array.asList(10, 20, 50, 15));
            System.out.print(nums); ->[10, 20, 50, 15]
                                                 */
/**************************************************************************************************   */
/*        /ПРИНТИРАНЕ НА String СТОЙНОСТИ НА ЛИСТ ЧРЕЗ ФОРЕЙЧ/

     /String/   for (String name:students) {
                System.out.println(name);}                                                           */
/**************************************************************************************************   */
/*        /ПРИНТИРАНЕ НА Double СТОЙНОСТИ НА ЛИСТ ЧРЕЗ ФОРЕЙЧ и Decimal/

     DecimalFormat decimal = new DecimalFormat("0.#");
        for (double decimalNum:num){
            System.out.println(decimal.format(decimalNum));
        }                                                                                                    */
/***********************************************************************************************************  */
/*        /ПРИНТИРАНЕ НА Int СТОЙНОСТИ НА ЛИСТ ЧРЕЗ FOR/

           /for (int i = 0; i <nums.size() ; i++) {
            System.out.print(nums.get(i)+" ");
        }                                                                                                   */
/************************************************************************************************************   */
/*        /ПРИНТИРАНЕ НА String СТОЙНОСТИ НА ЛИСТ ЧРЕЗ String.join/

            System.out.print(String.join("; ",students);

                                                                                                            */
/************************************************************************************************************   */
/*        /ПРИНТИРАНЕ НА String СТОЙНОСТИ НА ЛИСТ ЧРЕЗ STREAM/


            System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                                                                                                            */
/************************************************************************************************************   */
/*        /ПРИНТИРАНЕ на Лист от Int чрез Ескейпване/

            System.out.println(nums.toString().replaceAll ("[\\[\\],]", "")
                                                                                                            */
/************************************************************************************************************   */

/*        /СОРТИРАНЕ НА СПИСЪЦИ/
           Collections.sort(nums); -> сортира по азбучен ред, а цифри от малко към голямо
           Collections.reverse(nums) -> обръща реда
                                                                                                           */
/************************************************************************************************************   */
/*             ПРЕВРЪЩАНЕ НА МАСИВ В ЛИСТ

           Integer [] arr = new Integer [10];
           List <Integer> list = Arrays.asList(arr);
                                                                                                           */
/************************************************************************************************************   */

    }
}
