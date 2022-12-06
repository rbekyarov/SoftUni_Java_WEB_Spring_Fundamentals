import java.util.Scanner;

public class ТЕОРИЯ_МЕТОДИ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printName();


/*//........ public static void myMetod()...........................

        void методите  -  не връщат резултат

     public static void main(String[] args) {
     printName(); - // извикване на метода
      }
     public static void printName(){ //създаване на метода извън main
        System.out.println("Rado");
    }
                                                                              * */
/*//........ ......МЕТОДИ С ПАРАМЕТРИ..............................

    public static void myMetod(int start,int stop){ // създаваме метод с два параметара
    for (int i = start; i>=stop; i++)
    System.out.print(i);// Ще принтира числата от старт до стоп
    }
    myMetod(3,8); // извикваме метода като въвеждаме и конкретните параметри
                                                                              * */

    }
    public static void printName(){
        System.out.println("Rado");
    }
}
