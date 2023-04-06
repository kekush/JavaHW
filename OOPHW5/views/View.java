package OOPHW5.views;

import OOPHW5.controllers.Controller;
import OOPHW5.model.products.Product;
import OOPHW5.model.utils.Input2;

public abstract class View implements Input2 {
    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        Commands com = Commands.NONE;
        showHelp();
        while (true) {
            try {
                String command = input("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                switch (com) {
                    case FIND -> find();
                    case EXIT -> System.exit(0);
                    case HELP -> showHelp();
                }
            } catch (Exception ex) {
                System.out.println("Произошла ошибка " + ex);
            }
        }
    }

    public void showHelp() {
        System.out.println("Список команд:");
        for (Commands com : Commands.values()) {
            System.out.println(com);
        }
    }


    private void find() throws Exception {
        String name = input("Какой товар интеерсует? Введите название: ");
        Product product = controller.findProduct(name);
        System.out.println(product);

    }


}
