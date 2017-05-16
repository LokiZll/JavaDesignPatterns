package test;

import target.service.Sender;
import factory.SendFactory;

/**
 * Created by ll on 2017/5/12.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory=new SendFactory();
        Sender sender=factory.produce("sms");
        sender.Send();
    }
}
