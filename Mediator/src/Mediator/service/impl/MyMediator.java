package Mediator.service.impl;

import Mediator.service.Mediator;

/**
 * Created by ll on 2017/5/16.
 */
public class MyMediator implements Mediator {
    private User.User1 user1;
    private User.User2 user2;

    public void createMediator() {
        user1=new User.User1(this);
        user2=new User.User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
