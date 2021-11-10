package vn.com.kyber.service;

import org.springframework.stereotype.Service;
import vn.com.kyber.common.BApiTemplate;
import vn.com.kyber.common.BCache;

@Service
public class OrderService {
    public String getOrderBook(String symbol){
        int numTry = 0;
        while (numTry++ < 3){
            String data = BCache.get(symbol);
            if (data != null){
                return data;
            }
        }
        return null;
    }
}
