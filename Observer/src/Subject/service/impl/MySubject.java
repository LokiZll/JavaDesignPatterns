package Subject.service.impl;

import Subject.service.Subject;

/**
 * Created by ll on 2017/5/15.
 */
public class MySubject extends AbstractSubject implements Subject{
    @Override
    public void operation() {
        System.out.println("MySubject.operation");
        notifyObservers();
    }
}
