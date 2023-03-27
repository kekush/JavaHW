package OOPHW1;

public class Human extends Buyer {

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrderVar = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrderVar = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrderVar;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderVar;
    }
}
