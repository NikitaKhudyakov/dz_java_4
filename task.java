import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        Deque<Integer> numb1 = new LinkedList<>();
        Deque<Integer> numb2 = new LinkedList<>();

        numb1.addFirst(1);
        numb1.addFirst(2);
        numb1.addFirst(3);

        numb2.add(3);
        numb2.addFirst(4);
        numb2.addFirst(5);

        Scanner scan = new Scanner(System.in);
        System.out.println(numb1);
        System.out.println(numb1);
        System.out.println("Выберите команду: 1 - *, 2 - +");
        int com = scan.nextInt();
        scan.close();

        switch (com) {
            case 1:

                int number1 = deque(numb1);
                int number2 = deque(numb2);

                int answer = number1 * number2;

                System.out.println("Произведение = " + answer);
                break;

            case 2:
                number1 = deque(numb1);
                number2 = deque(numb2);

                answer = number1 + number2;
                System.out.println("Сумма = " + answer);
                break;
            default:
                
        }
    }

    public static Deque<Integer> num (int num) {
        Deque<Integer> deque = new LinkedList<>();

        while (num > 0) {
            int digit = num % 10;
            deque.addFirst(digit);
            num /= 10;
        }

        return deque;
    }

    public static int deque(Deque<Integer> deque) {
        int num = 0;
        int count= 1;

        while (!deque.isEmpty()) {
            int digit = deque.removeFirst();
            num += digit * count;
            count *= 10;
        }

        return num;
    }

}