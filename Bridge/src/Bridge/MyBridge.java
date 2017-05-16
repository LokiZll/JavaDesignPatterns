package Bridge;

/**
 * Created by ll on 2017/5/15.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
