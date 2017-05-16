package target.service.impl;

import target.service.Sender;

/**
 * Created by ll on 2017/5/13.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("SmsSender.send");
    }
}
