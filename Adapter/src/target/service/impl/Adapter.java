package target.service.impl;

import target.service.TargetAble;
import source.service.impl.Source;

/**
 * Created by ll on 2017/5/15.
 */
public class Adapter extends Source implements TargetAble {
    @Override
    public void method2() {
        System.out.println("Adapter.method2");
    }
}
