package vn.com.kyber.common;

public class SymbolFactory {
    public static String[] symbols = {"ETHBTC", "LTCBTC", "BNBBTC", "QTUMETH"};
    public static int index = 0;

    public static synchronized String getNext(){
        index = (index+1) % symbols.length;
        return symbols[index];
    }
}
