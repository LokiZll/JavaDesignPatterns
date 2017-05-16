package User;


import Mediator.service.Mediator;

/**
 * Created by ll on 2017/5/16.
 */
public class User1 extends User {
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("User1.work");
    }
}
