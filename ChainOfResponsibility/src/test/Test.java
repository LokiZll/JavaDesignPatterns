package test;

import Handler.service.impl.MyHandler;

/**
 * Created by ll on 2017/5/16.
 */
public class Test {
    public static void main(String[] args) {
        MyHandler h1=new MyHandler("h1");
        MyHandler h2=new MyHandler("h2");
        MyHandler h3=new MyHandler("h3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}
