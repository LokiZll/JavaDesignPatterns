package test;

import subject.service.Subject;
import subject.service.impl.MySubject;
import visitor.service.Visitor;
import visitor.service.impl.MyVisitor;

/**
 * Created by ll on 2017/5/16.
 */
public class VisitorTest  {
    public static void main(String[] args) {
        Visitor visitor=new MyVisitor();
        Subject sub=new MySubject();
        visitor.visit(sub);
    }
}
