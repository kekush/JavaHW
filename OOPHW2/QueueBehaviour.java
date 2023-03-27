package OOPHW2;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void giveOrders();
    void takeOrders();
    void releaseFromQueue();
}
