package State;

/**
 * Created by ll on 2017/5/16.
 * 状态类的核心
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("State.method1");
    }

    public void method2(){
        System.out.println("State.method2");
    }
}
