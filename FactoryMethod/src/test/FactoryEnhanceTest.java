package test;

import factory.SendFactoryEnhance;
import target.service.Sender;

/**
 * Created by ll on 2017/5/12.
 */
public class FactoryEnhanceTest {
    public static void main(String[] args) {
        SendFactoryEnhance factoryEnhance=new SendFactoryEnhance();
        Sender sender=factoryEnhance.produceSms();
        sender.Send();
    }
}
