package test;

import Context.Context;
import Expression.service.impl.Minus;
import Expression.service.impl.Plus;

/**
 * Created by ll on 2017/5/16.
 */
public class InterpreterTest {
    public static void main(String[] args) {
        int result=new Minus().interpret(new Context(new Plus().interpret(new Context(4,9)),3));
        System.out.println("result = " + result);
    }
}
