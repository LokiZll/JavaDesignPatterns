package visitor.service.impl;

import subject.service.Subject;
import visitor.service.Visitor;

/**
 * Created by ll on 2017/5/16.
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject subject) {
        System.out.println("subject = " + subject.getSubject());
    }
}
