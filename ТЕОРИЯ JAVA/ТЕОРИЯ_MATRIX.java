import java.util.Arrays;
import java.util.Scanner;

public class ТЕОРИЯ_MATRIX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1 2 5
//3 4 6




/*//.................... Инициализация на Матрица....................

  int[][] intMatrix = new int[3][3];

  int[][] matrix = {
  {1, 2, 3, 4}, // row 0 values
  {5, 6, 7, 8}  // row 1 values
};
* *//*//.................... Достъпване на елемент".................
     int[][] matrix = {{1, 2}, {3, 4}};
     int element = matrix[1][1]; -> 4

     matrix.length -> връща броя на редовете
     matrix[0].length -> връща дължината на първия масив (броя на колоните)
                                                                 * */
/*//....................Прочитане на Матрица от конзолата....................
вход:
2
2
1 2
3 4
  int rows = Integer.parseInt(scanner.nextLine());
  int cols = Integer.parseInt(scanner.nextLine());
  int[][] matrix = new int[rows][cols];
  for (int row = 0; row < rows; row++) {
    String[] input = scanner.nextLine().split(" ");
      for (int column = 0; column < cols; column++) {
        matrix[row][column] = Integer.parseInt(input[column]);
      }

* *//*//....................Разпечатване на Матрица.................

     int[][] matrix = {
                {1, 2, 3, 4}, // row 0 values
                {5, 6, 7, 8}  // row 1 values
        };
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
                                                                 * */
/*//.................... СУМА НА ПЪРВИ ДИАГОНАЛ....................

  int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
      важно      if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
* */
/*//.................... СУМА НА ВТОРИ ДИАГОНАЛ....................

  int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {

    важно    if (col == matrix.length - row - 1) {
                    sum += matrix[row][col];
                }
            }
        }
* */




    }
}
