package test;

import decorator.Decorator;
import source.service.SourceAble;
import source.service.impl.Source;

/**
 * Created by ll on 2017/5/15.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        SourceAble source=new Source();
        SourceAble obj=new Decorator(source);
        obj.method();
    }
}
