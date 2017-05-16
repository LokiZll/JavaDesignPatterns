package test;

import factory.SendFactoryStatic;
import target.service.Sender;

/**
 * Created by ll on 2017/5/12.
 */
public class FactoryStaticTest {
    public static void main(String[] args) {
        Sender sender=SendFactoryStatic.produceMail();
        sender.Send();
    }
}
