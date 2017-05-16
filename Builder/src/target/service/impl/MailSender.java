package target.service.impl;

import target.service.Sender;

/**
 * Created by ll on 2017/5/13.
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("MailSender.send");
    }
}
