package Collection.service.impl;

import Collection.service.Collection;
import Iterator.service.Iterator;
import Iterator.service.impl.MyIterator;

/**
 * Created by ll on 2017/5/16.
 */
public class MyCollection implements Collection {
    public String string[]={"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
