import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ТЕОРИЯ_STREAMS_FILE_DIRECTORY {

    public static void main(String[] args) throws IOException {


        String path = "E:\\folder\\mail.opticom.csv";
        List<String> input = Files.readAllLines(Path.of(path));
        PrintWriter writer = new PrintWriter(path);
        input.forEach(e-> System.out.println(e));

/*.............Създаване на нов файл.................

 String path = "E:\\folder\\output.txt";
        File file = new File(path);
        file.createNewFile();
 */
/*.............Писане във нов файл.................

 String path = "E:\\folder\\output.txt";
 PrintWriter writer = new PrintWriter(path); - създава файла и започва да пише
 writer.println("Hello");
 writer.close(); - затваряме писеца
 */
/*.............Четене на файл.................

String path = "E:\\folder\\input.txt";
List<String> input = Files.readAllLines(Path.of(path));->
 връща лист от всички редове на един текст
 input.forEach(e-> System.out.println(e)); - печата в конзолата
 */

/*.............Отваряне на Stream към файл.................

String path = "C:\\input.txt";  -> път до файла
FileInputStream fileStream = new FileInputStream(path); -> Създаване на STREAM
int oneByte = fileStream.read();-> четене на файла
while (oneByte >= 0) {
  System.out.print(oneByte); -> разпечатване на конзолата в байтове
  System.out.print(Character.toString(oneByte)); -> разпечатване в текст

 */
/*........Отваряне на Stream четене на  файл чрез scanner ред по ред.................

String path = "E:\\input.txt";
FileInputStream fileStream = new FileInputStream(path);
Scanner scanner = new Scanner(fileStream);
String input = scanner.nextLine();

 */
/*......Отваряне на Stream четене на  файл чрез scanner целия текст.................

String path = "E:\\input.txt";

FileInputStream fileStream = new FileInputStream(path);
Scanner scanner = new Scanner(fileStream);
while (scanner.hasNext()){
String text = scanner.nextLine();
System.out.println(text);
        }
 */
/*......Запис на Изхода в Файл.................

инициализиране на стрим изход
FileOutputStream outputStream = new FileOutputStream("D:\\Output.txt");
outputStream.write(symbol); - запазване на изхода като sout
outputStream.write('\n'); - разпечатване на нов ред

 */

/*............try-catch-finally.................

     InputStream in = null;
try {
   in = new FileInputStream(path);
} catch (IOException e) {
   // TODO: handle exception
} finally {
   if (in != null) {
     in.close();
  }
}
                                               */
    }}

