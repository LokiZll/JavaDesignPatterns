/**
 * Created by ll on 2017/5/12.
 *方法三为方法二的简单优化
 *优点是：使用synchronized关键字避免多线程访问时，出现多个SingletonTest实例。
 *缺点是：同步方法频繁调用时，效率略低。
 */
public class SingletonTest3 {

    /*定义私有构造方法(防止通过new SingletonTest3去实例化)*/
    private SingletonTest3(){}

    /*定义一个SingletonTest3类型的变量,不初始化*/
    private static SingletonTest3 instance;

    public static synchronized SingletonTest3 getInstance(){
        if(instance==null){
            instance=new SingletonTest3();
        }
        return instance;
    }
}
