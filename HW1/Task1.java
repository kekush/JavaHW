package HW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        int x = string1.length();
        String string2 = "";
        for (int i = string1.length() - 2; i >= 0 ; i--) {
            if (string1.charAt(i) == ' '){
                string2 += string1.substring(i, x);
                x = i;
            }
        }
        string2 += ' ' + string1.substring(0, x);
        string2 = string2.substring(1,string2.length());
        System.out.println(string2);
    }
    
}
