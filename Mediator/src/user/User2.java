package User;


import Mediator.service.Mediator;

/**
 * Created by ll on 2017/5/16.
 */
public class User2 extends User{

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("User2.work");
    }
}
