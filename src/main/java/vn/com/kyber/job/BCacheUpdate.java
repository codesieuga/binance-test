package vn.com.kyber.job;

import vn.com.kyber.common.BApiTemplate;
import vn.com.kyber.common.BCache;
import vn.com.kyber.common.SymbolFactory;

public class BCacheUpdate {
    public void start(){
        new Thread(() -> {
            while (true){
                String symbol = SymbolFactory.getNext();
                System.out.println("updating " + symbol + "....................");
                String data = BApiTemplate.getOrderBook(symbol);
                BCache.set(symbol, data);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
