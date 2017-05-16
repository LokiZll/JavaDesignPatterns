package factory;

import target.service.Sender;
import target.service.impl.MailSender;
import target.service.impl.SmsSender;

/**
 * Created by ll on 2017/5/12.
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确地类型");
            return null;
        }
    }
}
