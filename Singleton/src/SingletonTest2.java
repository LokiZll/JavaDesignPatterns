/**
 * Created by ll on 2017/5/12.
 * 方法二就是传说的中的饱汉模式
 *优点是：写起来比较简单，当类SingletonTest被加载的时候，静态变量static的instance未被创建并分配内存空间，
 *      当getInstance方法第一次被调用时，初始化instance变量，并分配内存，因此在某些特定条件下会节约了内存；
 *缺点是：并发环境下很可能出现多个SingletonTest实例。
 */
public class SingletonTest2 {

    /*定义私有构造方法(防止通过new SingletonTest2()去实例化）*/
    private SingletonTest2(){}

    /*定义一个SingletonTest类型的变量(不初始化，注意这里没有使用final关键字)*/
    private static SingletonTest2 instance;

    /*定义一个静态的方法(调用时再初始化SingletonTest,但是多线程访问时可能会造成重复初始化问题)*/
    public static SingletonTest2 getInstance(){
       if(instance==null){
           instance=new SingletonTest2();
       }
       return instance;
    }
}
