import java.util.Scanner;

public class Main {
    private static final int MAX_WORD_LENGTH = 8;

    //Федоров Андрей НОМЕР 19
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner input = new Scanner(System.in);
        String inputWord = input.next();

        System.out.println(checkValidWord(inputWord, "кн"));

        int[] inputNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Введите %d элемент массива%n", i + 1);
            inputNumbers[i] = input.nextInt();
        }

        System.out.println("Введите число b");
        int b = input.nextInt();
        System.out.println("Введите число di");
        int di = input.nextInt();

        System.out.printf("Ответ = %f%n", calculateSum(inputNumbers, b, di));
    }

    //Задача 1
    public static String checkValidWord(String word, String subString) {
        if (word.length() < MAX_WORD_LENGTH && word.contains(subString)) {
            return word;
        }
        return "Вхождений не найдено, или слово превышает 8 символов!";
    }

    //Задача 2
    public static float calculateSum(int[] numbersArray, int b, int di) {
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

