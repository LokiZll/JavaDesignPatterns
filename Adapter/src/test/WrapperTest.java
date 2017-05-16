package test;

import target.service.impl.Wrapper;
import target.service.TargetAble;
import source.service.impl.Source;

/**
 * Created by ll on 2017/5/15.
 */
public class WrapperTest {
    public static void main(String[] args) {
        Source source =new Source();
        TargetAble targetable=new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
