package subject.service;

import visitor.service.Visitor;

/**
 * Created by ll on 2017/5/16.
 */
public interface Subject {
    void accept(Visitor visitor);

    String getSubject();
}
