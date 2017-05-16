package Invoker;

import Command.service.Command;

/**
 * Created by ll on 2017/5/16.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command=command;
    }

    public void action(){
        command.exe();
    }
}
