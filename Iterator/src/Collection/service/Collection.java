package Collection.service;

import Iterator.service.Iterator;

/**
 * Created by ll on 2017/5/16.
 */
public interface Collection {
    Iterator iterator();

    /*取得集合元素*/
    Object get(int i);

    /*取得集合大小*/
    int size();
}
