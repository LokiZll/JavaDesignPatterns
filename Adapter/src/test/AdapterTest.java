package test;

import target.service.impl.Adapter;
import target.service.TargetAble;

/**
 * Created by ll on 2017/5/15.
 */
public class AdapterTest {
    public static void main(String[] args) {
        TargetAble targetable=new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
