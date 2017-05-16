package Observer.service.impl;

import Observer.service.Observer;

/**
 * Created by ll on 2017/5/15.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1.update");
    }
}
