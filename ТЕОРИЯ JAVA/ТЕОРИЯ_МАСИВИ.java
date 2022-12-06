import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ТЕОРИЯ_МАСИВИ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());// подаваме броя елемнти(дължина на масив)
        int[] array = new int [n];

        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());


        }
        System.out.println(Arrays.toString(array));
/*//........ ИНИЦИАЛИЗИРАНЕ НА МАСИВ - "new"...........
                int [] num = new int [10];
                String [] word = new String [10];
                String [] word = {Rado, Rali, Miki, Grace}; - инициализиране и добавяне на размер и стойности чрез литерали.
                                                                           * */


/*//........ Достъпване на елемент на МАСИВ и редактиране на стойност - "array[0]"...........
                 int [] num = new int [10];
                 num[3]=5;// задавне на 3-тия индекс стойност 5
                                                                              * */


/*//........ Достъпване на елемент на МАСИВ и манипулация на стойностите му - "[1] +[2]"...........
                int [] num = new int[3];
                num[1]= 2;
                num[2]= 3;
                num[3]= num[1] + num[2];
                System.out.println(num[3]); //принтиране на елемент
                                                                             * */

/*//........Четене на МАСИВ от конзолата, елементите са на отделен ред - "array.length"...........

                int n = Integer.parseInt(scanner.nextLine());// подаваме броя елемнти(дължина на масив)
                int[] array = new int [n];
                for (int i = 0; i <array.length ; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
        }
                System.out.println(Arrays.toString(array));


                                                                            * */
/*//........Четене на Масив от конзолата като ни се дават всички елементи на един ред или
                         КОНВЕРТИРАНЕ НА СТРИНГ В МАСИВ - "split"...........
                String word = "1 2 3 25 36";
                String []array= word.split(" ");
                System.out.println(Arrays.toString(array)); принтиране на стринг !
                //[1, 2, 3, 25, 36]

                II - НАЧИН ЧРЕЗ STREAM

  int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();
                                                                                */
/*//........Принтиране на МАСИВ - "чрез FOREACH"...........
            String[] arr = scanner.nextLine().split(" ");
            for (String num:arr) {
            System.out.print(num+" ");
        }

                                                                            */
/*//........Принтиране на МАСИВ - "чрез Цикъл"...........

                String[] array = {"one", "two"};
                for (int i = 0; i <array.length ; i++) {
                System.out.printf("array[%d] = %s\n",i,array[i]);
        }
                                                                            * */
/*//........Принтиране на МАСИВ - "чрез String.join"...........

                String[] array = {"one", "two"};
                System.out.println(String.join(" ",array));
        }
                                                                            * */
/*//........Принтиране на МАСИВ - "Arrays.toString"...........

                System.out.println(Arrays.toString(array));
                                                                            * */
        /*//........Принтиране на МАСИВ - "Arrays.toString"...........
              от интове -> към масиви
               System.out.println(Arrays.toString(array).replaceAll("[\\[\\]]", ""));
                                                                            * */




/*//........ОБРАТНО НА ГОРНОТО КОНВЕРТИРАНЕ НА МАСИВ В СТРИНГ - "join"...........
                String word = "1 2 3 25 36";
                String []array= word.split(" ");
                String backToString = String.join(" ",array);

                                                                               */

/*//........Превръщане на Масив от Стрингове във Масив от Интове чрез Цикъл...........
                //{"1", "2", "21"} -> {1 ,2, 21}

                String [] arrayStr = {"1", "2", "21"};
                int [] arrayInt = new int [arrayStr.length];
                for (int i = 0; i <arrayStr.length ; i++) {
                arrayInt[i]=Integer.parseInt(arrayStr[i]);

                                                                                 */

/*//........Превръщане на Масив от Стрингове във Масив от Интове чрез STREAM .........
                //{"1", "2", "21"} -> {1 ,2, 21}

                String str  = scanner.nextLine();// прочитаме стринг
                String[] arrayStr = str.split(" ");// сплитваме и създавме Масив стринг

                int[] arrayInt = Arrays.stream(arrayStr).mapToInt(e-> Integer.parseInt(e)).toArray();

                //Arrays.stream(arrayStr) - създава поточна линия
                //mapToInt(e-> Integer.parseInt(e)) - конвертира всяко число от стринг в инт
                //toArray(); - интовете ги пъха в масив

........II начин на един ред -  директно четене в стрийма и създаване на масив от интове:....

        int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();


                                                                                  */
/*//........SPLIT-ване на числа от Стринг в две променливи, подаден от конзолата...........

            String input = scanner.nextLine();.....//пример "12 13"
            int firstNum = Integer.parseInt(input.split(" ")[0]);..... //12
            int secondNum = Integer.parseInt(input.split(" ")[1]);.... //13

                                                                                 */



    }
}
