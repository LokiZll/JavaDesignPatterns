package provider.service.impl;

import provider.service.Provider;
import sender.service.Sender;
import sender.service.impl.SmsSender;

/**
 * Created by ll on 2017/5/12.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
