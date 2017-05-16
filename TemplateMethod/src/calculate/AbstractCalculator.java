package calculate;

/**
 * Created by ll on 2017/5/15.
 */
public abstract class AbstractCalculator {

    /*主方法，实现本类怼其他方法的调用*/
    public final int calculate(String exp,String opt){
        int arrayInt[]=split(exp,opt);
        return calculate(arrayInt[0],arrayInt[1]);
    }

    /*配子类重写的方法*/
    abstract public int calculate(int num1,int num2);

    public int[] split(String exp,String opt){
        String array[]=exp.split(opt);
        int arrayInt[]=new int[2];
        arrayInt[0]=Integer.parseInt(array[0]);
        arrayInt[1]=Integer.parseInt(array[1]);
        return arrayInt;
    }
}
