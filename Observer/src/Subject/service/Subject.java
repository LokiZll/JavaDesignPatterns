package Subject.service;

import Observer.service.Observer;

/**
 * Created by ll on 2017/5/15.
 */
public interface Subject {
    /*增加观察者*/
    void add(Observer observer);

    /*删除观察者*/
    void del(Observer observer);

    /*通知所有的观察者*/
    void notifyObservers();

    /*自身操作*/
    void operation();
}
