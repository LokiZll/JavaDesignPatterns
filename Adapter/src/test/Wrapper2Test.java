package test;

import source.service.impl.SourceSub1;
import source.service.impl.SourceSub2;
import source.service.SourceAble;

/**
 * Created by ll on 2017/5/15.
 */
public class Wrapper2Test {
    public static void main(String[] args) {
        SourceAble source1=new SourceSub1();
        SourceAble source2=new SourceSub2();
        source1.method1();
        source2.method2();
    }
}
