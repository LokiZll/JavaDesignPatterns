package test;

import Bridge.Bridge;
import Bridge.MyBridge;
import source.service.SourceAble;
import source.service.impl.SourceStub1;
import source.service.impl.SourceStub2;

/**
 * Created by ll on 2017/5/15.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge=new MyBridge();

        /*调用第一个对象*/
        SourceAble source1=new SourceStub1();
        bridge.setSource(source1);
        bridge.method();

        SourceAble source2=new SourceStub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
