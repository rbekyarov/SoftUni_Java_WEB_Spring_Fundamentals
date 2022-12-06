import java.util.Scanner;

public class ТЕОРИЯ_РЕГЕКСИ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*//........ Интервали [].......................................................

   [A-Z] - големи букви
   [a-z] - малки букви
   [A-Z][a-z]+ [A-Z][a-z]+ хваща Малко и Голямо Име -> John Smith
   [nvj] ще маркира буквите n, v и j
   [^abc] - ще маркира всички букви освен a, b и c
   [0-9] - ще маркира всички цифри 0 до 9
* */


/*//........ REGEX КЛАСОВЕ...................................................
\w - ще маркира (a-z, A-Z, 0-9, _)
\W - ще маркира БЕЗ (a-z, A-Z, 0-9, _)
\s - ще маркира всички празни пространства и табове
\S - ще маркира всички БЕЗ празни пространства и табове
\d - ще маркира всички цифри (0-9)
\D - ще маркира всичко  БЕЗ цифри (0-9)

                                                                          * */

/*//........ REGEX Quantifiers...................................................
* - matches the previous element zero or more times
  \+\d*         -> предишния елемнт НУЛА ИЛИ ПОВЕЧЕ ПЪТИ

+ - matches the previous element one or more times
  \+\d+          -> предишния елемнт ВЕДНЪЖ ИЛИ ПОВЕЧЕ ПЪТИ

? - matches the previous element zero or one time
   \+\d?         -> предишния елемнт НУЛА ИЛИ ВЕДНЪЖ

{3} - matches the previous element exactly 3 times
   \+\d{3}       -> предишния елемнт ТОЧНО ТРИ ПЪТИ
                                                                          * */

/*//........ ГОТОВИ REGEX-И...................................................

[A-Za-z]+@[A-Za-z]+\.[a-z]+  -> хваща мейл адрес
[0-9]+\.[0-9]*               -> хваща дробно число
[0-9]+\.?[0-9]*              -> хваща дробно число + цели числа
[0-9]{2}\.[0-9]{2}\.[0-9]{4} -> хваща дата от тип 25.03.1955
                                                                          * */

/*//........ ГРУПИ()...................................................
Огражда се със скоби, като индексите им започват от 1
<(\w+)[^>]*>.*?<\/\1>

                                                                          * */
/*//........ REGEX IN JAVA...................................................

            Pattern pattern = Pattern.compile("a*b");
            Matcher matcher = pattern.matcher("aaaab");

            boolean match = matcher.find();
            String matchText = matcher.group();

String text = "Andy: 123";
String pattern = "([A-Z][a-z]+): (?<number>\\d+)";

Pattern regex = Pattern.compile(pattern);
Matcher matcher = regex.matcher(text);

System.out.println(matcher.find());          // true
System.out.println(matcher.group());         // Andy: 123
System.out.println(matcher.group(0));        // Andy: 123
System.out.println(matcher.group(1));        // Andy
System.out.println(matcher.group(2));        // 123
System.out.println(matcher.group("number")); // 123

                                                                          * */
/*//........ replace...................................................
replaceAll(String replacement)
replaceFirst(String replacement)

String regex = "[A-Za-z]+";
String string = "Hello Java";
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(string);
String res = matcher.replaceAll("hi");    // hi hi
String res2 = matcher.replaceFirst("hi"); // hi Java

                                                                          * */

    }
}
