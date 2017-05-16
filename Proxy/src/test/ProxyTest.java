package test;


import proxy.Proxy;
import source.service.SourceAble;

/**
 * Created by ll on 2017/5/15.
 */
public class ProxyTest {
    public static void main(String[] args) {
        SourceAble source=new Proxy();
        source.method();
    }
}
