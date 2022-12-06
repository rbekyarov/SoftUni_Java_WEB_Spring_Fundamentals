
public class ТЕОРИЯ_сумиране_на_цифрите_на_число {
    public static void main(String[] args) {
        int number = 56664;
        int sum = 0;
        while (number > 0) {
            int digit = 0;
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println(sum);//27
    }
}