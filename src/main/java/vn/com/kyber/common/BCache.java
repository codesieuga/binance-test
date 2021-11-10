package vn.com.kyber.common;

import java.util.concurrent.ConcurrentHashMap;

public class BCache {
    private static ConcurrentHashMap<String, String> orderBook = new ConcurrentHashMap<>();

    public static void set(String symbol, String data){
        System.out.println(data);
        orderBook.put(symbol, data);
    }

    public static String get(String symbol){
        return orderBook.get(symbol);
    }
}
