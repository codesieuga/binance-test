package vn.com.kyber.common;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import vn.com.kyber.model.BOrderBookResp;

@Component
public class BApiTemplate {
    private static String baseURL = "https://api1.binance.com/";
    final static RestTemplate restTemplate = new RestTemplate();

    public BApiTemplate() {
    }

    public static String getOrderBook(String symbol){
        String URL = baseURL + "api/v3/depth?symbol="+symbol+"&limit=10";
        System.out.println(URL);
        String resp = restTemplate.getForObject(URL, String.class);
        return resp;
    }
}
