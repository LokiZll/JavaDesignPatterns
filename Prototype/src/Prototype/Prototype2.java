package Prototype;

import java.io.*;

/**
 * Created by ll on 2017/5/15.
 */
public class Prototype2 implements Cloneable,Serializable {
    private static final long serialVersionUID=1l;
    private String string;

    private Serializable obj;

    /*浅复制*/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype2 prototype2= (Prototype2) super.clone();
        return prototype2;
    }

    /*深复制*/
    public Object deepClone() throws IOException, ClassNotFoundException {
        /*写入当前对象的二进制流*/
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(this);

        /*读出二进制流产生新的对象*/
        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Serializable getObj() {
        return obj;
    }

    public void setObj(Serializable obj) {
        this.obj = obj;
    }
}

class SerializableObject implements Serializable{
    private static final long serialVersionUID=1L;
}