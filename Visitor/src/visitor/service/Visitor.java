package visitor.service;

import subject.service.Subject;

/**
 * Created by ll on 2017/5/16.
 */
public interface Visitor {
    void visit(Subject subject);
}
