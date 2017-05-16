package test;

import Observer.service.impl.Observer1;
import Observer.service.impl.Observer2;
import Subject.service.impl.MySubject;
import Subject.service.Subject;

/**
 * Created by ll on 2017/5/15.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject mySubject=new MySubject();
        mySubject.add(new Observer1());
        mySubject.add(new Observer2());
        mySubject.operation();
    }
}
