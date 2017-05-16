package target.service.impl;

import target.service.Sender;

/**
 * Created by ll on 2017/5/12.
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("MailSender.Send");
    }
}
