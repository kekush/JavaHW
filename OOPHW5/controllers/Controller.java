package OOPHW5.controllers;

import OOPHW5.model.products.Product;
import OOPHW5.model.tasks.VendingMachine;

public class Controller {
    private final VendingMachine machine;

    public Controller(VendingMachine machine) {
        this.machine = machine;
    }

    public Product findProduct(String name) throws Exception {
        return machine.getProduct(name);

    }

}
