package Test;

import Command.service.Command;
import Command.service.impl.MyCommand;
import Invoker.Invoker;
import Receiver.Receiver;

/**
 * Created by ll on 2017/5/16.
 */
public class CommandText {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command cmd=new MyCommand(receiver);
        Invoker invoker=new Invoker(cmd);
        invoker.action();
    }
}
