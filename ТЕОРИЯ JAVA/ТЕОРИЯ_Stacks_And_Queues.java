import java.util.*;

public class ТЕОРИЯ_Stacks_And_Queues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] arr = scanner.nextLine().split("\\s+");
        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, arr);
        stack.pop();
        stack.push("1");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


/******************STACK************************/
/*
Last In First Out (LIFO) последния влязал първи излиза

ArrayDeque<Integer> stack = new ArrayDeque<>(); - създаване на стек

********** ОСНОВНИ МЕТОДИ***********
    Push - добавяне на елемент // най отгоре // последния елемент
    stack.push(element);

    Pop - изтриване на елемент // най отгоре // последния елемент
    Integer element = stack.pop();

    Peek - вземане на стойноста на елемент // последния елемент
    Integer element = stack.peek();

    stack.getFirst() - вземане на стойноста на първия елемент
    stack.getLast() - вземане на стойноста на първия елемент

    int size = stack.size();
    boolean isEmpty = stack.isEmpty();
    boolean exists = stack.contains(2);

********** ПЪЛНЕНЕ НА СТЕК ЧРЕЗ ПОМОЩА НА МАСИВ***********
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split("\\s+");
    Deque<String> stack = new ArrayDeque<>();
    I начин -> Collections.addAll(stack, arr);
    II начин -> for (int element : stack){
                stack.push(element)
                 }

**********Печат на Стек:**********
    while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
*******Печат на най малкото число от елементите на стека*******

     System.out.println(Collections.min(stackNumbers))
                                                         */
/**********************QUEUE****************************   */
/*
First In First Out(FIFO) - първия влязал първи излиза

ArrayDeque<Integer> queue = new ArrayDeque<>(); създаване на опашка

********** ОСНОВНИ МЕТОДИ***********

Добавяне на елемнт в края на опашката - offer()
    queue.offer(element);
    offer() – returns false if queue is full

Премахване на елемент от началото на опашката - poll()
    element = queue.poll();
    poll() - returns null if queue is empty

Достъпване на стойноста на Първи елемнт
    element = queue.peek();

Други методи:
    size() - връща размера на опашката
    toArray() - конвертира опашката до масив
    contains() - проверява елемента дали се съдържа

********** ПЪЛНЕНЕ НА ОПАШКА ЧРЕЗ ПОМОЩА НА МАСИВ***********
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split("\\s+");
    Deque<String> queue = new ArrayDeque<>();
    for (int element : queue){
         stack.offer(element)
    }

**********Печат на опашка:**********
       while (!queue.isEmpty()){
            System.out.println(stack.poll());
        }                                              */
/********************************************************************   */

    }
}
