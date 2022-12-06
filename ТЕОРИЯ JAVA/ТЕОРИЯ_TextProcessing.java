import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ТЕОРИЯ_TextProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = String.join("|",scanner.nextLine() );
        System.out.println(t);

/*//.................... STRING".....................................................

    1 Не можем да променяме String
            String text = "aaa";
            text.toUpperCase();
            System.out.println(text);->ааа
        За да можем да го променим трябва да вземем резултат
            String text = "aaa";
            text = text.toUpperCase();
            System.out.println(text);->AAA

* *//*//.................... INDEX ON STRING".....................................................

          String text = "Hello, Java";
          char symbol = text.charAt(2); // l

* *//*//............Converting a string from and to a char array".....................................................

        String str = new String(new char[] {'R', 'a', 'd', 'o'}); - конвертиране в стринг от чарове
        System.out.println(str); //Rado
        char[] charArr = str.toCharArray(); - конвертиране в чарове от стринг
                    // ['r', 'a', 'd','o']


* *//*//............"Joining Strings".....................................................

              String t = String.join("", "con", "ca", "ten", "ate");
              // "concatenate"

* *//*//.................... .substring(int startIndex, int endIndex).......................
       изрязва някоя част от стринга
            String card = "10C";
        String power = card.substring(0, 2);// - Взема два аргумента(старт индекс,и краен индекс)- и взема между тях стойнотите
        System.out.println(power); // 10

            String text = "My name is John";
            String extractWord = text.substring(11);// ако е само 1 аргумента -> хваща 11-тия индекс и след него останалите
            System.out.println(extractWord); // John

                                                                           * */
/*//.................... .indexOf().....................................................
Връща първия индекс път когато сме срещнали думата

            String fruits = "banana, apple, kiwi, banana, apple";
            System.out.println(fruits.indexOf("banana"));    // 0 - когато имаме
            System.out.println(fruits.indexOf("orange"));    // -1 - връща -1 когато нямаме такъв стринг

                                                                           * */
/*//.................... .lastIndexOf.....................................................
            Връща последния индекс път когато сме срещнали думата

            String fruits = "banana, apple, kiwi, banana, apple";
            System.out.println(fruits.lastIndexOf("banana")); // 21
            System.out.println(fruits.lastIndexOf("orange")); // -1
                                                                      * */
/*//.................... .contains() .....................................................
        Връща последния индекс път когато сме срещнали думата

                String text = "I love fruits.";
                System.out.println(text.contains("fruits")); // true
                System.out.println(text.contains("banana")); // false
                                                                         * */
/*//.................... .Splitting  .....................................................
        String text = "Hello, john@softuni.bg, you have been using john@softuni.bg in your registration";
        String[] words = text.split(", ");
        // words[]: "Hello", "john@softuni.bg","you have been…"

    Може да се сплитва и чрез няколко аргумента: пример -[, .] -> запетая,празно място и точка
    String text = "Hello, I am John.";
    String[] words = text.split("[, .]+");
    // "Hello", "I", "am", "John"
                                                                     * */
/*//.................... replace(match, replacement)  .....................................................

    Замества всяка срещната дума отговаряща на match

    String text = "Hello, john@softuni.bg, you have been using john@softuni.bg in your registration.";

    String replacedText = text.replace("john@softuni.bg", "john@softuni.com"); //bg->com

    System.out.println(replacedText);
// Hello, john@softuni.com, you have been using john@softuni.com in your registration.

                                                                           * */
/*//.................... ВЗЕМАНЕ НА ЧИСЛО ОТ СТРИНГ  .....................................................

      String input = "daef6dae5faaf";
      int  sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                int num = 0;
                num = Integer.parseInt(input.charAt(i)+"");
                sum+=num;
            }

        }
        System.out.println(sum);

                                                                           * */
/*//....................  String valueOf()  .....................................................

      преобразува различни типове в стринг
      int a =6;
        String b = String.valueOf(a);
        System.out.println(b);// "6"

                                                                           * */
/*//.................... StringBuilder  .....................................................

                  StringBuilder text = new StringBuilder();

                  .append() - предава стойност на SB.
                        StringBuilder sb = new StringBuilder();
                        sb.append(text,", how are you?");

                  .length() - връща дължината на текста
                        sb.append("Hello Peter, how are you?");
                        System.out.println(sb.length()); // 25

                  .charAt(int index) - връща символа от зададения индекс
                        sb.append("Hello Peter, how are you?");
                        System.out.println(sb.charAt(1));

                  .replace(int startIndex, int endIndex, String str)
                        String text = "";
                        StringBuilder sb = new StringBuilder();
                        sb.append("Hello Peter, how are you?");
                        sb.replace(6, 11, "George");
                        text = sb.toString();
                        System.out.println(text);

                   .toString() - конвертита стойностите в стринг
                        String text = sb.toString();
                        System.out.println(text);

                        sb.reverse - обръща стринга

                 т                                                          * */
    }
}
