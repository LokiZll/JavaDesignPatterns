package test;

import Original.Original;
import Storage.Storage;

/**
 * Created by ll on 2017/5/16.
 */
public class MementoTest {
    public static void main(String[] args) {
        /*创建原始类*/
        Original original=new Original("egg");

        /*创建备忘录*/
        Storage storage=new Storage(original.createMemento());

        /*修改原始类状态*/
        System.out.println("初始化状态为： " + original.getValue());
        original.setValue("pig");
        System.out.println("修改后的状态为： " + original.getValue());

        /*恢复原始类状态*/
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为： " + original.getValue());
    }
}
