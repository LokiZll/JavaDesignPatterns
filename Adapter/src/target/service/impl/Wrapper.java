package target.service.impl;

import target.service.TargetAble;
import source.service.impl.Source;

/**
 * Created by ll on 2017/5/15.
 */
public class Wrapper extends Source implements TargetAble {
    private Source source;

    public Wrapper(Source source){
        super();
        this.source=source;
    }

    @Override
    public void method2() {
        System.out.println("Wrapper.method2");
    }

    @Override
    public void method1() {
        super.method1();
    }
}
