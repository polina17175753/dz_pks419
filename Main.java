import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    private static final int MAX_WORD_LENGTH = 8;

    //Федоров Андрей НОМЕР 19
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner input = new Scanner(System.in);
        String currentWord = input.next();

        if (task1(currentWord, "кн")) {
            System.out.println(currentWord);
        } else {
            System.out.println("Вхождений не найдено, или слово превышает 8 символов!");
        }

        int[] numbersInput = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива");
            numbersInput[i] = input.nextInt();
        }

        System.out.println("Введите число b");
        int b = input.nextInt();
        System.out.println("Введите число di");
        int di = input.nextInt();

        System.out.println("Ответ = " + task2(numbersInput, b, di));
    }

    //Задача 1
    public static boolean task1(String word, String subString) {
        return word.length() < MAX_WORD_LENGTH && word.contains(subString);
    }

    //Задача 2
    public static float task2(int[] numbersArray, int b, int di) {
        int summaUp = 0;
        int summaDown = 0;

        //Сумма Числителя и Знаменателя
        for (int i = 0; i < 10; i++) {
            int number = numbersArray[i];
            summaUp += ((number * number) - b);
            summaDown += (number - b);
        }

        return (float) (summaUp / summaDown) - (numbersArray[di - 1] - b);
    }
}

