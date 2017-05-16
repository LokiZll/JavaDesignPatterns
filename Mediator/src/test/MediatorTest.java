package test;

import Mediator.service.Mediator;
import Mediator.service.impl.MyMediator;

/**
 * Created by ll on 2017/5/16.
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator=new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
