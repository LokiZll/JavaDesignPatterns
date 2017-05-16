package User;


import Mediator.service.Mediator;

/**
 * Created by ll on 2017/5/16.
 */
public abstract class User {
    private Mediator mediator;

    public User(Mediator mediator){
        this.mediator=mediator;
    }

    public abstract void work();
}
