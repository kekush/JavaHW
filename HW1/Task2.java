package HW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            int num1 = scanner.nextInt();
            if(num > 0 && num1 < 0){
                sum += num;
            }
            num = num1;

        }
        System.out.println(sum);
    }
    
}