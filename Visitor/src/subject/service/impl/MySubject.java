package subject.service.impl;

import subject.service.Subject;
import visitor.service.Visitor;

/**
 * Created by ll on 2017/5/16.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "g";
    }
}
