package HW2;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] > 9 && arr[i] < 100) || (arr[i] > -100 && arr[i] < -9)) {
                sum += i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
