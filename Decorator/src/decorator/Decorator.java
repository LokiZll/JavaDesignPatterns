package decorator;

import source.service.SourceAble;

/**
 * Created by ll on 2017/5/15.
 */
public class Decorator implements SourceAble {
    private SourceAble source;

    public Decorator(SourceAble source){
        super();
        this.source=source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
