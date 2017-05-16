package Storage;


import Memento.Memento;

/**
 * Created by ll on 2017/5/16.
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento){
        this.memento=memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
