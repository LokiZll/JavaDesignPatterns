/**
 * Created by ll on 2017/5/12.
 */
public class SingletonTest4 {

    /*定义一个私有的构造方法*/
    private SingletonTest4(){}

    /*定义一个静态私有变量(不初始化，不实用final关键字，使用volatile保证了多线程访问时
    *instance变量的可见性，避免了instance初始化时其他变量属性还没赋值完被另外线程调用)
    * */
    private static volatile SingletonTest4 instance;

    public static SingletonTest4 getInstance(){
        /*对象实例化时与否判断(不实用同步代码块，instance不等于null时直接返回对象，提高运行效率)*/
        if(instance==null){
            /*同步代码块(对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复创建)*/
            synchronized (SingletonTest4.class){
                /*未初始化，则初始instance变量*/
                if(instance==null){
                    instance=new SingletonTest4();
                }
            }
        }
        return instance;
    }
}
