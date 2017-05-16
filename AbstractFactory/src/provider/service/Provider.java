package provider.service;

import sender.service.Sender;

/**
 * Created by ll on 2017/5/12.
 */
public interface Provider {
    public Sender produce();
}
