package Command.service.impl;

import Command.service.Command;
import Receiver.Receiver;

/**
 * Created by ll on 2017/5/16.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
