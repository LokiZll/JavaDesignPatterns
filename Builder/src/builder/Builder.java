package builder;

import target.service.Sender;
import target.service.impl.MailSender;
import target.service.impl.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ll on 2017/5/13.
 */
public class Builder {
    private List<Sender> list=new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            MailSender mailSender=new MailSender();
            mailSender.send();
            list.add(mailSender);
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count ; i++) {
            list.add(new SmsSender());
        }
    }
}
