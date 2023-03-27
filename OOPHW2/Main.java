package OOPHW1;

import java.util.*;

/**
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди,
 * принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление
 * состояния магазина
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей
 * в очереди в различных статусах
 */
public class Main {
    public static void main(String[] args) {


        Market market = new Market();   

        Human man1 = new Human();
        man1.name = "Ваня";
        market.acceptToMarket(man1);
        System.out.println(market.getInfoVisitors(market.actors));
        System.out.println(market.getInfoBuyers(market.actorsQueue));

        int i = 1;
        Random r = new Random();
        while (i > -1 && i < 5) {       
            int num = r.nextInt(2);

            if (num == 1) {  
                Human man = new Human();
                man.name = "Посетитель" + i;
                market.acceptToMarket(man);
                System.out.println(market.getInfoVisitors(market.actors));
                System.out.println(market.getInfoBuyers(market.actorsQueue));
                i++;
            } else {
                for (Buyer a : market.actors) {
                    num = r.nextInt(2);

                    if (num == 1 && !market.actorsQueue.contains(a)) {  
                        market.takeInQueue(a);
                        System.out.println(market.getInfoVisitors(market.actors));
                        System.out.println(market.getInfoBuyers(market.actorsQueue));
                    }
                }


                if (!market.actorsQueue.isEmpty()) {
                    market.update(); 
                    String buyerName = market.actorsQueue.peek().getName();
                    market.releaseFromQueue();
                    for (int j = 0; j < market.actors.size(); j++) {
                        if (market.actors.get(j).getName().equals(buyerName))
                            market.releaseFromMarket(market.actors.get(j));
                    }

                }
            }
        }
        System.out.println("Магазин скоро закроется!");
        if (!market.actorsQueue.isEmpty()) {
            for (Buyer b : market.actorsQueue) {
                market.update(); 
                String buyerName = market.actorsQueue.peek().getName();
                market.releaseFromQueue();
                for (int j = 0; j < market.actors.size(); j++) {
                    if (market.actors.get(j).getName().equals(buyerName))
                        market.releaseFromMarket(market.actors.get(j));
                }
                System.out.println(market.getInfoVisitors(market.actors));
                System.out.println(market.getInfoBuyers(market.actorsQueue));
            }
        }
        while (!market.actors.isEmpty()) {
            int num = r.nextInt(2);
            if (num == 1) {
                market.takeInQueue(market.actors.get(0));
                market.update();
                market.releaseFromQueue();
            }
            market.releaseFromMarket(market.actors.get(0));
            System.out.println(market.getInfoVisitors(market.actors));
        }
        System.out.println("Все покупатели вышли. Магазин закрыт.");
    }

}
