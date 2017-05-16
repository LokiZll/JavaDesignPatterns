package provider.service.impl;

import provider.service.Provider;
import sender.service.Sender;
import sender.service.impl.MailSender;

/**
 * Created by ll on 2017/5/12.
 */
public class SendMailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
