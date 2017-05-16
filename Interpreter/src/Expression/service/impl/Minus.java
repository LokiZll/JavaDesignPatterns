package Expression.service.impl;

import Context.Context;
import Expression.service.Expression;

/**
 * Created by ll on 2017/5/16.
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
