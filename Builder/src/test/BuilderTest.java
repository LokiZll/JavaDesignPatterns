package test;

import builder.Builder;

/**
 * Created by ll on 2017/5/13.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder=new Builder();
        builder.produceMailSender(4);
    }
}
