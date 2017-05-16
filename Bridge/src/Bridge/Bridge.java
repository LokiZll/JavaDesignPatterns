package Bridge;

import source.service.SourceAble;

/**
 * Created by ll on 2017/5/15.
 */
public abstract class Bridge {
    private SourceAble source;

    public void method(){
        source.method();
    }

    public SourceAble getSource() {
        return source;
    }

    public void setSource(SourceAble source) {
        this.source = source;
    }
}
