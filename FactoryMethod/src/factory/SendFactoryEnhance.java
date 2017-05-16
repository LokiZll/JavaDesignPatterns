package factory;

import target.service.Sender;
import target.service.impl.MailSender;
import target.service.impl.SmsSender;

/**
 * Created by ll on 2017/5/12.
 */
public class SendFactoryEnhance {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
