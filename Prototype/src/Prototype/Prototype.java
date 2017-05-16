package Prototype;

/**
 * Created by ll on 2017/5/15.
 */
public class Prototype implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype= (Prototype) super.clone();
        return super.clone();
    }
}
