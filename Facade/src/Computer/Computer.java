package Computer;

import CPU.CPU;
import Disk.Disk;
import Memory.Memory;

/**
 * Created by ll on 2017/5/15.
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu=new CPU();
        memory=new Memory();
        disk=new Disk();
    }

    public void startUp(){
        System.out.println("start the computer!");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        System.out.println("start the computer finish!");
    }

    public void shutDown(){
        System.out.println("begin to close the computer!");
        cpu.shutDown();
        memory.shutdown();
        disk.shutDown();
        System.out.println("computer closed!");
    }
}
