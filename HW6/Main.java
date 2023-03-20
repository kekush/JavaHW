package HW6;

import java.util.*;

public class Main {   public static void main(String[] args) {
    Map<Integer, Notebook> notes = NotesBD.addNotes();
    for (int i = 1; i < notes.size() + 1; i++) {
        System.out.println(notes.get(i));
    }

    System.out.println("""
            Выберите характеристики ноутбука:
            1 - ОЗУ\s
            2 - Объем ЖД\s
            3 - ОС\s
            4 - Цвет\s
            5 - Цена\s
            6 - Состояние""");
    boolean flag = true;
    Map<String, String> search = new HashMap<>();

    while (flag) {
        System.out.println("Введите параметр:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num < 1 || num > 6) {
            System.out.println("Нет такого варианта поиска. Введите еще раз");
        } else {
            String val1, val2 = null;
            if (num == 1 || num == 2 || num == 5) {
                System.out.println("Введите нижнее значение диапазона:");
                val1 = scanner.nextLine();
                System.out.println("Введите верхнее значение диапазона:");
                val2 = scanner.nextLine();
            } else {
                System.out.println("Введите значение поиска:");
                val1 = scanner.nextLine();
            }
            switch (num) {
                case 1 -> { 
                    search.put("ram", val1);
                    search.put("ram2", val2);
                }
                case 2 -> {
                    search.put("hardDrive", val1);
                    search.put("hardDrive2", val2);
                }
                case 3 -> search.put("OS", val1);
                case 4 -> search.put("color", val1);
                case 5 -> {
                    search.put("price", val1);
                    search.put("price2", val2);
                }
                case 6 -> search.put("defected", val1);
            }
            System.out.println("Введёте еще параметр? (да/нет)");
            String ans = scanner.nextLine();
            if (ans.equals("нет")) flag = false;
        }
    }

    // поиск в базе
    System.out.println("ввод клиента: " + search);
    Set<Integer> tempSet = new HashSet<>(Methods.check(notes, search));
    System.out.println(tempSet);
    Methods.searchPrint(notes, tempSet);
}
}
