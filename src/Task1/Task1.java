package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayNumbers = createRandomArray();
        String answer = "Целочисленное деление: ";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целое число: ");
        int inputNumber = 0;
        try {
            inputNumber = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e){
            System.out.println("Неверный формат, попробуйте снова!");
        }
        for (int number : arrayNumbers) {
            if (number != 0 && inputNumber % number == 0) {
                answer += inputNumber / number + " ";
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println(answer);
    }

    public static int[] createRandomArray(){
        int length = (int) (Math.random() * 10 + 1);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20+1)) - 10;
        }
        return array;
    }

}
