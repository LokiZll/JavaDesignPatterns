package Original;

import Memento.Memento;

/**
 * Created by ll on 2017/5/16.
 */
public class Original {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value){
        this.value=value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value=memento.getValue();
    }
}
