package test;

import provider.service.Provider;
import sender.service.Sender;
import provider.service.impl.SendMailFactory;

/**
 * Created by ll on 2017/5/12.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider=new SendMailFactory();
        Sender sender=provider.produce();
        sender.Send();
    }
}
