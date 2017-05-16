package test;

import Collection.service.Collection;
import Collection.service.impl.MyCollection;
import Iterator.service.Iterator;

/**
 * Created by ll on 2017/5/16.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection collection=new MyCollection();
        Iterator it=collection.iterator();

        while (it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }
    }
}
