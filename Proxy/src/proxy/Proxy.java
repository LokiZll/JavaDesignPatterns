package proxy;

import source.service.SourceAble;
import source.service.impl.Source;

/**
 * Created by ll on 2017/5/15.
 */
public class Proxy implements SourceAble {

    private Source source;

    public Proxy(){
        super();
        this.source=new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after(){
        System.out.println("Proxy.after");
    }

    private void before(){
        System.out.println("Proxy.before");
    }
}
