package HW2;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2;
        int i = 1;
        Boolean flag = true;
        while (i < n){
            num2 = scanner.nextInt();
            if (num1 >= num2) {flag = false;}
            num1 = num2;
            i++;
        }
        if (flag) {
            System.out.println("Возрастающая");
        } else {
            System.out.println("Не возрастающая");
        }
    }
}
