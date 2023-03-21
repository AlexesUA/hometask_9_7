
//Завдання 7
//
//
//Використовуючи IntelliJ IDEA, створіть клас Arrays. Створіть масив розмірністю 10 елементів,
//виведіть на екран усі елементи масиву у зворотному порядку.

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = CreateSquareArray(10);
        System.out.println("\nПрямий масив: ");
        PrintArray(array);

        System.out.println("\nЗворотній масив: ");
        ReversPrintArray(array);

    }

    static void PrintArray(int[] arrayNumbers){
        int clock = 10;
        for(int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i] + " ");
            clock--;
            if(clock<=0) {clock = 10; System.out.println();}
        }
    }

    static void ReversPrintArray(int[] arrayNumbers){
        int clock = 10;
        for(int i = arrayNumbers.length-1; i >= 0; i--) {
            System.out.print(arrayNumbers[i] + " ");
            clock--;
            if(clock<=0) {clock = 10; System.out.println();}
        }
    }

    static int[] CreateSquareArray(int count){
        Random rndNumber = new Random();
        int[] tempArray = new int[count];

        for(int i = 0; i < tempArray.length; i++) {
            tempArray[i] = rndNumber.nextInt(1, 100);

        }
        return tempArray;
    }
}